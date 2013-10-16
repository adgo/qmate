package org.tud.inf.st.pceditor.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.DefaultTextHover;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.DefaultAnnotationHover;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.tud.inf.st.pccs.AsQName;
import org.tud.inf.st.pccs.ConcreteSyntax;
import org.tud.inf.st.pccs.Terminal;
import org.tud.inf.st.pceditor.emf.PCCSResourceSetImpl;

public class PCCSSourceViewerConfiguration extends SourceViewerConfiguration {
	private ConcreteSyntax syntax[];
	private PCCSScanner scanner;
	private SourceViewer viewer;
	private PCCSResourceSetImpl resourceSet;
	private Set<String> seperators;

	public PCCSSourceViewerConfiguration(ConcreteSyntax[] syntax,
			SourceViewer viewer, PCCSResourceSetImpl rs) {
		this.syntax = syntax;
		this.scanner = new PCCSScanner();
		this.viewer = viewer;
		this.resourceSet = rs;
	}

	@Override
	public IPresentationReconciler getPresentationReconciler(
			ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();
		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(scanner);
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
		return reconciler;
	}

	private class PCCSScanner extends RuleBasedScanner {
		public PCCSScanner() {
			final IToken kwToken = new Token(new TextAttribute(new Color(
					Display.getDefault(), 0, 0, 255), null, SWT.BOLD));
			final IToken opToken = new Token(new TextAttribute(new Color(
					Display.getDefault(), 0, 0, 255)));
			final IToken strToken = new Token(new TextAttribute(new Color(
					Display.getDefault(), 255, 100, 0)));
			final IToken cmtToken = new Token(new TextAttribute(new Color(
					Display.getDefault(), 205, 0, 205)));

			IRule kwRule;
			{
				final List<Character> relevant = new ArrayList<>();

				for (ConcreteSyntax cs : syntax)
					for (Object t : cs.getKeywords()) {
						String tt = ((Terminal) t).getTerminal();
						for (Character c : tt.toCharArray())
							relevant.add(c);
					}

				relevant.add('_');

				kwRule = new IRule() {
					public IToken evaluate(ICharacterScanner scanner) {
						List<Character> chars = relevant;

						int c = scanner.read();
						if (c != ICharacterScanner.EOF
								&& chars.contains((char) c)) {
							StringBuffer fBuffer = new StringBuffer();

							fBuffer.setLength(0);
							do {
								fBuffer.append((char) c);
								c = scanner.read();
							} while (c != ICharacterScanner.EOF
									&& chars.contains((char) c));
							scanner.unread();

							String buffer = fBuffer.toString();

							for (ConcreteSyntax cs : syntax)
								for (Object t : cs.getKeywords()) {
									String tt = ((Terminal) t).getTerminal();
									if (buffer.equals(tt))
										return kwToken;
								}

						}

						scanner.unread();
						return Token.UNDEFINED;
					}
				};
			}

			IRule opRule;
			{
				final List<Character> relevant = new ArrayList<>();
				for (ConcreteSyntax cs : syntax)
					for (Object t : cs.getOperators()) {

						String tt = ((Terminal) t).getTerminal();
						for (Character c : tt.toCharArray())
							relevant.add(c);
					}

				opRule = new IRule() {
					public IToken evaluate(ICharacterScanner scanner) {
						List<Character> chars = relevant;

						int c = scanner.read();
						if (c != ICharacterScanner.EOF
								&& chars.contains((char) c)) {
							StringBuffer fBuffer = new StringBuffer();

							fBuffer.setLength(0);
							do {
								fBuffer.append((char) c);

								String buffer = fBuffer.toString();

								for (ConcreteSyntax cs : syntax)
									for (Object t : cs.getOperators()) {
										String tt = ((Terminal) t)
												.getTerminal();
										if (buffer.equals(tt))
											return opToken;
									}

								c = scanner.read();
							} while (c != ICharacterScanner.EOF
									&& chars.contains((char) c));
							scanner.unread();
						}

						scanner.unread();
						return Token.UNDEFINED;
					}
				};
			}

			IRule strRule;
			{
				strRule = new IRule() {
					public IToken evaluate(ICharacterScanner scanner) {
						int c = scanner.read();
						if (c == '\'' || c == '\"') {
							StringBuffer fBuffer = new StringBuffer();

							fBuffer.setLength(0);
							do {
								fBuffer.append((char) c);
								c = scanner.read();
							} while (c != '\'' && c != '\"'
									&& c != ICharacterScanner.EOF);

							return strToken;

						}

						scanner.unread();
						return Token.UNDEFINED;
					}
				};
			}

			IRule cmtRule;
			{
				cmtRule = new IRule() {
					private String sls = syntax[0]
							.getSingleLineCommentIndicationStart();
					private String mls = syntax[0]
							.getMultiLineCommentIndicationStart();
					private String mle = syntax[0]
							.getMultiLineCommentIndicationEnd();

					public IToken evaluate(ICharacterScanner scanner) {
						char[] slsArr = sls != null ? sls.toCharArray() : null;
						char[] mlsArr = mls != null ? mls.toCharArray() : null;

						int c = scanner.read();

						if (mlsArr != null && mlsArr[0] == c) {
							int match = 1;
							for (; match < mlsArr.length
									&& scanner.read() == mlsArr[match]; match++)
								;
							if (match == mlsArr.length) {
								StringBuffer fBuffer = new StringBuffer();
								do {
									fBuffer.append(c = scanner.read());
								} while (c != ICharacterScanner.EOF
										&& !fBuffer.toString().endsWith(mle));

								return cmtToken;
							} else
								scanner.unread();

						}

						if (slsArr != null && slsArr[0] == c) {
							int match = 1;
							for (; match < slsArr.length
									&& scanner.read() == slsArr[match]; match++)
								;
							if (match == slsArr.length) {
								StringBuffer fBuffer = new StringBuffer();
								do {
									fBuffer.append(c = scanner.read());
								} while (c != ICharacterScanner.EOF
										&& c != '\n');

								return cmtToken;
							}
						}

						scanner.unread();
						return Token.UNDEFINED;
					}
				};
			}

			setRules(new IRule[] { cmtRule, kwRule, opRule, strRule });
		}
	}

