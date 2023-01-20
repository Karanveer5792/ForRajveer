package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	public WebDriver driver;
	public LandingPage(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	// header Start
	 By homeBtn = By.xpath("//picture/img[@alt='Freshii']");
	 By pickupBtn = By.xpath("//button/p[text()='PICKUP']");
	 By deliveryBtn = By.xpath("//button/p[text()='DELIVERY']");
	 By locationSet = By.xpath("//button[@qaattr='store']");
	 By cartBtn = By.xpath("//button[@qaattr='cart']");
	public By userProfile = By.xpath("//button[@qaattr='userProfile']");
	 By userProfileSignIn = By.xpath("//button[@qaattr='signIn']");
	 By userProfileHelp = By.xpath("//button[@qaattr='help']");
	 By userProfileFAQs = By.xpath("//button[@qaattr='faq']");
	 By userProfileTerms = By.xpath("//button[@qaattr='legal']");
	 By userProfilePrivacyPolicy = By.xpath("//button[@qaattr='privacy']");
	 	
	 
	 
	 public WebElement HomeBtn() {
		return driver.findElement(homeBtn);
	 }
	 
	 public WebElement PickupBtn() {
			return driver.findElement(pickupBtn);
		 }
	 
	 public WebElement DeliveryBtn() {
			return driver.findElement(deliveryBtn);
		 }
	 
	 public WebElement LocationSet() {
			return driver.findElement(locationSet);
		 }
	 
	 public WebElement CartBtn() {
			return driver.findElement(cartBtn);
		 }
	
	 public void UserProfile() {
			 driver.findElement(userProfile).click();
		 }
	 
	 public void UserProfileSignIn() {
			driver.findElement(userProfileSignIn).click();;
		 }
	 
	 public WebElement UserProfileHelp() {
			return driver.findElement(userProfileHelp);
		 }
	 
	 public void UserProfileFAQs() {
			driver.findElement(userProfileFAQs).click();;
		 }
	 
	 public void UserProfileTerms() {
			driver.findElement(userProfileTerms).click();;
		 }
	 
	 public void UserProfilePrivacy() {
			 driver.findElement(userProfilePrivacyPolicy).click();
		 }
	 
	// header End
	 
	 // Middle Part - Still left to be added later
	 
	 @FindBy(xpath="//span/p[text()='0 Points']")
	 WebElement pointBtn;
	 
	 @FindBy(xpath="//a[@qaattr='offer']")
	 List<WebElement> MovingObjects1;
	 
	 @FindBy(css=".Home_orderFoodBtn__U6gT1")
	 List<WebElement> MovingObjects2;
	 By orderNow = By.xpath("//button[text()='ORDER NOW']");
	 
	 public WebElement Deals() {
		return MovingObjects1.get(2);
	 }
	 public WebElement FoodOptions(String productName) { // need to fix this code of WebElement
		 //WebElement prod = MovingObjects2.stream().filter(product->product.findElement(By.tagName("p")).getText().equals(productName)).findFirst().orElse(null);
		// prod.findElement(By.tagName("img"));
		return  MovingObjects2.get(4);
		 
	 }
	 
	 public WebElement OrderNow() {
		 return driver.findElement(orderNow);
	 }
	 
	 // Middle Part End
	 // Footer
	 By franchisingLink = By.xpath("//div/a[text()='Franchising']");
	 By diversityLink = By.xpath("//div/a[text()='Diversity']");
	 By investorRelationsLink = By.xpath("//div/a[text()='Investor Relations']");
	 By nutritionalInfoLink = By.xpath("//div/a[text()='Nutritional Info']");
	 By aboutLink = By.xpath("//div/a[text()='About']");
	 By conditionsLink = By.xpath("//div/a[text()='Terms & Conditions']");
	 By fAQsLink = By.xpath("//div/a[text()='FAQs']");
	 By contactUsLink = By.xpath("//button/p[text()='Contact us']");
	 By privacyPolicyLink = By.xpath("//div/a[text()='Privacy policy']");
	 By careersLink = By.xpath("//div/a[text()='Careers']");
	 By googlePlay = By.xpath("//a[@href='https://play.google.com/store/apps/details?id=com.freshii.freshii']//picture//img[@alt='Freshii']");
	 By appStore = By.xpath("//img[@src='/images/logos/download-ios.svg']");
	 
	 public WebElement FranchisingLink() {
		 return driver.findElement(franchisingLink);
	 }
	 
	 public WebElement DiversityLink() {
		 return driver.findElement(diversityLink);
	 }
	 
	 public WebElement NutritionalInfoLink() {
		 return driver.findElement(nutritionalInfoLink);
	 }
	 
	 public WebElement AboutLink() {
		 return driver.findElement(aboutLink);
	 }
	 
	 public WebElement ConditionsLink() {
		 return driver.findElement(conditionsLink);
	 }
	 
	 public WebElement FAQsLink() {
		 return driver.findElement(fAQsLink);
	 }
	 
	 public WebElement ContactUsLink() {
		 return driver.findElement(contactUsLink);
	 }
	 
	 public WebElement PrivacyPolicyLink() {
		 return driver.findElement(privacyPolicyLink);
	 }
	 
	 public WebElement CareersLink() {
		 return driver.findElement(careersLink);
	 }
	 
	 public WebElement GooglePlay() {
		 return driver.findElement(googlePlay);
	 }
	 public WebElement AppStore() {
		 return driver.findElement(appStore);
	 }
	// Footer End 
	 
	
}
