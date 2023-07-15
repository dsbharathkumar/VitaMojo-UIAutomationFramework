package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.CreateAccount;
import pageObjects.LoginPage;

// Page object manager follows encapsulation in java OOPs

public class PageObjectManager {

	private WebDriver driver;
	private LoginPage loginPage;
	private CreateAccount createAccount;

	

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	}
	
	public CreateAccount getCreateAccount() {
		return (createAccount == null) ? createAccount = new CreateAccount(driver) : createAccount;
	}
	
}
