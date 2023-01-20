package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoPage {
	public WebDriver driver;
	
	public DemoPage(WebDriver driver1) {
		this.driver = driver1;
		
	}
	
	By postalCode = By.name("postalCode");
	By findStoreBtn = By.xpath("//button[text()='FIND STORE']");
	
	public WebElement PostalCode() {
		return driver.findElement(postalCode);
	}
	
	public void FindStoreBtn() {
		 driver.findElement(findStoreBtn).click();
	}
}