	private Set<String> getAllSeperators() {
		if (this.seperators != null)
			return this.seperators;
		Set<String> seperators = new HashSet<>();

		for (ConcreteSyntax cs : syntax) {
			Iterator<EObject> i = cs.eAllContents();
			while (i.hasNext()) {
				EObject next = i.next();
				if (next instanceof AsQName) {
					seperators.add(((AsQName) next).getDelim());
				}
			}
		}

		this.seperators = seperators;

		return seperators;
	}

	private Set<String> getAllOperators() {
		Set<String> ops = new HashSet<>();

		for (ConcreteSyntax cs : syntax)
			for (Object o : cs.getOperators()) {
				ops.add(((Terminal) o).getTerminal());
			}
		return ops;
	}

	@Override
	public ITextHover getTextHover(ISourceViewer sourceViewer,
			String contentType) {
		return new DefaultTextHover(sourceViewer);
	}

	@Override
	public IAnnotationHover getAnnotationHover(ISourceViewer sourceViewer) {
		return new DefaultAnnotationHover();
	}

	@Override
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
		ContentAssistant ca = new ContentAssistant();
		IContentAssistProcessor cap = new IContentAssistProcessor() {

			public ICompletionProposal[] computeCompletionProposals(
					ITextViewer viewer, int offset) {
				final String prefix = getTypedPrefix(
						viewer.getDocument().get(), offset);

				List<ICompletionProposal> proposals = new LinkedList<>();

				Comparator<ICompletionProposal> comperator = new Comparator<ICompletionProposal>() {

					public int compare(ICompletionProposal o1,
							ICompletionProposal o2) {
						String p = prefix.substring(0, Math.min(o1
								.getDisplayString().length() - 1, Math.max(0,
								prefix.length() - 1)));
						String s1 = o1.getDisplayString();
						String s2 = o2.getDisplayString();

						return StringUtils.getCommonPrefix(s1, p).length()
								- StringUtils.getCommonPrefix(s2, p).length();

					}

				};
				for (ConcreteSyntax cs : syntax) {
					for (Object o : cs.getKeywords()) {
						String s = ((Terminal) o).getTerminal() + " ";
						proposals.add(new CompletionProposal(" " + s, offset
								- prefix.length(), prefix.length(), s.length(),
								null, s, null, null));
					}
					for (Object o : cs.getOperators()) {
						String s = ((Terminal) o).getTerminal() + " ";
						proposals.add(new CompletionProposal(" " + s, offset
								- prefix.length(), prefix.length(), s.length(),
								null, s, null, null));
					}
				}

				if (resourceSet != null) {
					for (String s : resourceSet.getAllObjectPaths()) {
						s += " ";
						if (!s.contains("/")) {
							proposals.add(new CompletionProposal(" " + s,
									offset - prefix.length(), prefix.length(),
									s.length(), null, s, null, null));
						} else {
							for (String sep : getAllSeperators()) {
								s = s.replaceAll("/", sep);
								proposals.add(new CompletionProposal(" " + s,
										offset - prefix.length(), prefix
												.length(), s.length(), null, s,
										null, null));
							}
						}
					}
				}

				Collections.sort(proposals, comperator);
				return proposals.toArray(new ICompletionProposal[0]);
			}

			private String getTypedPrefix(String s, int offset) {
				if (offset == 0)
					return "";
				String before = s.charAt(offset - 1) + "";
				if (before.equals(" ") || before.equals("\t")
						|| getAllOperators().contains(before))
					return " ";
				else
					return getTypedPrefix(s, offset - 1) + before;
			}

			public IContextInformation[] computeContextInformation(
					ITextViewer viewer, int offset) {
				return null;
			}

			public char[] getCompletionProposalAutoActivationCharacters() {
				return null;
			}

			public char[] getContextInformationAutoActivationCharacters() {
				return null;
			}

			public String getErrorMessage() {
				return null;
			}

			public IContextInformationValidator getContextInformationValidator() {
				return null;
			}

		};
		ca.setContentAssistProcessor(cap, IDocument.DEFAULT_CONTENT_TYPE);
		ca.setInformationControlCreator(getInformationControlCreator(viewer));

		return ca;
	}
}
