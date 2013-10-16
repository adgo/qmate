package org.tud.inf.st.pceditor.interpreter;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.codehaus.jparsec.OperatorTable;
import org.codehaus.jparsec.Parser;
import org.codehaus.jparsec.Parsers;
import org.codehaus.jparsec.Scanners;
import org.codehaus.jparsec.Terminals;
import org.codehaus.jparsec.Token;
import org.codehaus.jparsec.functors.Binary;
import org.codehaus.jparsec.functors.Map;
import org.codehaus.jparsec.functors.Unary;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.tud.inf.st.pccs.AbstractParser;
import org.tud.inf.st.pccs.AsQName;
import org.tud.inf.st.pccs.Assignment;
import org.tud.inf.st.pccs.BoolParser;
import org.tud.inf.st.pccs.ComposableMapping;
import org.tud.inf.st.pccs.ConcreteSyntax;
import org.tud.inf.st.pccs.DoubleParser;
import org.tud.inf.st.pccs.EcoreMapping;
import org.tud.inf.st.pccs.FloatParser;
import org.tud.inf.st.pccs.IdentifierParser;
import org.tud.inf.st.pccs.IdentityParser;
import org.tud.inf.st.pccs.ImportParser;
import org.tud.inf.st.pccs.InfixOperator;
import org.tud.inf.st.pccs.IntParser;
import org.tud.inf.st.pccs.LeftAssociativeOperator;
import org.tud.inf.st.pccs.LiteralParser;
import org.tud.inf.st.pccs.LongParser;
import org.tud.inf.st.pccs.Mapping;
import org.tud.inf.st.pccs.NonAssociativeOperator;
import org.tud.inf.st.pccs.OperatorTableParser;
import org.tud.inf.st.pccs.OrParser;
import org.tud.inf.st.pccs.ParserDefinition;
import org.tud.inf.st.pccs.PccsFactory;
import org.tud.inf.st.pccs.PostfixOperator;
import org.tud.inf.st.pccs.PrecedenceOperator;
import org.tud.inf.st.pccs.PrefixOperator;
import org.tud.inf.st.pccs.QualifiedName;
import org.tud.inf.st.pccs.RefParser;
import org.tud.inf.st.pccs.ReferenceMapping;
import org.tud.inf.st.pccs.RegularExpression;
import org.tud.inf.st.pccs.RightAssociativeOperator;
import org.tud.inf.st.pccs.SequenceParser;
import org.tud.inf.st.pccs.StringParser;
import org.tud.inf.st.pccs.StringValueMapping;
import org.tud.inf.st.pccs.Terminal;
import org.tud.inf.st.pccs.TerminalParser;
import org.tud.inf.st.pccs.UnaryOperator;
import org.tud.inf.st.pccs.Unit;
import org.tud.inf.st.pceditor.emf.PCCSResourceFactoryImpl.PCCSResourceImpl;
import org.tud.inf.st.pceditor.emf.PCCSResourceSetImpl;
import org.tud.inf.st.pceditor.exceptions.InterpretationException;
import org.tud.inf.st.pceditor.exceptions.RegexException;

public class PCCSInterpreter {
	public static ParserWrapper interpret(final ConcreteSyntax cs,
			final PCCSResourceImpl resource) throws InterpretationException {
		return interpret(new ConcreteSyntax[] { cs }, resource);
	}

