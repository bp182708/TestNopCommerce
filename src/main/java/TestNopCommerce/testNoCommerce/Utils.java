package TestNopCommerce.testNoCommerce;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends BasePage {

	
	//to click on element
    public static void clickOnElement(By by) {
    	driver.findElement(by).click();
    	}   
    //webelement for click on radio button
    public static void clickOnCheckBox(By by) {
    	WebElement element = driver.findElement(by);
    	element.click();
    	
    }
    
    // to enter text
    public static void enterText(By by, String text) {
    	driver.findElement(by).sendKeys(text);
    	}
    
    // to get text from element
    public static String getTextFromElement(By by) {
    	return driver.findElement(by).getText();
    	}
    
    // to select from drop list by visible text
    public static void selectByVisibleText(By by, String name) {
    	new Select(driver.findElement(by)).selectByVisibleText(name);
    	}
 // to select ffrom droplist by index
    public static void selectByIndex(By by, int numb) {
    	new Select(driver.findElement(by)).selectByIndex(numb);
    	}
 // for creating timestamp to use in email
    public static String timestamp() {
    	DateFormat format = new SimpleDateFormat("DDMMYYHHMMSS");
        return format.format(new Date());
        }
    
 // to wait and click
    public static void waitAndClick(By by,int time) { 
    	WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
        }
    
    // to wait for element to be invisible
    public static void waitForElementToBeInvisible(By by, int time) {
    	WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
        }
}
