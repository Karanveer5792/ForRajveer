// need to add date of birth calendar option 

package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountDetailsPage {
	WebDriver driver;
	public AccountDetailsPage(WebDriver driver1) {
		this.driver=driver1;
	}
	
	By detailsEditOption = By.xpath("//span[@aria-label='edit']");
	By firstNameBox = By.name("firstName");
	By lastNameBox = By.name("lastName");
	By enterEmailBox = By.name("email");
	By phoneNumberBox = By.name("phoneNumber");
	By postalCode = By.name("postalCode");
	By changePassword = By.xpath("//button[text()='CHANGE PASSWORD']");
	By oldPasswordBox = By.name("oldPassword");
	By newPasswordBox = By.name("password");
	By confirmPasswordBox = By.name("confirmPassword");
	By changePasswordBtn = By.xpath("//div[class='ant-modal-footer']/div/div/button[text()='CHANGE PASSWORD']");
	By deleteMyAccount = By.xpath("//button[text()='DELETE MY ACCOUNT']");
	By cancelDeleteMyAccount = By.xpath("//button/span/span[@aria-label='close']");
	By deleteAccVerify = By.name("deleteAcc");
	By deleteMyAccountBtn = By.xpath("//div[@class='ant-modal-footer']/div/div/button[text()='DELETE MY ACCOUNT']");
	By discardChangesBtn = By.xpath("//button[text()='DISCARD']");
	By 	saveChangesBtn = By.xpath("//button[text()='SAVE']");
	
	public WebElement DetailsEditOption() {
		return driver.findElement(detailsEditOption);
	}
	
	public WebElement FirstNameBox() {
		return driver.findElement(firstNameBox);
	}
	
	public WebElement EnterEmailBox() {
		return driver.findElement(enterEmailBox);
	}
	
	public WebElement PhoneNumberBox() {
		return driver.findElement(phoneNumberBox);
	}
	
	public WebElement PostalCode() {
		return driver.findElement(postalCode);
	}
	
	public WebElement ChangePassword() {
		return driver.findElement(changePassword);
	}
	
	public WebElement OldPasswordBox() {
		return driver.findElement(oldPasswordBox);
	}
	
	public WebElement NewPasswordBox() {
		return driver.findElement(newPasswordBox);
	}
	
	public WebElement ConfirmPasswordBox() {
		return driver.findElement(confirmPasswordBox);
	}
	
	public WebElement ChangePasswordBtn() {
		return driver.findElement(changePasswordBtn);
	}
	
	public WebElement DeleteMyAccount() {
		return driver.findElement(deleteMyAccount);
	}
	
	public WebElement CancelDeleteMyAccount() {
		return driver.findElement(cancelDeleteMyAccount);
	}
	
	public WebElement DeleteAccVerify() {
		return driver.findElement(deleteAccVerify);
	}
	
	public WebElement DeleteMyAccountBtn() {
		return driver.findElement(deleteMyAccountBtn);
	}
	
	public WebElement DiscardChangesBtn() {
		return driver.findElement(discardChangesBtn);
	}
	
	public WebElement SaveChangesBtn() {
		return driver.findElement(saveChangesBtn);
	}
}
