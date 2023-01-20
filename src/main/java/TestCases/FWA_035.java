// Verify end-end workflow using Freshii User : Forgot Password
// Working half process. Can not work on grabbing email link.
package TestCases;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.DemoPage;
import PageObjects.ForgotPasswordPage;
import PageObjects.LandingPage;
import PageObjects.SignInPage;

public class FWA_035 extends BaseClass {

	@Test(priority = 1)
	public void SignIn() throws InterruptedException {
		DemoPage demoPage = new DemoPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

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

	}
	@Test(priority = 2)
	public void forgotPassword() throws InterruptedException {
//		DemoPage demoPage = new DemoPage(driver);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		demoPage.PostalCode().sendKeys(PostalCode);
//		demoPage.FindStoreBtn();
//
//		// Landing Page Loads
//		LandingPage landingPage = new LandingPage(driver);
//		//Thread.sleep(3000);
//		wait.until(ExpectedConditions.presenceOfElementLocated(landingPage.userProfile));
//		landingPage.UserProfile();
//		landingPage.UserProfileSignIn();
//		Thread.sleep(2000);
		// Sign Page Opens
		SignInPage signInPage = new SignInPage(driver);
		signInPage.EmailBox().sendKeys(UserEmail2);
		signInPage.ForgotPasswordLink();
		
		// Lands on Forgot Password Page
		ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
		Thread.sleep(2000);
		forgotPasswordPage.enterYourEmail().sendKeys(UserEmail1);
		forgotPasswordPage.SendResetLinkBtn();
		
		// Working Till sending forgot password link
	}
}
