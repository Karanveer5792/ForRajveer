package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotificationPageRareUse {
	WebDriver driver;
	public NotificationPageRareUse(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='GOT IT']")
	WebElement gotItBtn;
	
	public void GotItBtn() {
		gotItBtn.click();
		
	}
	
	// Incase Of Store closed - PopUp that comes
	@FindBy(xpath = "//div/button[text()='CHANGE STORE']")
	WebElement changeStore;
	
	@FindBy(xpath = "//div[@class='ant-modal-footer']/div/div[2]/button[text()='SCHEDULE ORDER']")
	WebElement sCHEDULEORDER;
	
	@FindBy(xpath = "//div/button[text()='BACK HOME']")
	WebElement bACKHOME;
	
	public void ChangeStore() {
		changeStore.click();
	}
	
	public void SCHEDULEORDER() {
		sCHEDULEORDER.click();
	}
	// After Clicking Schedule Pickup time
	@FindBy(xpath = "//div[@class='ant-modal-footer']/div/div/button[text()='SCHEDULE']")
	WebElement toConfirmScheduleTimmingBtn;
	
	public void ToConfirmScheduleTimmingBtn() {
		toConfirmScheduleTimmingBtn.click();
	}
	
	// Scheduling Complete
	public void BACKHOME() {
		bACKHOME.click();
	}
	
	// Successfully Added Notification after item has been added
	@FindBy(xpath = "//span[text()='Product succesfully added!']")
	WebElement noticationItemHasBeenAdded;
	
	public WebElement NoticationItemHasBeenAdded() {
		return noticationItemHasBeenAdded;
	}
}
