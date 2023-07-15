package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import library.ReusableMethods;


public class LoginPage extends ReusableMethods{
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver =driver;
	    PageFactory.initElements(driver, this);
	}
	
	// Login form
	
	@FindBy(how = How.XPATH, using = "//a[text()='Login']")
	private WebElement btn_Login;
	
	@FindBy(how = How.CSS, using = "#email") 
	private WebElement txtbx_LoginEmailAddress;
	
	@FindBy(how = How.CSS, using = "#password") 
	private WebElement txtbx_LoginPassword;
	
	@FindBy(how = How.CSS, using = "[type='submit']") 
	private WebElement btn_LoginSubmit;
	
	@FindBy(how = How.XPATH, using ="//li[@data-test='auth-tab-login']")
	private WebElement tab_Login;
	
	@FindBy(how = How.XPATH, using ="//li[@data-test='auth-tab-register']")
	private WebElement tab_CreateAccount;
	
	@FindBy(how = How.XPATH, using ="//div[@data-test='loyalty-advert']")
	private WebElement txt_LoyalityAdvert;
	
	@FindBy(how = How.XPATH, using ="//a[@data-test='header-profile-link']")
	private WebElement txt_ProfileHeader;
	
	
	public void enterEmail(String emailAddress) {
		txtbx_LoginEmailAddress.sendKeys(emailAddress);
	}
	
	public void enterpassword(String password) {
		txtbx_LoginPassword.sendKeys(password);
	}
	
	public void clickButtonLogin(WebDriver driver) {
		clickElement(driver, btn_Login);
	}
	
	public void clickLoginTab(WebDriver driver) {
		clickElement(driver, tab_Login);
	}
	
	public void clickCreateAccountTab() {
		tab_CreateAccount.click();
	}
	
	public void submitLoginForm() {
		btn_LoginSubmit.click();
	}
	
	public String getHeadername() {
		return txt_ProfileHeader.getText().trim();
	}
	
}