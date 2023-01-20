package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCardsPage {
	WebDriver driver;
	public GiftCardsPage(WebDriver driver1) {
		this.driver=driver1;
	}
	
	By myGiftCards = By.xpath("//div[text()='My Gift Cards']");
	By sendGiftCard = By.xpath("//div[text()='Send Gift Card']");
	By addGiftCard = By.xpath("//button[text()='ADD GIFT CARD']");
	By enterGiftCardNumber = By.name("giftCardNumber");
	By addGiftCardBtn = By.xpath("//button[@qaattr='addGiftCard']");
	By addFunds = By.xpath("(//div[@role='tab'])[3]");
	By autoLoad = By.xpath("(//div[@role='tab'])[4]");
	
	public void AddFunds() {
		driver.findElement(addFunds).click();
	}
	
	// After Clicking on Add funds
	@FindBy(xpath="//button[@class='GiftCards_selectAmount__PnxYw']")
	List<WebElement> giftCardSelectAmount;
	
	@FindBy(xpath="//button[@class='GiftCards_selectAmount__PnxYw'][2]")
	WebElement addDollar25;
	
	public void AddDollar25() {
		addDollar25.click();
	}
	public void GiftCardSelectAmount(String amt) {
		for(int i=0; i < giftCardSelectAmount.size(); i++) {
			System.out.println(giftCardSelectAmount.get(i).findElement(By.tagName("p")).getText());
		}
		WebElement selectedAmount = giftCardSelectAmount.stream().filter(ai->ai.findElement(By.tagName("p")).getText().equals(amt)).findFirst().orElse(null);
		selectedAmount.click();
	}
	
	@FindBy(xpath="//button/p[@class='FreshiiText_freshiiText__aBp2F FreshiiText_textGreenColor__SkV6N FreshiiText_textMiddle__j2zhA'][text()='SELECT']")
	WebElement selectPaymentMethod;
	
	public void SelectPaymentMethod() {
		selectPaymentMethod.click();
	}
	
	@FindBy(xpath="//div[@qaattr='payMethod']")
	WebElement addCreditCardOpt;
	
	public void AddCreditCardOpt() {
		addCreditCardOpt.click();
	}
	
	@FindBy(id = "ccnumfield")
	WebElement cardNumber;
	
	@FindBy(id = "ccexpiryfieldmonth")
	WebElement expiryfieldmonth;
	
	@FindBy(id = "ccexpiryfieldyear")
	WebElement expiryfieldyear;
	
	@FindBy(id="cccvvfield")
	WebElement cvvfield;
	
	public WebElement CardNumber() {
		return cardNumber;
	}
	
	public WebElement Expiryfieldmonth() {
		return expiryfieldmonth;
	}
	
	public WebElement Expiryfieldyear() {
		return expiryfieldyear;
	}
	
	public WebElement Cvvfield() {
		return cvvfield;
	}
	
	
}
