package library;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods {

	
	private static final long STANDARD_TIME_OUT = 60;
	
	/**
	 * This function is for maximizing the current window.
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This function is for implicitly wait.
	 * @param driver
	 * @param time
	 * @param timeUnit
	 */
	public void implicitWait(WebDriver driver, long time, TimeUnit timeUnit) {
		try {
			driver.manage().timeouts().implicitlyWait(time, timeUnit);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * This function is for finding a web element.
	 * @param driver
	 * @param by
	 * @return WebElement
	 */
	public WebElement findElement(WebDriver driver, By by) {
		visibleWait(driver, STANDARD_TIME_OUT, by);
		WebElement element = driver.findElement(by);
		return element;
	}

	
	/**
	 * This function is for clicking element on the web page.
	 * @param driver
	 * @param by
	 */
	public void clickElement(WebDriver driver, By by) {
		try {
			clickableWait(driver, STANDARD_TIME_OUT, by);
			findElement(driver, by).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * This function is for clicking element on the web page.
	 * @param driver
	 * @param by
	 */
	public void clickElement(WebDriver driver, WebElement element) {
		try {
			clickableWait(driver, STANDARD_TIME_OUT, element);
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * This function is for sending text to the input field on web page.
	 * @param driver
	 * @param by
	 * @param text
	 */
	public void sendKeys(WebDriver driver, By by, String text) {
		try {
			presenceWait(driver, STANDARD_TIME_OUT, by);
			findElement(driver, by).sendKeys(text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * This function is for waiting until the page loads completely.
	 * @param driver
	 */
	public void pageLoadTimeOut(WebDriver driver) {
		driver.manage().timeouts().pageLoadTimeout(STANDARD_TIME_OUT, TimeUnit.SECONDS);
	}

	/**
	 * This function is for waiting until an element is clickable.
	 * @param driver
	 * @param timeOutInSeconds
	 * @param by
	 */
	public void clickableWait(WebDriver driver, long timeOutInSeconds, By by) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	/**
	 * This function is for waiting until an element is clickable.
	 * @param driver
	 * @param timeOutInSeconds
	 * @param element
	 */
	public void clickableWait(WebDriver driver, long timeOutInSeconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * This function is for explicit wait until the element is present.
	 * @param driver
	 * @param timeOutInSeconds
	 * @param by
	 */
	public void presenceWait(WebDriver driver, long timeOutInSeconds, By by) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	
	/**
	 * This function is for explicit wait until the element is visible.
	 * @param driver
	 * @param timeOutInSeconds
	 * @param by
	 */
	public void visibleWait(WebDriver driver, long timeOutInSeconds, By by) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	  /**
	   * This function is to generate random password
	   * @param length
	   * @return String
	   */
	  public static String generatePassword(int length) {
	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[length];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password.toString();
	   }
}
