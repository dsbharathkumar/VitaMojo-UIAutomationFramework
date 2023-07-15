package stepDefnitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	TestContext testContext;
	public WebDriver driver;
	
	public Hooks(TestContext context) {
		testContext = context;
	}

	private static final Logger logger = LogManager.getLogger(Hooks.class);
	
	@Before
	public void beforeSteps(Scenario scenario) {
		
		logger.info("Test scenario: "+scenario.getName());
	    
	}
	
	@After
	public void afterSteps() {
		testContext.getWebDriverManager().quitDriver();
	}

}
