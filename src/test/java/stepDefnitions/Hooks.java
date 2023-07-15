package stepDefnitions;

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

	
	@Before
	public void beforeSteps(Scenario scenario) {
		
		System.out.println("Test scenario: "+scenario.getName());
	    
	}
	
	@After
	public void afterSteps() {
		testContext.getWebDriverManager().quitDriver();
	}

}
