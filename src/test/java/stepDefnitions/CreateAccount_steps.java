package stepDefnitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.CreateAccount;
import pageObjects.LoginPage;

public class CreateAccount_steps{
	
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager; 
	LoginPage loginPage;
	CreateAccount createAccount;
	WebDriver driver;
	
	TestContext testContext;
	public CreateAccount_steps(TestContext context) {
		testContext = context;
		driver = testContext.getWebDriverManager().getDriver();
		loginPage = testContext.getPageObjectManager().getLoginPage();
		createAccount = testContext.getPageObjectManager().getCreateAccount();
	}
	

	@When("^Enter details in signup form$")
	public void enter_details_in_sign_up_form() {
		loginPage.clickButtonLogin(driver);
		loginPage.clickCreateAccountTab();
		createAccount.fillRegistrationForm();
		createAccount.submitRegistrationForm();		
	}
	
	@Given("^User is on home page$")
	public void user_is_on_Home_Page(){
		createAccount.openUrl(driver);
	}
	
	@Then("^Validate account name$")
	public void validate_account_name() {
		String accountName = createAccount.getAccountName(driver);
		Assert.assertEquals(CreateAccount.getFirstname(), accountName, "Login account name is Incorrect. Please check");
	}
	
	
	@And("^Close the browser$")
	public void closeBrowser() {
		driver.close();
	}
	
}
