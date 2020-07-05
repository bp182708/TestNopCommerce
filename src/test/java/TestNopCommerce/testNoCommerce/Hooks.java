package TestNopCommerce.testNoCommerce;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;

import org.openqa.selenium.chrome.ChromeDriver;

import TestNopCommerce.testNoCommerce.BasePage;



public class Hooks extends BasePage {
	
	
	
	
	@Before
	public void openBrowser()
    {
		System.setProperty("webdriver.chrome.driver","src\\test\\java\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		
    }
	
	@After
	public void closeBrowser() {
		// driver.close();
	}
	
}
