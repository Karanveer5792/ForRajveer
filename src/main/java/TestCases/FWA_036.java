//Verify end-end workflow using Freshii User : Browse Menu available now.
package TestCases;

import org.testng.annotations.Test;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseClass;
import PageObjects.AfterSelectingItemFromMenuPage;
import PageObjects.AfterSignIn;
import PageObjects.AfterSignInConfirmingStore;
import PageObjects.CheckOutPage;
import PageObjects.DemoPage;
import PageObjects.LandingPage;
import PageObjects.MenuPage;
import PageObjects.NotificationPageRareUse;
import PageObjects.SignInPage;
import PageObjects.StoreSelectionPage;


public class FWA_036 extends BaseClass {

	@Test(priority = 1)
	public void Login() throws InterruptedException {
		logger.info("Started FWA_036");
		DemoPage demoPage = new DemoPage(driver);
		NotificationPageRareUse notificationPageRareUse = new NotificationPageRareUse(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		demoPage.PostalCode().sendKeys(PostalCode);
		logger.info("Sending Postal Code");
		demoPage.FindStoreBtn();
		
		// Landing Page Loads
		Thread.sleep(2000);
		logger.info("Landed on home page");
		LandingPage landingPage = new LandingPage(driver);
		
		//wait.until(ExpectedConditions.elementToBeClickable(landingPage.userProfile));
		logger.info("Trying to find element");
		wait.until(ExpectedConditions.presenceOfElementLocated(landingPage.userProfile));
		logger.info("User Profile Element found");
		
		landingPage.UserProfile();
		landingPage.UserProfileSignIn();
		
		// Sign Page Opens
		SignInPage signInPage = new SignInPage(driver);
		//wait.until(ExpectedConditions.visibilityOf(signInPage.EmailBox()));
		Thread.sleep(1000);
		signInPage.EmailBox().sendKeys(UserEmail1);
		signInPage.PasswordBox().sendKeys(Password1);
		signInPage.SignInBtn();
	}
	
	@Test(priority = 2)
	public void OrderNow() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		NotificationPageRareUse notificationPageRareUse = new NotificationPageRareUse(driver);
		// After Sign In - Signed In Page Opens
		AfterSignIn afterSignIn = new AfterSignIn(driver);
		wait.until(ExpectedConditions.elementToBeClickable(afterSignIn.orderNowBtn));
		afterSignIn.OrderNowBtn();

		// Pop Up To confirm Store Selection
		Thread.sleep(2000);
		AfterSignInConfirmingStore afterSignInConfirmingStore = new AfterSignInConfirmingStore(driver);
		afterSignInConfirmingStore.ConfirmStoreSelection();

		// Lands on Menu Page
		Thread.sleep(1000);
		MenuPage menuPage = new MenuPage(driver);
		menuPage.SelectProductCategoryFromNav("Soups");
		Thread.sleep(1000);
		menuPage.SelectItemMenu("Tortilla Soup (Small)");
		
			// Item Selected - Lands on page After Selecting Item From Menu Page
		
		AfterSelectingItemFromMenuPage afterSelectingItemFromMenuPage = new AfterSelectingItemFromMenuPage(driver);
		Thread.sleep(1000);
		//afterSelectingItemFromMenuPage.RemoveAlreadyInIngredients("Avocado");
		//afterSelectingItemFromMenuPage.ReplaceAlreadyInIngredients("Tortilla Chips", "Green Onions");
		afterSelectingItemFromMenuPage.IncreaseQuantityOfItem();
		afterSelectingItemFromMenuPage.FooterAddToCartBtn();
		Thread.sleep(1000);
		afterSelectingItemFromMenuPage.PickckYourProteinIOption("Chicken");
		Thread.sleep(1000);
		afterSelectingItemFromMenuPage.SpecialInstructions().sendKeys("Reched at this step");
		afterSelectingItemFromMenuPage.AfterSpecialInstructionAddToCartBtn();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Product succesfully added!']")));
		if(notificationPageRareUse.NoticationItemHasBeenAdded().getText().contains("Product succesfully added"))
		{
			//softassert.assertTrue(true);
			logger.info("Item Has Been added To Cart");	
		}
		else
		{
			//softassert.assertTrue(false);
			logger.error("Service NOT created");
			//captureScreen(driver,"ServiceNotCreated");
		}
		
		afterSelectingItemFromMenuPage.CheckOutBtnOnMenuPage();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ant-modal-header']/div[@class='ant-modal-title']/h3")));
		afterSelectingItemFromMenuPage.FinalSelectionAfterClickingAddToCartBtn("Can Diet Coke");
		
		// Incase of Store Closed pop up will come
		//StoreSelectionPage storeSelectionPage = new StoreSelectionPage(driver);
//		Thread.sleep(2000);
//		System.out.println(storeSelectionPage.GetStoreTimmings());
		//Thread.sleep(3000);
	//notificationPageRareUse.SCHEDULEORDER(); //  unable to click the btn
		//Thread.sleep(1000);
		//notificationPageRareUse.ToConfirmScheduleTimmingBtn();
		
		// Selecting Payment Method
		Thread.sleep(3000);
		CheckOutPage checkOutPage = new CheckOutPage(driver);
		checkOutPage.SelectPayMethod();
		Thread.sleep(1000);

		checkOutPage.AddCreditDebitCard();
		// Credit Card Field Opens
		Thread.sleep(4000);

		checkOutPage.CardNumber().sendKeys(DummyCreditCardNumber);
	//	checkOutPage.Expirymonth().sendKeys(CreditCardmm);
	//	checkOutPage.ExpiryYear().sendKeys(CreditCardyy);
		checkOutPage.NameOnCard().sendKeys(CreditCardName);
		checkOutPage.PostalCode().sendKeys(PostalCode);
		checkOutPage.SaveCreditCard();
		
	}
}
// Working Till Add card Info