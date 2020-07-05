package TestNopCommerce.testNoCommerce;

import org.openqa.selenium.By;

public class HomePage extends Utils {

	
	private By register = By.className("ico-register");
	
	
	
	public void clickOnRegister () {
		clickOnElement(register);
	}
	
	public void getTextofRegister () {
		System.out.println(getTextFromElement(register));
		
	}
	
	
}
