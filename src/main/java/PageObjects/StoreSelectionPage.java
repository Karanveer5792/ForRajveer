package PageObjects;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class StoreSelectionPage {
	WebDriver driver;
	public StoreSelectionPage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//button[@qaattr='store']")
	WebElement hearderStoreBtn;
	
	@FindBy(xpath = "//button[@qaattr='store']/div")
	WebElement selectedStoreName;
	
	@FindBy(xpath="//span[@aria-label='search']/following-sibling::input")
	WebElement searchForStore;
	
	@FindBy(xpath="//div[@class='ant-spin-container']/ul[@class='Stores_locationsList__OVgXS']/li")
	List<WebElement> listOfStores;
	public void HearderStoreBtn() {
		hearderStoreBtn.click();
		}
	
	public String SelectedStoreName() {
		return selectedStoreName.getText();
	}
	
	public WebElement SearchForStore() {
		return searchForStore;
	}
	
	public String GetStoreTimmings() {
		String currentUrl = driver.getCurrentUrl();
		hearderStoreBtn.click();
		searchForStore.sendKeys(selectedStoreName.getText());
		searchForStore.sendKeys(Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='ant-spin-container']/ul[@class='Stores_locationsList__OVgXS']/li")));
		WebElement selectedStore = listOfStores.stream().filter(li->li.findElement(By.xpath("//div/h4[@class='PickupCard_pickupCardTitle__RttF3']")).getText().contains(selectedStoreName.getText())).findFirst().orElse(null);
		String timings =selectedStore.findElement(By.xpath("//div[@class='ant-row-middle']/div/p[@class='FreshiiText_textMiddle__j2zhA']")).getText();
		driver.navigate().to(currentUrl);
		return timings;
		
	}
	
	
	
	
	
	
}
