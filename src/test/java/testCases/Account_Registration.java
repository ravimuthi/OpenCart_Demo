package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;

public class Account_Registration extends BaseClass{
	
	
	@Test()
	public void AccountRegister() throws InterruptedException {
		
		
		HomePage hp = new HomePage(driver);
		Thread.sleep(3000);
		hp.tapOnMyAccount();
		hp.tapOnRegister();
		
		RegistrationPage rp = new RegistrationPage(driver);
		rp.enterFirstName(randomString());
		rp.enterLastName(randomString());
		rp.enterEmail(randomString()+ "@gmail.com");
		rp.enterPhone(randomNumeric());
		rp.enterPassword(randomString());
		rp.tapOnCheckBox();
		rp.tapOnContinue();
	}
	
	public String randomString() {
		
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String randomNumeric() {
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return generatedNumber;
	}

}
