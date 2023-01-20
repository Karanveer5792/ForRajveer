package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.AfterSelectingItemFromMenuPage;
import PageObjects.AfterSignIn;
import PageObjects.AfterSignInConfirmingStore;
import PageObjects.DemoPage;
import PageObjects.GiftCardsPage;
import PageObjects.LandingPage;
import PageObjects.MenuPage;
import PageObjects.NotificationPageRareUse;
import PageObjects.SignInPage;
import PageObjects.StoreSelectionPage;

public class FWA_028 extends BaseClass {

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

		// wait.until(ExpectedConditions.elementToBeClickable(landingPage.userProfile));
		logger.info("Trying to find element");
		wait.until(ExpectedConditions.presenceOfElementLocated(landingPage.userProfile));
		logger.info("User Profile Element found");

		landingPage.UserProfile();
		landingPage.UserProfileSignIn();

		// Sign Page Opens
		SignInPage signInPage = new SignInPage(driver);
		// wait.until(ExpectedConditions.visibilityOf(signInPage.EmailBox()));
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
		// afterSelectingItemFromMenuPage.RemoveAlreadyInIngredients("Avocado");
		// afterSelectingItemFromMenuPage.ReplaceAlreadyInIngredients("Tortilla Chips",
		// "Green Onions");
		afterSelectingItemFromMenuPage.IncreaseQuantityOfItem();
		afterSelectingItemFromMenuPage.FooterAddToCartBtn();
		Thread.sleep(1000);
		afterSelectingItemFromMenuPage.PickckYourProteinIOption("Chicken");
		Thread.sleep(1000);
		afterSelectingItemFromMenuPage.SpecialInstructions().sendKeys("Reched at this step");
		afterSelectingItemFromMenuPage.AfterSpecialInstructionAddToCartBtn();
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Product succesfully added!']")));
		if (notificationPageRareUse.NoticationItemHasBeenAdded().getText().contains("Product succesfully added")) {
			// softassert.assertTrue(true);
			logger.info("Item Has Been added To Cart");
		} else {
			// softassert.assertTrue(false);
			logger.error("Service NOT created");
			// captureScreen(driver,"ServiceNotCreated");
		}

		afterSelectingItemFromMenuPage.CheckOutBtnOnMenuPage();
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='ant-modal-header']/div[@class='ant-modal-title']/h3")));
		afterSelectingItemFromMenuPage.FinalSelectionAfterClickingAddToCartBtn("Can Diet Coke");
	}
	
	@Test(priority = 3)
	public void OrderScheduling() throws InterruptedException {
		// Incase of Store Closed pop up will come
		NotificationPageRareUse notificationPageRareUse = new NotificationPageRareUse(driver);
		Thread.sleep(4000);
		notificationPageRareUse.SCHEDULEORDER();
		Thread.sleep(1000);
		notificationPageRareUse.ToConfirmScheduleTimmingBtn();
				
				
	}
	
	@Test(priority = 4)
	public void CheckOut() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AfterSignIn afterSignIn = new AfterSignIn(driver);
		Thread.sleep(3000);
		afterSignIn.UserProfile().click();
		Thread.sleep(2000);
		afterSignIn.GiftCards().click();
		GiftCardsPage giftCardsPage = new GiftCardsPage(driver);
		Thread.sleep(2000);
		giftCardsPage.AddFunds();
		Thread.sleep(2000);
		//giftCardsPage.AddDollar25();
		giftCardsPage.SelectPaymentMethod();
		Thread.sleep(2000);
		giftCardsPage.AddCreditCardOpt();
		Thread.sleep(2000);
		giftCardsPage.CardNumber().sendKeys(DummyCreditCardNumber);
		Thread.sleep(1000);
		giftCardsPage.Expiryfieldmonth().sendKeys(CreditCardmm);
		Thread.sleep(1000);
		giftCardsPage.Expiryfieldyear().sendKeys(CreditCardyy);
		Thread.sleep(1000);
		giftCardsPage.Cvvfield().sendKeys(CreditCardcvc);
		

	}
}
