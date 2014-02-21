package org.tud.inf.st.mbt.automation.selenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.tud.inf.st.mbt.actions.PostGenerationAction;
import org.tud.inf.st.mbt.actions.TermAction;
import org.tud.inf.st.mbt.automation.basic.ManualAutomation;
import org.tud.inf.st.mbt.automation.execute.ISimulationResponder;
import org.tud.inf.st.mbt.terms.FloatTerm;
import org.tud.inf.st.mbt.terms.FunctorTerm;
import org.tud.inf.st.mbt.terms.IntegerTerm;
import org.tud.inf.st.mbt.terms.LongTerm;
import org.tud.inf.st.mbt.terms.StringTerm;
import org.tud.inf.st.mbt.terms.Term;
import org.tud.inf.st.mbt.emf.util.ModelUtil;

public class SeleniumSimulationAutomation extends ManualAutomation {

	private String connection;
	private WebDriver driver;
	private Class<? extends WebDriver> driverClass;
	private Map<Integer, WebElement> elements = new HashMap<>();

	public SeleniumSimulationAutomation(String connection, Class<? extends WebDriver> driverClass) {
		this.connection = connection;
		this.driverClass = driverClass;
		reset();
	}

	public String getConnection() {
		return connection;
	}

	@Override
	public boolean automate(PostGenerationAction action,
			ISimulationResponder responder) {
		try {
			Boolean b = automateLocal(action, responder);
			if (b == null)
				return super.automate(action, responder);
			if(b == true)
				return true;
			if (b == false)
				return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return false;
	}

	public Boolean automateLocal(PostGenerationAction action,
			ISimulationResponder responder) {
		System.out.println(action);

		if (action instanceof TermAction) {
			Term term = ((TermAction) action).getTerm();
			if (term instanceof FunctorTerm) {
				FunctorTerm fterm = (FunctorTerm) term;
				String functor = fterm.getFunctor();

				if (functor.equals("open") && fterm.getArguments().size() == 1
						&& fterm.getArguments().get(0) instanceof StringTerm) {
					if(driver !=null)driver.quit();
					try {
						this.driver = driverClass.newInstance();
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					driver.get(((StringTerm) fterm.getArguments().get(0))
							.getValue());
					return true;
				}

				else if (functor.equals("findByName")
						&& fterm.getArguments().size() == 2) {
					WebElement e = driver.findElement(By
							.name(((StringTerm) fterm.getArguments().get(1))
									.getValue()));
					elements.put(
							ModelUtil.hashCode(fterm.getArguments().get(0)), e);

					return true;
				}

				else if (functor.equals("findById")
						&& fterm.getArguments().size() == 2) {
					WebElement e = driver.findElement(By.id(((StringTerm) fterm
							.getArguments().get(1)).getValue()));
					elements.put(
							ModelUtil.hashCode(fterm.getArguments().get(0)), e);
					return true;
				}

				else if (functor.equals("findByXPath")
						&& fterm.getArguments().size() == 2) {
					WebElement e = driver.findElement(By
							.xpath(((StringTerm) fterm.getArguments().get(1))
									.getValue()));
					elements.put(
							ModelUtil.hashCode(fterm.getArguments().get(0)), e);
					return true;
				}

				else if (functor.equals("submit")
						&& fterm.getArguments().size() == 1) {
					elements.get(
							ModelUtil.hashCode(fterm.getArguments().get(0)))
							.submit();
					return true;
				}

				else if (functor.equals("sendKeys")
						&& fterm.getArguments().size() == 2) {
					elements.get(
							ModelUtil.hashCode(fterm.getArguments().get(0)))
							.sendKeys(
									((StringTerm) fterm.getArguments().get(1))
											.getValue());
					return true;
				}

				else if (functor.equals("click")
						&& fterm.getArguments().size() == 1) {
					elements.get(
							ModelUtil.hashCode(fterm.getArguments().get(0)))
							.click();
					return true;
				}

				else if (functor.equals("quit")
						&& fterm.getArguments().size() == 0)
					driver.quit();
				return true;
			}
		}

		return null;
	}

	private static int getIntValue(Term t) {
		if (t instanceof IntegerTerm)
			return ((IntegerTerm) t).getValue();
		else if (t instanceof FloatTerm)
			return (int) ((FloatTerm) t).getValue();
		else if (t instanceof LongTerm)
			return (int) ((LongTerm) t).getValue();
		else
			return -1;
	}

	@Override
	public void reset() {
		elements.clear();
		super.reset();
	}
}
