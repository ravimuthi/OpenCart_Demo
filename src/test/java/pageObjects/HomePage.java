package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
		
	public HomePage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath = "//*[text() = 'My Account']")
	WebElement myAccount;
	
	@FindBy(xpath = "//*[text() = 'Register']")
	WebElement registerbtn;
	
	@FindBy(xpath = "//*[text() = 'Login']")
	WebElement loginbtn;
	
	public void tapOnMyAccount() {
		myAccount.click();
	}
	
	public void tapOnRegister() {
		registerbtn.click();
	}
	
	public void tapOnLogin() {
		loginbtn.click();
	}
}
