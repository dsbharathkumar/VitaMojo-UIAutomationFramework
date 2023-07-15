package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

	
	private WebDriver driver; 
	
	
	public WebDriver getDriver() {
		if(driver == null) driver = getChromeDriver();
		return driver;
	}
  
	private WebDriver getChromeDriver() {
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	return driver;
	}
	
	public void quitDriver() {
		if(driver !=null) driver.quit();
	}
}