	@SuppressWarnings("unchecked")
	public static ParserWrapper interpret(final ConcreteSyntax[] csl,
			final PCCSResourceImpl resource) throws InterpretationException {
		if (csl == null || csl.length < 1)
			return null;

		Set<String> operators = new HashSet<>();

		operators.add("-");

		Set<String> keywords = new HashSet<>();

		for (ConcreteSyntax cs : csl) {
			for (Object o : cs.getOperators()) {
				operators.add(((Terminal) o).getTerminal());
			}

			for (Object o : cs.getKeywords()) {
				String terminal = ((Terminal) o).getTerminal();
				if (operators.contains(terminal))
					throw new RuntimeException("Keyword " + terminal
							+ " is already an operator!");

				keywords.add(terminal);
			}
		}

		final ParserContext ctx = new ParserContext(Terminals.caseSensitive(
				operators.toArray(new String[0]),
				keywords.toArray(new String[0])),resource);

		for (ConcreteSyntax cs : csl) {
			for (Object o : cs.getParsers()) {
				ParserDefinition pd = (ParserDefinition) o;
				Parser<?> p = interpret(ctx, pd.getRule());
				ctx.addParser(pd.getName(), p);
			}
		}

		ConcreteSyntax cs = csl[0];

		Parser<Void> skip = Scanners.WHITESPACES;
		if (cs.getMultiLineCommentIndicationStart() != null) {
			skip = Parsers.plus(
					skip,
					Scanners.blockComment(
							cs.getMultiLineCommentIndicationStart(),
							cs.getMultiLineCommentIndicationEnd()));
		}
		if (cs.getSingleLineCommentIndicationStart() != null) {
			skip = Parsers.plus(skip, Scanners.lineComment(cs
					.getSingleLineCommentIndicationStart()));
		}

		skip = skip.skipMany();

		Parser<?> out = Parsers
				.runnable(new Runnable() {
					public void run() {
						// ctx.clear();
					}
				})
				.next(ctx
						.getParser(cs.getStartwith().getName())
						.from(ctx
								.tokenizer()
								.or(Terminals.StringLiteral.SINGLE_QUOTE_TOKENIZER)
								.or(Terminals.StringLiteral.DOUBLE_QUOTE_TOKENIZER)
								.or(Parsers.longest(
										Terminals.LongLiteral.TOKENIZER,
										Terminals.DecimalLiteral.TOKENIZER)),
								skip)
						.map(new org.codehaus.jparsec.functors.Map<Object, List<EObject>>() {
							public List<EObject> map(Object from) {
								List<EObject> eol = Util.flatten(from);
								if (eol != null) {
									resource.getContents().clear();

									for (EObject eo : eol) {
										if (resource != null) {
											resource.getContents().add(
													(EObject) eo);
										}

									}
								}

								return eol;
							}
						}));

		return new ParserWrapper(out, ctx);
	}

