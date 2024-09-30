package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
	
	public RegistrationPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(name = "firstname")
	WebElement frstnametxt;
	
	@FindBy(name = "lastname")
	WebElement lastnametxt;
	
	@FindBy(name = "email")
	WebElement emailtxt;
	
	@FindBy(name = "telephone")
	WebElement teletxt;
	
	@FindBy(name = "password")
	WebElement pwdtxt;
	
	@FindBy(name = "confirm")
	WebElement confirmtxt;
	
	@FindBy(name = "agree")
	WebElement checkbox;
	
	@FindBy(xpath = "//*[@type = 'submit']")
	WebElement acceptbtn;
	
	
	
	public void enterFirstName(String fname) {
		frstnametxt.sendKeys(fname);
	}
	
	public void enterLastName(String lname) {
		lastnametxt.sendKeys(lname);
	}
	
	public void enterEmail(String ename) {
		emailtxt.sendKeys(ename);
	}
	
	public void enterPhone(String pname) {
		teletxt.sendKeys(pname);
	}
	
	public void enterPassword(String pword) {
		pwdtxt.sendKeys(pword);
		confirmtxt.sendKeys(pword);
	}
	
	public void tapOnCheckBox() {
		checkbox.click();
	}
	
	public void tapOnContinue() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, document.body.scrollByHeight)");
		
		js.executeScript("arguments[0].scrollIntoView();", acceptbtn);
		acceptbtn.click();
	}
}
