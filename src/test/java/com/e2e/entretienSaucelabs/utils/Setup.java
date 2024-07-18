package com.e2e.entretienSaucelabs.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Setup {
	private static WebDriver driver ;
	private static final Logger LOGGER  = (Logger) LogManager.getLogger(Setup.class.getName());
	/**
	 * This method is used to open browser. This method is called before the
	 * invocation of each test method in the given class. In this method we need to
	 * pass browser name which will invoke the respective driver.
	 * 
	 * @throws MalformedURLException the malformed URL exception
	 * @Before Methods annotated with @Before will execute before every scenario.
	 */
	@Before
	public void setWebDriver(Scenario scenario) {
		LOGGER.info("Scenario:  "+scenario.getName() + "- started");
		
		String browser = System.getProperty("browser");
		if (browser == null ) {
			browser = "chrome";
			
		}
		switch(browser) {
		case "chrome":
			ChromeOptions chromeOptions = new ChromeOptions();
			driver = new ChromeDriver(chromeOptions);
			chromeOptions.addArguments("['start-maximized']");
			break;
		
		case "firefox":
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setCapability("platform", Platform.WIN11);
			driver = new FirefoxDriver(firefoxOptions);
			firefoxOptions.addArguments("['start-maximized']");
			break;
		case "edge" :
		   driver = new EdgeDriver();
		   break ;
		   default :
			   throw new IllegalArgumentException("Brower \"" +browser+ "\" is not supported.");
		}
	}
	
	/* Getter */
	public static WebDriver getDriver() {
		return driver;
		
		}

	public static Logger getLogger() {
		// TODO Auto-generated method stub
		return LOGGER;
	}
	
}
