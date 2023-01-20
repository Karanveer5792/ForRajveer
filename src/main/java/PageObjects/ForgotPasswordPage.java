package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	public WebDriver driver;
	
	public ForgotPasswordPage(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement enterYourEmail;
	
	@FindBy(xpath = "//button[@qaattr='forgotPassButtonsSend']")
	WebElement sendResetLinkBtn;
	
	public WebElement enterYourEmail() {
		return enterYourEmail;
	}
	public void SendResetLinkBtn() {
		sendResetLinkBtn.click();
	}
}
