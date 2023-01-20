package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import freemarker.core.ReturnInstruction.Return;

public class AfterSelectingItemFromMenuPage {


	public WebDriver driver;
	
	public AfterSelectingItemFromMenuPage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	// Already In
	@FindBy(id="rc-tabs-6-tab-1")
	WebElement alreadyIn;
	
	@FindBy(css=".ProductInfo_product__caEQa")
	List<WebElement> alreadyInIngredients;
	
	@FindBy(xpath="//div[@class='ant-popover-buttons']/button[@class='removeTooltipYes']")
	WebElement confirmYouWantToRemoveBtn;
	
	@FindBy(xpath="//div[@class='ant-modal-body']/div/div/div/div/button/div/div[2]/div/p[@class='ProductInfo_productName__dxNCp']")
	List<WebElement> optionToItemReplaceWith; // Maybe Works
	
	@FindBy(xpath="//div[@class='ant-modal-footer']/div/div/button[@qaattr='replace']")
	WebElement savetheReplaceChoiceBtn;
	
	public void RemoveAlreadyInIngredients(String ingred) {
		WebElement removeItem = alreadyInIngredients.stream().filter(al->al.findElement(By.cssSelector(".ProductInfo_productName__dxNCp")).getText().equals(ingred)).findFirst().orElse(null);
		removeItem.findElement(By.xpath("//span[@aria-label='delete']")).click();
		confirmYouWantToRemoveBtn.click();
	}
	
	public void ReplaceAlreadyInIngredients(String ExchangeItem, String withItem) {
		WebElement ReplaceItem = alreadyInIngredients.stream().filter(al->al.findElement(By.cssSelector(".ProductInfo_productName__dxNCp")).getText().equals(ExchangeItem)).findFirst().orElse(null);
		ReplaceItem.findElement(By.cssSelector(".StoreProduct_chosenProductActionIconContReplace__PmReZ")).click();
	    WebElement toReplaceWith = optionToItemReplaceWith.stream().filter(tr->tr.getText().equals(withItem)).findFirst().orElse(null);
	    toReplaceWith.click();
	    savetheReplaceChoiceBtn.click();
	}
	// This Comes for Few Items Not For all (Only the one with total custom items)
	@FindBy(id="rc-tabs-1-tab-Included Toppings")
	WebElement includedToppings;
	
	public void IncludedToppings() {
		includedToppings.click();
	}
	
	@FindBy(css=".ProductInfo_product__caEQa")
	List<WebElement> itemsInIncludedToppings;
	
	public void SelectYourIncludedToppings(String includedTop) {
		WebElement selectYourT = itemsInIncludedDressing.stream().filter(se->se.findElement(By.cssSelector(".ProductInfo_productName__dxNCp")).getText().equals(includedTop)).findFirst().orElse(null);
		selectYourT.findElement(By.xpath("//span[@aria-label='minus']/following::span[1]")).click();
	}
	
	@FindBy(id="rc-tabs-1-tab-Included Dressing")
	WebElement includedDressing;
	
	public void IncludedDressing() {
		includedDressing.click();
	}

	@FindBy(css=".ProductInfo_product__caEQa")
	List<WebElement> itemsInIncludedDressing;
	
	public WebElement SelectYourIncludedDressing(String includeddress) {
//		for(int i=0; i<itemsInIncludedDressing.size(); i++) {
//			System.out.println(itemsInIncludedDressing.get(i).findElement(By.cssSelector(".ProductInfo_productName__dxNCp")).getText());
//		}
		WebElement selectYour = itemsInIncludedDressing.stream().filter(se->se.findElement(By.cssSelector(".ProductInfo_productName__dxNCp")).getText().equals(includeddress)).findFirst().orElse(null);
		
		WebElement plus = selectYour.findElement(By.cssSelector("svg"));
		return plus;
		
	}
	
	// This Comes for Few Items Not For all (Only the one with total custom items) Till here
	@FindBy(id="rc-tabs-6-tab-2")
	WebElement addIngredients;
	
	@FindBy(id="rc-tabs-9-tab-Protein")
	WebElement addIngredientProtien;
	
	@FindBy(id="rc-tabs-9-tab-Extra Toppings")
	WebElement addIngredientExtraTopping;
	
	@FindBy(id="rc-tabs-9-tab-Extra Dressing")
	WebElement addIngredientExtraDressing;
	
	@FindBy(id="rc-tabs-9-tab-Base")
	WebElement addIngredientBase;
	
	public void AddIngredients() {
		addIngredients.click();
	}
	
	public void AddProtien() {
		addIngredientProtien.click();
	}
	
	// Add protein Menu Selection
	@FindBy(css=".ProductInfo_product__caEQa")
	List<WebElement> itemsInProtein;
	
	public void selectYourExtraProtien(String choiceOfExtraProtien) {
		WebElement selectThis = itemsInProtein.stream().filter(se->se.findElement(By.xpath("//p[@class='ProductInfo_productName__dxNCp']")).getText().equals(choiceOfExtraProtien)).findFirst().orElse(null);
		selectThis.findElement(By.xpath("//span[@qaattr='plus']/span")).click();
	}
	// Add protien Part Ends
	
