package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	public WebDriver driver;
	public SignInPage(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailBox;
	By passwordBox = By.name("password");
	By forgotPasswordLink = By.xpath("//a[@qaattr='forgotPass']");
	By signInBtn = By.xpath("//button[@qaattr='commonButtonsSignIn']");
	By signUpBtn = By.xpath("//button[@qaattr='signup']");
	By googleBtn = By.xpath("//button/picture/img[@alt='Google']");
	
	public WebElement EmailBox() {
		return emailBox;
	}
	
	public WebElement PasswordBox() {
		return driver.findElement(passwordBox);
	}
	
	public void ForgotPasswordLink() {
		 driver.findElement(forgotPasswordLink).click();;
	}
	
	public void SignInBtn() {
		driver.findElement(signInBtn).click();;
	}
	
	public void SignUpBtn() {
		driver.findElement(signUpBtn).click();;
	}
	
	public void GoogleBtn() {
		driver.findElement(googleBtn).click();
	}
	
	
}
