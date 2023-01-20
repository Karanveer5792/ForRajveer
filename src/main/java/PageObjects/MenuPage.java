package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
	public WebDriver driver;
	public MenuPage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	// Header Section
	@FindBy(css=".AnchorMenu_anchorMenuLink__k86WL")
	List<WebElement> productCategoryNav;
	
	public void SelectProductCategoryFromNav(String category) {
		 System.out.println(category);
		WebElement selectCategory = productCategoryNav.stream().filter(item1->item1.getText().equals(category)).findFirst().orElse(null);
		System.out.println(selectCategory.getText());
		selectCategory.click();
	}
	// Header End
	// Middle Part
	
	// Dietary Preferences Part
	@FindBy(css=".Store_dietaryPrefBtnText__rSyta")
	WebElement dietaryPreferences;
	
	@FindBy(css=".ant-checkbox-wrapper")
	List<WebElement> dietaryPreferencesOptions;
	
	@FindBy(xpath="//div[@class='ant-modal-footer']/div/div/button[@qaattr='save']")
	WebElement saveDietryPreferenceBtn;
	
	public void SelectDietaryPreferences(String preferNotTo) {
		dietaryPreferences.click();
		WebElement preferences = dietaryPreferencesOptions.stream().filter(preference->preference.findElement(By.tagName("p")).getText().equals(preferNotTo)).findFirst().orElse(null);
		preferences.click();
		saveDietryPreferenceBtn.click();
		}
	
	// Dietary Preferences Part complete
	
	@FindBy(xpath="//button[@class='ProductCard_productCard__loo7_']")
	List<WebElement> foodItemOnMenu;
	
	public void SelectItemMenu(String itemName) {
		WebElement selectItem = foodItemOnMenu.stream().filter(item->item.findElement(By.tagName("h5")).getText().equals(itemName)).findFirst().orElse(null);
		selectItem.click();
	
	}
	
}
