package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterSignInConfirmingStore {
	WebDriver driver;
	public AfterSignInConfirmingStore(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='ant-modal-footer']/div/div/button[text()='CONFIRM']")
	WebElement confirmStoreSelection;
	
	public void ConfirmStoreSelection() {
		confirmStoreSelection.click();
	}
}
