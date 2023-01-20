package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
 
	public WebDriver driver;
	
	public SignUpPage(WebDriver driver1) {
		this.driver = driver1;
	}
	
	By signInLink = By.xpath("//a[@qaattr='signIn']");
	By googleBtnS = By.xpath("//button/picture/img[@alt='Google']"); 
	By firstNameBox = By.name("firstName");
	By lastNameBox = By.name("lastName");
	By enterEmailBox = By.name("email");
	By phoneNumberBox = By.name("phoneNumber");
	By newPasswordBox = By.name("password");
	By confirmPasswordBox = By.name("confirmPassword");
	By nextBtn = By.xpath("//button[@qaattr='commonButtonsNext']");
	By tCLink = By.xpath("//a[@qaattr='TC']");
	By privacyPolicyLink = By.xpath("//a[@qaattr='privacyPolicy']");
	
	public WebElement SignInLink() {
		return driver.findElement(signInLink);
	}
	
	public WebElement GoogleBtnS() {
		return driver.findElement(googleBtnS);
	}
	
	public WebElement FirstNameBox() {
		return driver.findElement(firstNameBox);
	}
	
	public WebElement LastNameBox() {
		return driver.findElement(lastNameBox);
	}
	
	public WebElement EnterEmailBox() {
		return driver.findElement(enterEmailBox);
	}
	
	public WebElement PhoneNumberBox() {
		return driver.findElement(phoneNumberBox);
	}
	
	public WebElement NewPasswordBox() {
		return driver.findElement(newPasswordBox);
	}
	
	public WebElement ConfirmPasswordBox() {
		return driver.findElement(confirmPasswordBox);
	}
	
	public WebElement NextBtn() {
		return driver.findElement(nextBtn);
	}
	
	public WebElement TcLink() {
		return driver.findElement(tCLink);
	}
	
	public WebElement PrivacyPolicyLink() {
		return driver.findElement(privacyPolicyLink);
	}
	
	// After Clicking Next
	By postalCodeBox = By.name("Enter Postal/ZIP code");
	By createAccountBtn = By.name("createAccount");
	By contactingUs = By.xpath("//button[text()='contacting us']");
	By privacyPolicy = By.xpath("//a[text()='Privacy Policy']");
	By checkBox = By.xpath("//input[@type='checkbox']");
	
	public WebElement PostalCodeBox() {
		return driver.findElement(postalCodeBox);
	}
	
	public WebElement CreateAccountBtn() {
		return driver.findElement(createAccountBtn);
	}
	
	public WebElement ContactingUs() {
		return driver.findElement(contactingUs);
	}
	
	public WebElement PrivacyPolicy() {
		return driver.findElement(privacyPolicy);
	}
	
	public WebElement CheckBox() {
		return driver.findElement(checkBox);
	}
	
	
}