	protected static String implode(List<String> qname, String seperator) {
		Iterator<String> i = qname.iterator();
		String result = "";
		while (i.hasNext()) {
			String next = i.next();
			try {
				result += URLEncoder.encode(next, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				result += next;
			}
			if (i.hasNext())
				result += seperator;
		}
		return result;
	}

	protected static String implode(List<String> qname) {
		return implode(qname, ".");
	}

	private static Parser<?> interpret(final ParserContext ctx,
			final AbstractParser p) throws InterpretationException {
		Parser<?> result = null;

		if (p instanceof StringParser)
			result = interpret((StringParser) p);
		else if (p instanceof IdentifierParser)
			result = interpret((IdentifierParser) p);
		else if (p instanceof TerminalParser)
			result = interpret(ctx, (TerminalParser) p);
		else if (p instanceof RefParser)
			result = interpret(ctx, (RefParser) p);
		else if (p instanceof OrParser)
			result = interpret(ctx, (OrParser) p);
		else if (p instanceof SequenceParser)
			result = interpret(ctx, (SequenceParser) p);
		else if (p instanceof IntParser)
			result = interpret(ctx, (IntParser) p);
		else if (p instanceof LongParser)
			result = interpret(ctx, (LongParser) p);
		else if (p instanceof DoubleParser)
			result = interpret(ctx, (DoubleParser) p);
		else if (p instanceof FloatParser)
			result = interpret(ctx, (FloatParser) p);
		else if (p instanceof BoolParser)
			result = interpret(ctx, (BoolParser) p);
		else if (p instanceof OperatorTableParser)
			result = interpret(ctx, (OperatorTableParser) p);
		else if (p instanceof IdentityParser)
			result = interpret(ctx, (IdentityParser) p);
		else if (p instanceof ImportParser)
			result = interpret(ctx, (ImportParser) p);
		else
			throw new UnsupportedOperationException("Parser type of " + p
					+ " is not supported.");

		if (p instanceof LiteralParser) {
			final RegularExpression regex = ((LiteralParser) p).getRegex();
			if (regex != null) {
				result = result.token().map(
						new org.codehaus.jparsec.functors.Map<Token, Object>() {
							private String rx = regex.getRegex();

							public Object map(Token from) {
								if (!from.toString().matches(rx))
									throw new RegexException(rx, new Location(
											from.index(), from.length()));
								return from.value();
							}
						});
			}
		}

		result = result.token().map(
				new org.codehaus.jparsec.functors.Map<Token, Object>() {
					@Override
					public Object map(Token from) {
						Object o = from.value();
						if (o instanceof EObject)
							ctx.locate((EObject) o, from.index(), from.length());
						return o;
					}
				});

		result = multiplicit(result, p.getMultiplicity());

		if (p.getLabel() != null && p.getLabel().trim().length() == 0)
			p.setLabel(null);

		result = result
				.map(new org.codehaus.jparsec.functors.Map<Object, Object>() {
					public Object map(Object obj) {
						if (p.getMultiplicity() == null
								|| p.getMultiplicity().equals("?")) {
							obj = Arrays.asList(new Object[] { obj });
						}

						List<Object> results = new LinkedList<>();

						for (Object o : (Collection<Object>) obj) {
							results.add(executeMapping(ctx, o, p.getMapping()));
						}

						String label = p.getLabel();

						if (p.getMultiplicity() == null
								|| p.getMultiplicity().equals("?")) {
							if (p instanceof IdentityParser
									&& results.get(0) instanceof IntmResult)
								return new IntmResult(label,
										((IntmResult) results.get(0))
												.getObject());
							else
								return new IntmResult(label, results.get(0));
						} else {
							if (p instanceof IdentityParser
									&& results instanceof IntmResult)
								return new IntmResult(label,
										((IntmResult) results).getObject());
							else
								return new IntmResult(label, results);
						}
					}
				});

		return result;
	}

	private static Object executeMapping(ParserContext ctx, Object o,
			Mapping mapping) {
		if (mapping == null)
			return o;
		else if (mapping instanceof EcoreMapping)
			return executeMapping(ctx, o, (EcoreMapping) mapping);
		else if (mapping instanceof StringValueMapping)
			return executeMapping(ctx, o, (StringValueMapping) mapping);
		else if (mapping instanceof AsQName)
			return executeMapping(ctx, o, (AsQName) mapping);
		else if (mapping instanceof ReferenceMapping)
			return executeMapping(ctx, o, (ReferenceMapping) mapping);
		else
			throw new UnsupportedOperationException("Mapping type of "
					+ mapping + " is not supported.");
	}

	private static Object executeMapping(ParserContext ctx, Object from,
			AsQName mapping) {
		String delim = mapping.getDelim();
		if (from instanceof IntmResult) {
			return ((IntmResult) from).toQName(delim);
		} else
			return new IntmResult(null, from).toQName(delim);
	}

	private static Object executeMapping(ParserContext ctx, Object o,
			StringValueMapping mapping) {
		return mapping.getValue();
	}

	private static Object executeMapping(ParserContext ctx, Object o,
			ReferenceMapping mapping) {
		return new IntmResult(null, o).getByQName(((ReferenceMapping) mapping)
				.getQName().getSections());
	}

	private static Object executeMapping(ParserContext ctx, Object o,
			EcoreMapping mapping) {

		EObject eo = null;

		try {
			EPackage ep = Registry.INSTANCE.getEPackage(mapping.getMetamodel()
					.getModelURI());
			EClass ec = (EClass) ep.getEClassifier(implode(mapping.getEClass()
					.getSections()));
			eo = ep.getEFactoryInstance().create(ec);
		} catch (Exception e) {
		}

		if (eo == null) {
			throw new InterpretationException("Cannot create instance of "
					+ implode(mapping.getEClass().getSections())
					+ " in package " + mapping.getMetamodel().getModelURI());
		}

		for (Object asgo : mapping.getAssignments()) {
			Assignment asg = (Assignment) asgo;
			EStructuralFeature esf = eo.eClass().getEStructuralFeature(
					asg.getTo());

			Assert.isTrue(esf != null, "feature " + asg.getTo()
					+ " not found in " + eo.eClass());

			ComposableMapping from = asg.getFrom();

			Object value = null;
			if (from instanceof ReferenceMapping) {
				value = executeMapping(ctx, o, (ReferenceMapping) from);
			} else if (from instanceof EcoreMapping) {
				value = executeMapping(ctx, o, (EcoreMapping) from);
			} else if (from instanceof StringValueMapping) {
				value = executeMapping(ctx, o, (StringValueMapping) from);
			}

			if (value == null)
				continue;

			if (esf instanceof EAttribute || ((EReference) esf).isContainment()) {
				if (esf.isMany()) {
					Object child = eo.eGet(esf);

					Object ir = value;

					Object co = null;

					if (ir != null) {
						if (ir instanceof IntmResult)
							co = ((IntmResult) ir).getObject();
						else
							co = ir;
					}

					co = unwrap(co);
					if (co != null) {
						if (co instanceof Collection<?>) {
							for (Object cco : (Collection<?>) co) {
								if (cco != null)
									((Collection<Object>) child)
											.add(unwrap(cco));
							}
						} else {
							((Collection<Object>) child).add(co);
						}
					}
				} else {
					Object co = value;
					while (co instanceof IntmResult)
						co = ((IntmResult) co).getObject();
					if (co != null) {
						try {
							eo.eSet(esf, co);
						} catch (Exception e) {
							System.err.println("Cannot not set "
									+ eo.eClass().getName() + "#"
									+ esf.getName() + " to " + co + ".");
						}
					}
				}
			} else {
				Object ref = value;
				while (ref instanceof IntmResult)
					ref = ((IntmResult) ref).getObject();

				if (!(ref instanceof Collection<?>)) {
					ref = Arrays.asList(new Object[] { ref });
				}
				for (Object r : (Collection<?>) ref) {
					if (r instanceof QualifiedName) {
						resolveLater(eo, esf, (QualifiedName) r);
					} else if (r != null) {
						QualifiedName qn = PccsFactory.eINSTANCE
								.createQualifiedName();
						qn.getSections().add("" + r);
						resolveLater(eo, esf, qn);
					}
				}

			}
		}

		return eo;
	}

	public static void resolveLater(EObject o, EStructuralFeature f,
			QualifiedName qname) {

		EClass c = Util.findConcreteType(((EClass) f.getEType()));
		InternalEObject proxy = (InternalEObject) c.getEPackage()
				.getEFactoryInstance().create(c);

		proxy.eSetProxyURI(org.eclipse.emf.common.util.URI
				.createURI(PCCSResourceSetImpl.PCCS_SCHEME
						+ f.getEType().getInstanceTypeName() + "/"
						+ implode(qname.getSections(), "/")));

		if (!f.isMany()) {
			o.eSet(f, proxy);
		} else {
			((Collection) o.eGet(f)).add(proxy);
		}
	}

	private static Object unwrap(Object o) {
		if (o instanceof Collection<?>) {
			List<Object> result = new LinkedList<Object>();
			for (Object oc : (Collection<?>) o) {
				result.add(unwrap(oc));
			}
			return result;
		} else if (o instanceof IntmResult) {
			return unwrap(((IntmResult) o).getObject());
		} else
			return o;
	}

	private static Parser<?> multiplicit(Parser<?> p, String multiplicity)
			throws InterpretationException {
		if (multiplicity == null || multiplicity.trim().length() == 0)
			return p;
		switch (multiplicity) {
		case "?":
			return p.optional();
		case "+":
			return p.many1();
		case "*":
			return p.many();
		default:
			throw new InterpretationException("Unrecognized multiplicity "
					+ multiplicity + ".");
		}
	}

	private static Parser<String> interpret(StringParser p) {
		return Terminals.StringLiteral.PARSER;
	}

	private static Parser<?> interpret(IdentifierParser p) {
		return Terminals.Identifier.PARSER
				.map(new org.codehaus.jparsec.functors.Map<String, String>() {
					public String map(String from) {
						return from.startsWith("_") ? from.substring(1) : from; // address
																				// ids
																				// equal
																				// to
																				// keywords
					}
				});
	}

	private static Parser<?> interpret(ParserContext ctx, OrParser p)
			throws InterpretationException {
		List<Parser<?>> parsers = new LinkedList<>();
		for (Object o : p.getParsers()) {
			parsers.add(interpret(ctx, (AbstractParser) o));
		}
		return Parsers.longest(parsers.toArray(new Parser<?>[0])).map(
				new org.codehaus.jparsec.functors.Map<Object, Object>() {
					public Object map(Object from) {
						if (from instanceof IntmResult)
							from = ((IntmResult) from).getObject();
						return from;
					}
				});
	}

	private static Parser<?> interpret(ParserContext ctx, SequenceParser p)
			throws InterpretationException {
		List<Parser<?>> parsers = new LinkedList<>();
		for (Object o : p.getParsers()) {
			parsers.add(interpret(ctx, (AbstractParser) o));
		}

		return recurseSeq(parsers);
	}

	private static Parser<?> recurseSeq(List<Parser<?>> parsers) {
		if (parsers.isEmpty())
			return Parsers.always();
		if (parsers.size() == 1)
			return parsers.get(0);

		List<Parser<?>> tail = parsers.subList(1, parsers.size());

		Parser<?> head = parsers.get(0);

		return Parsers
				.sequence(
						head,
						recurseSeq(tail),
						new org.codehaus.jparsec.functors.Map2<Object, Object, Object>() {
							@Override
							public Object map(Object a, Object b) {
								List<Object> result = new LinkedList<>();
								result.add(a);
								if (b instanceof List<?>) {
									result.addAll((Collection<? extends Object>) b);
								} else {
									result.add(b);
								}
								return result;
							}
						});
	}

	private static Parser<?> interpret(ParserContext ctx, RefParser p) {
		return ctx.getParser(p.getRef().getName()).map(
				new org.codehaus.jparsec.functors.Map<Object, Object>() {
					public Object map(Object from) {
						if (from instanceof IntmResult)
							from = ((IntmResult) from).getObject();
						return from;
					}
				});
	}

	private static Parser<?> interpret(ParserContext ctx, TerminalParser p) {
		return ctx.term(p.getTerminal().getTerminal());
	}

	private static Parser<?> interpret(ParserContext ctx, BoolParser p) {
		Parser<Boolean> _true = ctx.term(p.getTrueLit()).map(
				new Map<Object, Boolean>() {
					public Boolean map(Object from) {
						return true;
					}
				});
		Parser<Boolean> _false = ctx.term(p.getFalseLit()).map(
				new Map<Object, Boolean>() {
					public Boolean map(Object from) {
						return false;
					}
				});

		return Parsers.or(_true, _false);
	}

	private static Parser<?> interpret(ParserContext ctx, IntParser p) {
		Parser<Long> pos = Terminals.LongLiteral.PARSER;
		Parser<Long> neg = Terminals.LongLiteral.PARSER
				.map(new org.codehaus.jparsec.functors.Map<Long, Long>() {
					public Long map(Long from) {
						return -from;
					}
				});

		return Parsers.or(Parsers.sequence(ctx.term("-"), neg), pos).map(
				new org.codehaus.jparsec.functors.Map<Long, Integer>() {
					public Integer map(Long from) {
						return (int) from.intValue();
					}
				});
	}

	private static Parser<?> interpret(ParserContext ctx, LongParser p) {
		Parser<Long> pos = Terminals.LongLiteral.PARSER;
		Parser<Long> neg = Terminals.LongLiteral.PARSER
				.map(new org.codehaus.jparsec.functors.Map<Long, Long>() {
					public Long map(Long from) {
						return -from;
					}
				});

		return Parsers.or(Parsers.sequence(ctx.term("-"), neg), pos);
	}

	private static Parser<?> interpret(ParserContext ctx, DoubleParser p) {
		Parser<Double> pos = Terminals.DecimalLiteral.PARSER
				.map(new org.codehaus.jparsec.functors.Map<String, Double>() {
					public Double map(String from) {
						return Double.parseDouble(from);
					}
				});
		Parser<Double> neg = Terminals.DecimalLiteral.PARSER
				.map(new org.codehaus.jparsec.functors.Map<String, Double>() {
					public Double map(String from) {
						return -Double.parseDouble(from);
					}
				});

		return Parsers.or(Parsers.sequence(ctx.term("-"), neg), pos);
	}

	private static Parser<?> interpret(ParserContext ctx, FloatParser p) {
		Parser<Float> pos = Terminals.DecimalLiteral.PARSER
				.map(new org.codehaus.jparsec.functors.Map<String, Float>() {
					public Float map(String from) {
						return Float.parseFloat(from);
					}
				});
		Parser<Float> neg = Terminals.DecimalLiteral.PARSER
				.map(new org.codehaus.jparsec.functors.Map<String, Float>() {
					public Float map(String from) {
						return -Float.parseFloat(from);
					}
				});

		return Parsers.or(Parsers.sequence(ctx.term("-"), neg), pos);
	}

	private static Parser<?> interpret(final ParserContext ctx,
			OperatorTableParser p) throws InterpretationException {
		OperatorTable<Object> tab = new OperatorTable<>();
		Parser<Object> unit = Parsers.never();
		for (final Object o : p.getEntries()) {
			if (o instanceof Unit) {
				unit = unit.or(interpret(ctx,
						(AbstractParser) ((Unit) o).getParser()));
			} else if (o instanceof InfixOperator) {
				Binary<Object> bin = new Binary<Object>() {
					public Object map(Object a, Object b) {
						LinkedList<Object> result = new LinkedList<>();
						if (a instanceof IntmResult)
							a = ((IntmResult) a).getObject();
						if (b instanceof IntmResult)
							b = ((IntmResult) b).getObject();
						result.add(new IntmResult("left", a));
						result.add(new IntmResult("right", b));
						return executeMapping(ctx, result,
								((InfixOperator) o).getMapping());
					}
				};

				Parser<Binary<Object>> parser = interpret(ctx,
						((InfixOperator) o).getParser()).retn(bin);

				int prec = ((PrecedenceOperator) o).getPrecedence();

				if (o instanceof NonAssociativeOperator) {
					tab = tab.infixn(parser, prec);
				} else if (o instanceof RightAssociativeOperator) {
					tab = tab.infixr(parser, prec);
				} else if (o instanceof LeftAssociativeOperator) {
					tab = tab.infixl(parser, prec);
				}
			} else if (o instanceof UnaryOperator) {
				Unary<Object> unary = new Unary<Object>() {
					public Object map(Object from) {
						if (from instanceof IntmResult)
							from = ((IntmResult) from).getObject();
						return executeMapping(ctx, from,
								((UnaryOperator) o).getMapping());
					}
				};

				Parser<Unary<Object>> parser = interpret(ctx,
						((UnaryOperator) o).getParser()).retn(unary);

				int prec = ((PrecedenceOperator) o).getPrecedence();

				if (o instanceof PostfixOperator) {
					tab = tab.postfix(parser, prec);
				} else if (o instanceof PrefixOperator) {
					tab = tab.prefix(parser, prec);
				}
			}
		}
		return tab.build(unit);
	}

	private static Parser<?> interpret(ParserContext ctx, IdentityParser p)
			throws InterpretationException {
		return interpret(ctx, p.getParser()).map(
				new org.codehaus.jparsec.functors.Map<Object, Object>() {
					public Object map(Object from) {
						return from;
					}
				});
	}
	
	private static Parser<?> interpret(final ParserContext ctx, ImportParser p)
			throws InterpretationException {
		return interpret(ctx, p.getParser()).map(
				new org.codehaus.jparsec.functors.Map<Object, Object>() {
					public Object map(Object from) {
						ctx.getResource().addImport(from);
						return from;
					}
				});
	}
}
