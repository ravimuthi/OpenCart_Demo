package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class AccountLogin extends BaseClass{
	
	
	
	@Test()
	void LoginFlow() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		hp.tapOnMyAccount();
		hp.tapOnLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.enterEmail("testautomation123@gmail.com");
		lp.enterPWD("Texas@123");
		lp.tapOnContinue();
		lp.assertLogin();
	}

}
