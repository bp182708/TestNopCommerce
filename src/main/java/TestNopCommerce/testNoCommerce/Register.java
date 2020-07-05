package TestNopCommerce.testNoCommerce;



import static org.junit.Assert.assertEquals;

// import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

public class Register extends Utils 
{

	
	private By yourpersonaldetails = By.className("title");
	private By genderCheckBox = By.id("gender-male");
	private By firstName = By.id("FirstName");
	private By lastName = By.id("LastName");
	private By dayDropList = By.xpath("//div[@class='date-picker-wrapper']/select[1]");
	private By monthDropList = By.xpath("//div[@class='date-picker-wrapper']/select[2]");
	private By yearDropList = By.xpath("//div[@class='date-picker-wrapper']/select[3]");
	private By email = By.id("Email");
	private By password = By.id("Password");
	private By confirmPassword = By.id("ConfirmPassword");
	String emailTimeStamp = "testtime" + timestamp() + "@gmail.com";
	private By _registerButton = By.id("register-button");
	String registerSuccessful = "Your registration completed";
	private By registerSuccess = By.xpath("//div[@class='result']");
	
	public void personalDetails () {
		System.out.println(getTextFromElement(yourpersonaldetails));
		clickOnCheckBox(genderCheckBox);
		enterText(firstName, "Pankaj");
		enterText(lastName, "Patel");
		 selectByVisibleText(dayDropList, "10");
		 selectByVisibleText(monthDropList, "July");
		 selectByIndex(yearDropList, 90);
		 enterText(email, emailTimeStamp);
		 enterText(password, "Test@123");
		 enterText(confirmPassword, "Test@123");
	}
	
	public void registerButton () {
		clickOnElement(_registerButton);
		String text = getTextFromElement(registerSuccess);
		assertEquals(text, registerSuccessful);
		
	}
	
	
	
}
