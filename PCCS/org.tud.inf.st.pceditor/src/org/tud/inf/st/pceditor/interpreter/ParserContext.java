package org.tud.inf.st.pceditor.interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jparsec.Parser;
import org.codehaus.jparsec.Terminals;
import org.codehaus.jparsec.misc.Mapper;
import org.eclipse.emf.ecore.EObject;
import org.tud.inf.st.pceditor.emf.PCCSResourceFactoryImpl.PCCSResourceImpl;
import org.tud.inf.st.pceditor.exceptions.DoubleParserDefinitionException;

class ParserContext {

	private Terminals terms;
	private Map<String, Object> parsers = new HashMap<String, Object>();
	private Map<EObject, Location> locations = new HashMap<>();
	private PCCSResourceImpl r;

	public ParserContext(Terminals terms, PCCSResourceImpl r) {
		this.terms = terms;
		this.r = r;
	}
	
	public PCCSResourceImpl getResource(){
		return r;
	}

	public void locate(EObject eo, int idx, int l) {
		locations.put(eo, new Location(idx, l));
	}

	public Map<EObject, Location> getLocations() {
		return locations;
	}

	public void clear() {
		locations.clear();
	}

	public Parser<?> getParser(String name) {
		Object p = parsers.get(name);
		if (p == null) {
			p = Parser.newReference();
			parsers.put(name, p);
		}
		if (p instanceof Parser.Reference<?>) {
			return ((Parser.Reference<?>) p).lazy();
		} else
			return (Parser<?>) p;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addParser(String name, Parser<?> parser)
			throws DoubleParserDefinitionException {
		Object p = parsers.get(name);
		if (p != null) {
			if (p instanceof Parser.Reference<?>) {
				((Parser.Reference) p).set((Parser<?>) parser);				
			} else
				throw new DoubleParserDefinitionException(name);
		} else
			parsers.put(name, parser);
	}

	public Parser<?> term(String t) {
		return Mapper._(terms.token(t)).map(
				new org.codehaus.jparsec.functors.Map<Object, String>() {
					@Override
					public String map(Object from) {
						return from.toString();
					}
				});

	}

	public Parser<Object> tokenizer() {
		return terms.tokenizer();
	}
	

	private static List<String> qName(EObject o) {
		List<String> qName = new ArrayList<>();
		if (o.eContainer() != null) {
			List<String> prefix = qNameIgnoreNull(o.eContainer());
			if (prefix != null) {
				qName.addAll(prefix);
			}
		}
		if (o.eClass().getEIDAttribute() == null)
			return null;

		Object id = o.eGet(o.eClass().getEIDAttribute());
		if (id == null)
			return null;

		qName.add(id + "");
		return qName;
	}
	
	private static List<String> qNameIgnoreNull(EObject o) {
		List<String> qName = new ArrayList<>();
		if (o.eContainer() != null) {
			List<String> prefix = qName(o.eContainer());
			if (prefix != null) {
				qName.addAll(prefix);
			}
		}
		if (o.eClass().getEIDAttribute() == null)
			return qName;

		Object id = o.eGet(o.eClass().getEIDAttribute());
		if (id == null)
			return qName;

		qName.add(id + "");
		return qName;
	}

}