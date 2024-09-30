package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@name = 'email']")
	WebElement emailtxt;
	
	@FindBy(xpath = "//*[@name = 'password']")
	WebElement pwdtxt;
	
	@FindBy(xpath = "//*[@type = 'submit']")
	WebElement continuebtn;
	
	@FindBy(xpath = "//*[@id = 'content']")
	WebElement accounttxt;

	public void enterEmail(String mail) {
		
		emailtxt.sendKeys(mail);
	}
	
	public void enterPWD(String pwd) {
		pwdtxt.sendKeys(pwd);
	}
	
	public void tapOnContinue() {
		continuebtn.click();
	}
	
	public void assertLogin() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(accounttxt.isDisplayed(), "Login was not successfull");
	}

}
