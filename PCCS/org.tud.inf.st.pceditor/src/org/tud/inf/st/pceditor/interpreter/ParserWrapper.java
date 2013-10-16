package org.tud.inf.st.pceditor.interpreter;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jparsec.Parser;
import org.codehaus.jparsec.error.ParserException;
import org.eclipse.emf.ecore.EObject;
import org.tud.inf.st.pceditor.exceptions.CompositeException;
import org.tud.inf.st.pceditor.exceptions.LocatableException;

public class ParserWrapper {
	private Parser<?> parser;
	private ParserContext context;
	private List<EObject> lastResult;

	private static final int REPAIR_DEPTH = 20;
	
	public ParserWrapper(Parser<?> parser,ParserContext context) {
		this.parser = parser;
		this.context = context;
	}

	public ParserResult parse(String txt) {
		return parseInternal(txt, REPAIR_DEPTH);
	}
	
	public void reset(){
		context.getLocations().clear();
	}

	public ParserResult parseInternal(String txt, int depth) {
		ParserResult result = new ParserResult(lastResult,
				new ArrayList<ParserError>(), new ArrayList<String>(),context.getLocations());
		context.getResource().setUnderlyingParserResult(result);
		while (depth > 0) {
			try {
				lastResult = Util.flatten(parser.parse(txt));

				result.setObjects(lastResult);
				break;
			} catch (ParserException e) {
				System.err.println(e);
				if (e.getCause() != null)
					System.err.println(e.getCause());

				org.codehaus.jparsec.error.ParseErrorDetails details = e
						.getErrorDetails();

				Location l = null;
				String msg = "";
				String token = "";

				if (details != null) {
					l = new Location(details.getIndex(), details
							.getEncountered().length());
					for (String ex : details.getExpected())
						result.addExpecation(ex);

					msg = details.getFailureMessage();
					token = details.getEncountered();
				}

				if (msg == null)
					msg = e.getMessage();

				if (msg != null)
					msg = msg.replaceAll("\\n", "");

				if (e.getCause() instanceof ParserException) {
					result.addError(new ParserError(e.getLocation().column, e
							.getLocation().line, l, msg, token));

					if (l.getIndex() + l.getLength() > txt.length() - 1)
						break;

					String subst = repeatWhitespace(l.getLength());
					txt = txt.substring(0, l.getIndex()) + subst
							+ txt.substring(l.getIndex() + l.getLength());
					depth--;
				} else {
					if (e.getCause() instanceof CompositeException) {
						for (Exception c : ((CompositeException) e.getCause())
								.getExceptions()) {
							handleException(c, l, e.getLocation().line,
									e.getLocation().column, msg, token, result);
						}
					} else {
						handleException((Exception) e.getCause(), l,
								e.getLocation().line, e.getLocation().column,
								msg, token, result);
					}
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}

		return result;
	}

	private void handleException(Exception e, Location loc, int line, int col,
			String msg, String token, ParserResult result) {
		if (loc == null) {
			if (e instanceof LocatableException) {
				loc = ((LocatableException) e).getLocation();
			} else
				loc = new Location(0, 0);
		}
		result.addError(new ParserError(line, col, loc, (msg != null && !msg
				.equals("")) ? msg : e.getMessage(), token));
	}

	private String repeatWhitespace(int times) {
		String ws = "";
		for (int i = 0; i < times; i++)
			ws += " ";
		return ws;
	}

}