	public void AddExtraTopping() {
		addIngredientExtraTopping.click();
	}
	// Add Extra Topping Menu Selection
	@FindBy(css=".ProductInfo_product__caEQa")
	List<WebElement> itemsInExtraTopping;
	
	public void selectYourExtraTopping(String choiceOfExtraTopping) {
		WebElement selectThisT = itemsInExtraTopping.stream().filter(se->se.findElement(By.xpath("//p[@class='ProductInfo_productName__dxNCp']")).getText().equals(choiceOfExtraTopping)).findFirst().orElse(null);
		selectThisT.findElement(By.xpath("//span[@qaattr='plus']/span")).click();
	}
	
	// Add Extra Topping Ends
	public void AddExtraDressing() {
		addIngredientExtraDressing.click();
	}
	
	// Add Extra Dressing Menu Selection
		@FindBy(css=".ProductInfo_product__caEQa")
		List<WebElement> itemsInExtraDressing;
		
		public void selectYourExtraDressing(String choiceOfExtraDressing) {
			WebElement selectThisD = itemsInExtraDressing.stream().filter(se->se.findElement(By.xpath("//p[@class='ProductInfo_productName__dxNCp']")).getText().equals(choiceOfExtraDressing)).findFirst().orElse(null);
			selectThisD.findElement(By.xpath("//span[@qaattr='plus']/span")).click();
		}
		
		// Add Extra Dressing Ends

	public void AddBase() {
		addIngredientBase.click();
	}

	// Add Extra Base Menu Selection
			@FindBy(css=".ProductInfo_product__caEQa")
			List<WebElement> itemsInExtraBase;
			
			public void selectYourExtraBase(String choiceOfExtraBase) {
				WebElement selectThisD = itemsInExtraBase.stream().filter(se->se.findElement(By.xpath("//p[@class='ProductInfo_productName__dxNCp']")).getText().equals(choiceOfExtraBase)).findFirst().orElse(null);
				selectThisD.findElement(By.xpath("//span[@qaattr='plus']/span")).click();
			}
			
	// Add Extra Base Ends
	
			
	// Footer Part
	
	@FindBy(xpath="//button[@qaattr='addToCart']")
	WebElement footerAddToCartBtn;
	
	@FindBy(xpath="//button[@class='ProductCount_productCountBtn__iYVPz']/span[@aria-label='minus']")
	WebElement decreaseQuantityOfItem;
	
	@FindBy(xpath="//button[@class='ProductCount_productCountBtn__iYVPz']/span[@aria-label='plus']")
	WebElement increaseQuantityOfItem;
	
	public void FooterAddToCartBtn() {
		footerAddToCartBtn.click();
	}
	
	public void DecreaseQuantityOfItem() {
		decreaseQuantityOfItem.click();
	}
	
	public void IncreaseQuantityOfItem() {
		increaseQuantityOfItem.click();
	}
	
	// After Clicking Add To cart Btn
	// Pick Up your protein pop up
	@FindBy(xpath="//div[@class='ant-modal-body']/div/div/div/div/div")
	List<WebElement> pickYourProteinIOption;
	@FindBy(xpath = "//div[@class='ant-modal-footer']/div/div/button[text()='NO THANKS']")
	WebElement noThanksBtn;
	
	public void PickckYourProteinIOption(String poteinType) {
		System.out.println(pickYourProteinIOption.size());
		WebElement selectProtein = pickYourProteinIOption.stream().filter(pi->pi.findElement(By.cssSelector(".ProductInfo_productName__dxNCp")).getText().contains(poteinType)).findFirst().orElse(null);
		selectProtein.findElement(By.xpath("//button[@qaattr='addProtein']")).click();
	}
	
	public void NoThanksBtn() {
		noThanksBtn.click();
	}
	
	// After Clicking No Thanks or selecting your protein
	@FindBy(tagName="textarea")
	WebElement specialInstructions;
	
	@FindBy(xpath="//div[@class='ant-modal-footer']/div/div/button[@qaattr='addTocart']")
	WebElement afterSpecialInstructionAddToCartBtn;
	
	public WebElement SpecialInstructions() {
		return specialInstructions;
	}
	
	public void AfterSpecialInstructionAddToCartBtn() {
		afterSpecialInstructionAddToCartBtn.click();
	}
	
	// After Completing Last Step
	// CheckOut Btn on Menu Page
	@FindBy(xpath="//button[@qaattr='checkout']")
	WebElement checkOutBtnOnMenuPage;
	
	public void CheckOutBtnOnMenuPage() {
		checkOutBtnOnMenuPage.click();
	}
	
	@FindBy(xpath="//div[@class='ant-modal-body']/div/div/div/div")
	List<WebElement> finalSelectionAfterClickingAddToCartBtn;
	
	@FindBy(xpath="//div[@class='ant-modal-footer']/div/div/button")
	WebElement confirmTheItem;
	
	public void FinalSelectionAfterClickingAddToCartBtn(String choiceOfItem) {
		
		WebElement choosed = finalSelectionAfterClickingAddToCartBtn.stream().filter(ch->ch.findElement(By.cssSelector(".ProductInfo_productName__dxNCp")).getText().contains(choiceOfItem)).findFirst().orElse(null);
		choosed.findElement(By.xpath("//button[@qaattr='addProduct']")).click();
		confirmTheItem.click();
	}
}
