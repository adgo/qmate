package org.tud.inf.st.mbt.emf.validation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IMarker;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.tud.inf.st.mbt.actions.PreGenerationAction;
import org.tud.inf.st.mbt.actions.PreGenerationSequence;
import org.tud.inf.st.mbt.actions.ReconfigurationAction;
import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.mbt.ocm.ReconfigurationActionNode;
import org.tud.inf.st.mbt.rules.Predicate;
import org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;
import org.tud.inf.st.pccs.ConcreteSyntax;
import org.tud.inf.st.pceditor.emf.PCCSResourceFactoryImpl.PCCSResourceImpl;
import org.tud.inf.st.pceditor.emf.PCCSResourceSetImpl;
import org.tud.inf.st.pceditor.interpreter.PCCSInterpreter;
import org.tud.inf.st.pceditor.interpreter.ParserError;
import org.tud.inf.st.pceditor.interpreter.ParserResult;
import org.tud.inf.st.pceditor.interpreter.ParserWrapper;
import org.tud.inf.st.pceditor.interpreter.Util;

public class ParsingConstraint implements IValidationConstraint {

	private Map<ResourceSet, ParserWrapper> actionParsers = new HashMap<ResourceSet, ParserWrapper>();
	private Map<ResourceSet, ParserWrapper> rulesParsers = new HashMap<ResourceSet, ParserWrapper>();
	private Map<ResourceSet, ParserWrapper> reconfParsers = new HashMap<ResourceSet, ParserWrapper>();

	@Override
	public void validate(ValidationManager mgr, ResourceSet rsContent) {
	if (!(rsContent instanceof PCCSResourceSetImpl))
			return;
	
		Util.registerPCCSExtensions();

		try {
			ParserWrapper actionParser = actionParsers.get(rsContent);
			if (actionParser == null) {
				PCCSResourceSetImpl rs = new PCCSResourceSetImpl();
				rs.createResource(URI
						.createURI("platform:/plugin/org.tud.inf.st.mbt.emf/syntax/actions.pccs"));
				rs.resolveImports();
				rs.computeReferenceErrors();
				ConcreteSyntax[] ueSyntax = Util.filterConcreteSyntax(rs);

				actionParser = PCCSInterpreter.interpret(ueSyntax,
						(PCCSResourceImpl) rsContent.createResource(
								URI.createURI("temp://action.parser.resource"),
								PCCSResourceSetImpl.CONTENT_TYPE_MANUAL));
				actionParsers.put(rsContent, actionParser);
			}

			ParserWrapper rulesParser = rulesParsers.get(rsContent);
			if (rulesParser == null) {
				PCCSResourceSetImpl rs = new PCCSResourceSetImpl();
				rs.createResource(URI
						.createURI("platform:/plugin/org.tud.inf.st.mbt.emf/syntax/rules.pccs"));
				rs.resolveImports();
				rs.computeReferenceErrors();
				ConcreteSyntax[] acSyntax = Util.filterConcreteSyntax(rs);

				rulesParser = PCCSInterpreter.interpret(acSyntax,
						(PCCSResourceImpl) rsContent.createResource(
								URI.createURI("temp://rules.parser.resource"),
								PCCSResourceSetImpl.CONTENT_TYPE_MANUAL));

				rulesParsers.put(rsContent, rulesParser);
			}
			ParserWrapper reconfParser = reconfParsers.get(rsContent);
			if (reconfParser == null) {
				PCCSResourceSetImpl rs = new PCCSResourceSetImpl();
				rs.createResource(URI
						.createURI("platform:/plugin/org.tud.inf.st.mbt.emf/syntax/reconf.pccs"));
				rs.resolveImports();
				rs.computeReferenceErrors();
				ConcreteSyntax[] acSyntax = Util.filterConcreteSyntax(rs);

				reconfParser = PCCSInterpreter.interpret(acSyntax,
						(PCCSResourceImpl) rsContent.createResource(
								URI.createURI("temp://reconf.parser.resource"),
								PCCSResourceSetImpl.CONTENT_TYPE_MANUAL));

				reconfParsers.put(rsContent, reconfParser);
			}

			Collection<ReconfigurationActionNode> rans = ModelUtil
					.getAllEObjectsOfSuperType(rsContent,
							ReconfigurationActionNode.class);
			
			for (ReconfigurationActionNode ran : rans) {
					reconfParser.reset();
					ParserResult pr = reconfParser.parse(ran.getActionsText());
					Util.computeReferenceErrors(pr);
					if (pr.getObjects() != null && !pr.getObjects().isEmpty()
							&& pr.getErrors().isEmpty()) {
						ran.getActions().clear();
						PreGenerationSequence pgs = (PreGenerationSequence) pr
								.getObjects().get(0);
						for (PreGenerationAction pga : pgs.getActions()
								.toArray(new PreGenerationAction[0]))
							ran.getActions().add((ReconfigurationAction) pga);
					} else {
						for (ParserError e : pr.getErrors()) {
							mgr.setProblem("Action-based Configuration  \""
									+ ran.getActionsText().replaceAll(
											"\n", " ") + "\" of " + ran
									+ ": " + e.getMessage() + ".", IMarker.SEVERITY_ERROR, ran + "", ran.hashCode()+"");
						}
					}
			}	

			Collection<ConditionActionTransition> cats = ModelUtil
					.getAllEObjectsOfSuperType(rsContent,
							ConditionActionTransition.class);

			for (ConditionActionTransition cat : cats) {
				ParserResult pr = rulesParser.parse(cat
						.getApplicationConditionText());
				Util.computeReferenceErrors(pr);
				if (pr.getObjects() == null || pr.getObjects().isEmpty()
						|| !pr.getErrors().isEmpty()) {
					if (mgr != null)
						for (ParserError pe : pr.getErrors())
							mgr.setProblem(pe.getMessage(),
									IMarker.SEVERITY_ERROR, "" + cat,
									cat.hashCode() + "");
				} else {
					cat.setApplicationCondition((Predicate) pr.getObjects()
							.get(0));
				}
				pr = actionParser.parse(cat.getActionsText());
				Util.computeReferenceErrors(pr);
				if (pr.getObjects() == null || pr.getObjects().isEmpty()
						|| !pr.getErrors().isEmpty()) {
					if (mgr != null)
						for (ParserError pe : pr.getErrors())
							mgr.setProblem(pe.getMessage(),
									IMarker.SEVERITY_ERROR, "" + cat,
									cat.hashCode() + "");
				} else {
					cat.setActions(((PreGenerationSequence) pr.getObjects()
							.get(0)));
				}
			}

			Collection<GuiGraph> ggs = ModelUtil.getAllEObjectsOfSuperType(
					rsContent, GuiGraph.class);

			for (GuiGraph gg : ggs) {
				ParserResult pr = rulesParser.parse(gg.getInvariantText());
				Util.computeReferenceErrors(pr);
				if (pr.getObjects() == null || pr.getObjects().isEmpty()
						|| !pr.getErrors().isEmpty()) {
					if (mgr != null)
						for (ParserError pe : pr.getErrors())
							mgr.setProblem(pe.getMessage(),
									IMarker.SEVERITY_ERROR, "" + gg,
									gg.hashCode() + "");
				} else {
					gg.setInvariant((Predicate) pr.getObjects().get(0));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
