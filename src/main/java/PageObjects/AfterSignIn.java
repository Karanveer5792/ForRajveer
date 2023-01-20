package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterSignIn {
	WebDriver driver;
	public AfterSignIn(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	// Header Part
	By userProfile = By.xpath("//button[@qaattr='userProfile']");
	By accountDetails = By.xpath("//a[@qaattr='details']");
	By orderHistory = By.xpath("//a[@qaattr='orderHistory']");
	By paymentMethods =  By.xpath("//a[@qaattr='payMethod']");
	By giftCards = By.xpath("//button[@qaattr='giftCards']");
	By logOutBtn = By.xpath("//button[@qaattr='logout']");
	
	public WebElement UserProfile() {
		return driver.findElement(userProfile);
	}
	
	public WebElement AccountDetails() {
		 driver.findElement(userProfile).click();
		 return driver.findElement(accountDetails);
	}
	
	public WebElement OrderHistory() {
		 driver.findElement(userProfile).click();;
		 return driver.findElement(orderHistory);
	}
	
	public WebElement PaymentMethods() {
		 driver.findElement(userProfile).click();;
		 return driver.findElement(paymentMethods);
	}
	
	public WebElement GiftCards() {
		 return driver.findElement(giftCards);
	}
	
	public WebElement LogOutBtn() {
		 driver.findElement(userProfile).click();;
		 return driver.findElement(logOutBtn);
	}
	// Header Part Ends
	// Middle Part
	@FindBy(xpath="//button[text()='ORDER NOW']")
	public WebElement orderNowBtn;
	
	public void OrderNowBtn() {
		orderNowBtn.click();
	}
	
} 
