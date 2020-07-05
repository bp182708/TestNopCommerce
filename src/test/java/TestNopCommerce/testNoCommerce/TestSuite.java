package TestNopCommerce.testNoCommerce;

import org.junit.Test;

public class TestSuite extends Hooks {
	
	HomePage homepage = new HomePage();
	Register registerpage = new Register();
	
	@Test
	public void openHomePage () {
		
		homepage.clickOnRegister();
		homepage.getTextofRegister();
		registerpage.personalDetails();
		registerpage.registerButton();
	}
	
	

}
