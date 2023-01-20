package TestCases;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.AfterSelectingItemFromMenuPage;
import PageObjects.AfterSignIn;
import PageObjects.AfterSignInConfirmingStore;
import PageObjects.DemoPage;
import PageObjects.LandingPage;
import PageObjects.MenuPage;
import PageObjects.NotificationPageRareUse;
import PageObjects.SignInPage;

public class FWA_029_TestCase extends BaseClass {

	@Test(priority = 1)
	public void SignIn() throws InterruptedException {
		DemoPage demoPage = new DemoPage(driver);
		Actions actions = new Actions(driver);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		demoPage.PostalCode().sendKeys(PostalCode);
		demoPage.FindStoreBtn();
		
		Thread.sleep(2000);
		// Landing Page Loads
		LandingPage landingPage = new LandingPage(driver);
		//wait.until(ExpectedConditions.elementToBeClickable(landingPage.userProfile()));
		//wait.until(ExpectedConditions.presenceOfElementLocated(landingPage.userProfile));
		//actions.moveToElement(landingPage.UserProfile()).click().build().perform();
	
		landingPage.UserProfile();
		landingPage.UserProfileSignIn();

		// Sign Page Opens
		SignInPage signInPage = new SignInPage(driver);
		//wait.until(ExpectedConditions.visibilityOf(signInPage.EmailBox()));
		signInPage.EmailBox().sendKeys(UserEmail1);
		signInPage.PasswordBox().sendKeys(Password1);
		signInPage.SignInBtn();
	}
	
	@Test(priority = 2)
	public void Ordering() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// After Sign In - Signed In Page Opens
		AfterSignIn afterSignIn = new AfterSignIn(driver);
		afterSignIn.OrderNowBtn();

		// Pop Up To confirm Store Selection
		Thread.sleep(2000);
		AfterSignInConfirmingStore afterSignInConfirmingStore = new AfterSignInConfirmingStore(driver);
		afterSignInConfirmingStore.ConfirmStoreSelection();
		
		// Lands on Menu Page
		Thread.sleep(2000);
		MenuPage menuPage = new MenuPage(driver);
		menuPage.SelectProductCategoryFromNav("Bowls");
		Thread.sleep(2000);
		menuPage.SelectItemMenu("Custom Salad");
		
		// When Selecting Custom Items or Custom Salad from menu this Notification need to be clear
		//Thread.sleep(2000);
		NotificationPageRareUse notificationPageRareUse = new NotificationPageRareUse(driver);
		notificationPageRareUse.GotItBtn();
		
		// Item Selected - Lands on page After Selecting Item From Menu Page
		Thread.sleep(2000);
		AfterSelectingItemFromMenuPage afterSelectingItemFromMenuPage = new AfterSelectingItemFromMenuPage(driver);
		//afterSelectingItemFromMenuPage.AddIngredients();
		afterSelectingItemFromMenuPage.IncludedDressing();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement plus1 = afterSelectingItemFromMenuPage.SelectYourIncludedDressing("Balsamic Vinaigrette");
		js.executeScript("arguments[0].scrollIntoView();", plus1);
		Thread.sleep(2000);
		afterSelectingItemFromMenuPage.IncludedToppings();
		Thread.sleep(2000);
		afterSelectingItemFromMenuPage.SelectYourIncludedToppings("Beet Slaw");
		Thread.sleep(2000);

		afterSelectingItemFromMenuPage.SelectYourIncludedToppings("Black Beans");
		Thread.sleep(2000);

		afterSelectingItemFromMenuPage.SelectYourIncludedToppings("Cabbage");
		Thread.sleep(2000);

		afterSelectingItemFromMenuPage.IncludedDressing();
		afterSelectingItemFromMenuPage.SelectYourIncludedDressing("Vinegar");
		afterSelectingItemFromMenuPage.FooterAddToCartBtn();
		
		// New window pops up
		afterSelectingItemFromMenuPage.SpecialInstructions().sendKeys("Working till here");
		afterSelectingItemFromMenuPage.AfterSpecialInstructionAddToCartBtn();
		
		
		

	}
}
