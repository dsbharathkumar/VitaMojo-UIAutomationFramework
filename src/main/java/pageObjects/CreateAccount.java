package pageObjects;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import library.ReusableMethods;

public class CreateAccount extends ReusableMethods{
	
	WebDriver driver;
	private static final String FIRSTNAME = RandomStringUtils.randomAlphabetic(9);
	private static final String PASSWORD = generatePassword(9);
	private static final String EMAIL = RandomStringUtils.random(8, "abcdefghijklmnopqrstuvwxyz") + "@" + "gmail.com";
	
	public CreateAccount(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	// Sign up form
	
		@FindBy(how = How.CSS, using = "#firstName") 
		private WebElement txtbx_FirstName;
		
		@FindBy(how = How.CSS, using = "#email") 
		private WebElement txtbx_Email;
		
		@FindBy(how = How.CSS, using = "#password") 
		private WebElement txtbx_Password;
		
		@FindBy(how = How.XPATH, using = "//div[text()='I want to receive future discounts and offers']")
		private WebElement chkbox_FutureDiscount;
		
		@FindBy(how = How.CSS, using = "[type='submit']") 
		private WebElement btn_LoginSubmit;
		
		
		public static String getFirstname() {
			return FIRSTNAME;
		}

		public static String getPassword() {
			return PASSWORD;
		}

		public static String getEmail() {
			return EMAIL;
		}
		
		
		public void openUrl(WebDriver driver) {
			driver.get("https://fego.vmos-demo.com/");
			maximizeWindow(driver);
			pageLoadTimeOut(driver);
			implicitWait(driver, 30, TimeUnit.SECONDS);
		}
		
		public void fillRegistrationForm() {
			txtbx_FirstName.sendKeys(FIRSTNAME);
			txtbx_Email.sendKeys(EMAIL);
			txtbx_Password.sendKeys(PASSWORD);
			chkbox_FutureDiscount.click();
		}
		
		public void submitRegistrationForm() {
			btn_LoginSubmit.click();
		}

		public String getAccountName(WebDriver driver) {
			String accountName = findElement(driver, By.xpath("//span[text()='"+FIRSTNAME+"']")).getText().trim();
			return accountName;
		}
}
