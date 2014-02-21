package org.tud.inf.st.mbt.automation.selenium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.tud.inf.st.mbt.automation.AbstractConnectorType;
import org.tud.inf.st.mbt.automation.IAutomationConstants;
import org.tud.inf.st.mbt.automation.IConnector;

public class SeleniumSimulationAutomationType extends AbstractConnectorType{
	
	private static SeleniumSimulationAutomationType instance;
	
	public static SeleniumSimulationAutomationType getInstance() {
		if(instance == null)instance = new SeleniumSimulationAutomationType();
		return instance;
	}
	
	private List<SeleniumSimulationAutomation> connectors = new ArrayList<>();

	private SeleniumSimulationAutomationType() {
		new Thread(){
			@Override
			public void run() {
				System.getProperties().setProperty("webdriver.ie.driver", System.getProperty("mate.selenium.driverfolder")+"\\IEDriverServer.exe");
				System.getProperties().setProperty("webdriver.chrome.driver", System.getProperty("mate.selenium.driverfolder")+"\\chromedriver.exe");
				
				//connectors.add(new SeleniumSimulationAutomation("Internet Explorer", new InternetExplorerDriver(5555)));
				//connectors.add(new SeleniumSimulationAutomation("Firefox", new FirefoxDriver()));
				connectors.add(new SeleniumSimulationAutomation("Chrome", ChromeDriver.class));
				connectors.add(new SeleniumSimulationAutomation("HTML Lightweight", HtmlUnitDriver.class));
			}
		}.start();
	}
	
	@Override
	public Integer getKind() {
		return IAutomationConstants.KIND_SIMULATION_AUTOMATION;
	}

	@Override
	public String getName() {
		return "Selenium";
	}

	@Override
	public String[] getAvailableConnections() {
		List<String> l = new ArrayList<>();
		for(SeleniumSimulationAutomation c:connectors)
			l.add(c.getConnection());
		return l.toArray(new String[0]);
	}

	@Override
	public IConnector getConnector(String connection) {
		for(SeleniumSimulationAutomation c:connectors){
			if(c.getConnection().equals(connection))return c;
		}
		return null;
	}

	@Override
	public Collection<? extends IConnector> getActiveConnectors() {
		return connectors;
	}

}
