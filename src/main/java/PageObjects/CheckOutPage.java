package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckOutPage {
	
	public WebDriver driver;
	public CheckOutPage(WebDriver driver1) {
		this.driver =driver1;
		PageFactory.initElements(driver, this);
	}
	// header Section
	@FindBy(xpath="//header/section/div/picture/img[@alt='Freshii']")
	WebElement freshiiLogo;
	
	@FindBy(xpath="//button[@qaattr='cart']")
	WebElement cartBtn;
	
	public WebElement 	CartBtn() {
		return cartBtn;
	}
	
	public WebElement 	FreshiiLogo() {
		return freshiiLogo;
	}
	By userProfile = By.xpath("//button[@qaattr='userProfile']");
	By accountDetails = By.xpath("//a[@qaattr='details']");
	By orderHistory = By.xpath("//a[@qaattr='orderHistory']");
	By paymentMethods =  By.xpath("//a[@qaattr='payMethod']");
	By giftCards = By.xpath("//a[@qaattr='giftCards']");
	By logOutBtn = By.xpath("//button[@qaattr='logout']");
	
	public WebElement UserProfile() {
		return driver.findElement(userProfile);
	}
	
	public WebElement AccountDetails() {
		 driver.findElement(userProfile).click();;
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
		 driver.findElement(userProfile).click();;
		 return driver.findElement(giftCards);
	}
	
	public WebElement LogOutBtn() {
		 driver.findElement(userProfile).click();
		 return driver.findElement(logOutBtn);
	}
	
	// Middle Section
	
	@FindBy(xpath="//button/p[text()='PICKUP']")
	WebElement pickupBtn;
	
	@FindBy(xpath="//button/p[text()='DELIVERY']")
	WebElement deliveryBtn;
	
	@FindBy(xpath="//button/span[@aria-label='edit']")
	WebElement locationEditBtn;
	
	@FindBy(xpath="//button/span[@aria-label='SCHEDULE']")
	WebElement scheduleBtn;
	
	@FindBy(css=".ant-collapse-header")
	WebElement orderCollapseBar;
	
	// IN Collapse Bar
	@FindBy(xpath="//button[@qaattr='edit'][text()='EDIT ITEM']")
	WebElement eDITITEM;
	
	@FindBy(xpath="//button[@qaattr='edit'][text()='EDIT INSTRUCTIONS']")
	WebElement eDITINSTRUCTIONS;
	
	@FindBy(xpath="//button[@qaattr='remove'][text()='REMOVE']")
	WebElement rEMOVEItemBtn;
	// IN Collapse Bar Ends
	
	@FindBy(xpath="//button[@qaattr='addItems']")
	WebElement addItemsBtn;
	
	@FindBy(xpath="//div/p[text()='Cutlery']/following-sibling::button")
	WebElement cutleryBtn;
	
	@FindBy(xpath="//body/div[@id='__next']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[7]/div[1]/div[1]/div[2]/div[5]/div[2]/button[1]")
	WebElement redeemPointsBtn;
	
	@FindBy(xpath="//div[@qaattr='payMethod']")
	WebElement selectPayMethod;
	
	@FindBy(xpath="//div/h4[text()='Promotions']")
	WebElement checkPromotionsBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter promo code']")
	WebElement promoCodeInput;
	
	@FindBy(xpath="//div/button[text()='APPLY']")
	WebElement promoCodeApplyBtn;
	
	@FindBy(xpath="//div/button[@qaattr='placeOrder'][text()='PLACE ORDER']")
	WebElement finalPlaceOrderBtn;
	
	
	
	public WebElement PickupBtn() {
		 
		 return pickupBtn;
	}
	
	public WebElement DeliveryBtn() {
		
		 return deliveryBtn;
	}
	
	public WebElement LocationEditBtn() {
	
		 return locationEditBtn;
	}
	
	public WebElement ScheduleBtn() {
		
		 return scheduleBtn;
	}
	
	public WebElement OrderCollapseBar() {
		
		 return orderCollapseBar;
	}
	
	public WebElement EDITINSTRUCTIONS() {
		// Inside Collapse Bar of Order
		 return eDITINSTRUCTIONS;
	}
	
	public WebElement EDITITEM() {
		// Inside Collapse Bar of Order
		 return eDITITEM;
	}
	
	public WebElement REMOVEItemBtn() {
		// Inside Collapse Bar of Order
		 return rEMOVEItemBtn;
	}
	
	public WebElement AddItemsBtn() {
		 return addItemsBtn;
	}
	
	public WebElement CutleryBtn() {
		 return cutleryBtn;
	}
	
	public WebElement RedeemPointsBtn() {
		 return redeemPointsBtn;
	}
	
	public void SelectPayMethod() {
		 selectPayMethod.click();;
	}
	
	// After Clicking Select Pay Method
	@FindBy(xpath = "//div[@qaattr='addCreditDebitCard']")
	WebElement addCreditDebitCard;
	
	@FindBy(xpath = "div[@class='ant-modal-body']/div/div/div[@qaattr='addGiftCard']")
	WebElement addGiftCard;
	
	public void AddCreditDebitCard() {
		addCreditDebitCard.click();
	}
	// After Selecting addCreditDebitCard
	@FindBy(id = "ccnumfield")
	WebElement cardNumber;
	
	@FindBy(id="//form/input[@id='ccexpiryfieldmonth']")
	WebElement expirymonth;
	
	@FindBy(id="ccexpiryfieldyear")
	WebElement expiryYear;
	
	@FindBy(id="cccvvfield")
	WebElement enterCvv;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement nameOnCard;
	
	@FindBy(xpath="//input[@name='postCode']")
	WebElement postalCode;
	
	@FindBy(xpath="//div[@class='ant-modal-footer']/div/div/button[text()='SAVE CARD']")
	WebElement saveCreditCard;
	
	public WebElement CardNumber() {
		return cardNumber;
	}
	
	public WebElement Expirymonth() {
		return expirymonth;
	}
	
	public WebElement ExpiryYear() {
		return expiryYear;
	}
	
	public WebElement EnterCvv() {
		return enterCvv;
	}
	
	public WebElement NameOnCard() {
		return nameOnCard;
	}
	
	public WebElement PostalCode() {
		return postalCode;
	}
	
	public void SaveCreditCard() {
		 saveCreditCard.click();;
	}

	// Credit Card Imformation Fields End Here


	public void AddGiftCard() {
		addGiftCard.click();
	}
	
	// After Clicking Select Pay by Gift Card
	@FindBy(xpath = "//input[@name='giftCardNumber']")
	WebElement enterGiftCardNumber;
	
	@FindBy(xpath = "//input[@qaattr='addGiftCard']")
	WebElement addGiftCardBtn;
	
	public WebElement EnterGiftCardNumber() {
		return enterGiftCardNumber;
	}
	
	public void AddGiftCardBtn() {
		addGiftCardBtn.click();
	}
	
	// Pay by Gift Card Fields end
	
	public WebElement CheckPromotionsBtn() {
		 return checkPromotionsBtn;
	}
	
	public WebElement PromoCodeInput() {
		 return promoCodeInput;
	}
	
	public WebElement PromoCodeApplyBtn() {
		 return promoCodeApplyBtn;
	}
	
	public WebElement FinalPlaceOrderBtn() {
		 return finalPlaceOrderBtn;
	}
	
	// Tips Section
	@FindBy(xpath="//button[@class='Cart_selectTip__lkmyI']/p[text()='5']")
	WebElement tip5Percent;
	
	@FindBy(xpath="//button[@class='Cart_selectTip__lkmyI']/p[text()='10']")
	WebElement tip10Percent;
	
	@FindBy(xpath="//button[@class='Cart_selectTip__lkmyI']/p[text()='15']")
	WebElement tip15Percent;
	
	@FindBy(xpath="//button[@class='Cart_selectTip__lkmyI']/p[text()='Other']")
	WebElement tipOtherPercent;
	
	@FindBy(xpath="//span[text()='$']/following-sibling::input")
	WebElement enterTipAmount;
	
	@FindBy(xpath="//div[@class='ant-modal-footer']/div/div/button[text()='SAVE']")
	WebElement saveTipAmount;
	
	public WebElement Tip5Percent() {
		 return tip5Percent;
	}
	
	public WebElement Tip10Percent() {
		 return tip10Percent;
	}
	
	public WebElement Tip15Percent() {
		 return tip15Percent;
	}
	
	public WebElement EnterTipOtherPercent() {
		  tipOtherPercent.click();
		  return enterTipAmount;
	}
	
	public WebElement SaveTipAmount() {
		 return saveTipAmount;
	}
	// Tip Section End
	
	

	
	
	
	
	
	
	
}
