package stepDefnitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.ReusableMethods;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.CreateAccount;
import pageObjects.LoginPage;

public class Loginpage_steps extends ReusableMethods{
	
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager; 
	WebDriver driver;
	LoginPage loginPage;
	CreateAccount createAccount;
	
	TestContext testContext;
	
	public Loginpage_steps(TestContext context) {
		testContext = context;
		loginPage = testContext.getPageObjectManager().getLoginPage();
		createAccount = testContext.getPageObjectManager().getCreateAccount();
		driver = testContext.getWebDriverManager().getDriver();
	}
	

	@When("^Enter username and password$")
	public void enter_username_and_password() {
		loginPage.clickButtonLogin(driver);
		loginPage.clickLoginTab(driver);
		loginPage.enterEmail("dodlabharath@gmail.com");
		loginPage.enterpassword("@Dsbk332");
		loginPage.submitLoginForm();
	}
	
	@Then("^Validate successful login$")
	public void validate_successful_login() {
		System.out.println(loginPage.getHeadername());
	}

}
