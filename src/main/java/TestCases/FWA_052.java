// Can not complete this test case Google security Not allows to complete login process
// So Leaving test Cases 52-56 Because all of them need login through google
//package TestCases;
//
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;
//
//import Base.BaseClass;
//import PageObjects.DemoPage;
//import PageObjects.GoogleSignInPage;
//import PageObjects.LandingPage;
//import PageObjects.SignInPage;
//
//public class FWA_052 extends BaseClass {
//
//	@Test(priority = 1)
//	public void SignIn() throws InterruptedException {
//		DemoPage demoPage = new DemoPage(driver);
//		Actions actions = new Actions(driver);
//		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		demoPage.PostalCode().sendKeys(PostalCode);
//		demoPage.FindStoreBtn();
//		
//		Thread.sleep(2000);
//		// Landing Page Loads
//		LandingPage landingPage = new LandingPage(driver);
//		//wait.until(ExpectedConditions.elementToBeClickable(landingPage.userProfile()));
//		//wait.until(ExpectedConditions.presenceOfElementLocated(landingPage.userProfile));
//		//actions.moveToElement(landingPage.UserProfile()).click().build().perform();
//	
//		landingPage.UserProfile();
//		landingPage.UserProfileSignIn();
//
//		// Sign Page Opens
//		SignInPage signInPage = new SignInPage(driver);
//		//wait.until(ExpectedConditions.visibilityOf(signInPage.EmailBox()));
//		signInPage.GoogleBtn();
//		Thread.sleep(2000);
//		String googleLoginWindow = driver.getWindowHandle();
//		String gleLoginWindow = driver.getWindowHandle();
//
//		
//        driver.switchTo().window(googleLoginWindow);
//        Thread.sleep(2000);
//        driver.get("https://accounts.google.com/o/oauth2/auth/identifier?response_type=code&client_id=28927612198-3h3a4to5n0mkjokpbp8l4krm019h7e26.apps.googleusercontent.com&redirect_uri=https%3A%2F%2Ffreshiiappprod.firebaseapp.com%2F__%2Fauth%2Fhandler&state=AMbdmDlLjS_O8WDD_t4zmO07fSEXl7-HxFzYkWVZ-E5FgZb-yPUDTn2Vt4UWVlTmVLdRkDASr9KMw3pHXPJHK8Rn22VaUnSyz20mR09IdLmQTIU7zVCqZBuSN4JAhoX0eLwlFgv_ME3qQ_jDH9ezYdXmEXuVjQitjW6h1o7i1KgjJiw5eJAVFR8w4Ah5XkjjiyBLOcBFuc_ScvsCGN8msUH5p_bA_uxVJe1Ar_6IRwUSr71qQkWnXHfYhlTJvQsNUkgrR6l7QsHBKeAqw4S7UxqnWxtOIliY9w48fk2oLg0khiJqYaogYJQnICiOL9BzHO8FNBl-L-8Y&scope=openid%20https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email%20profile&context_uri=https%3A%2F%2Fweb-uat.freshii.com&service=lso&o2v=1&flowName=GeneralOAuthFlow");
//
//		GoogleSignInPage googleSignInPage = new GoogleSignInPage(driver);
//		Thread.sleep(3000);
//		
//		googleSignInPage.GoogleEmail().sendKeys("Karan");
//		
//	}
//}
