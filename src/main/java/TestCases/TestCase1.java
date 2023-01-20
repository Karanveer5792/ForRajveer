package TestCases;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.DemoPage;
import PageObjects.LandingPage;

public class TestCase1 extends BaseClass {
	
	@Test
	public void Check() throws InterruptedException {
		DemoPage dm = new DemoPage(driver);
		LandingPage lp =new  LandingPage(driver);
		dm.PostalCode().sendKeys(PostalCode);
		dm.FindStoreBtn().click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement ELEMENT = lp.FoodOptions("Wraps");
		ELEMENT.click();
		//actions.moveToElement(ELEMENT).click().build().perform();
		//actions.click(ELEMENT).build().perform();
		//actions.doubleClick(ELEMENT).build().perform();;
		//lp.Deals().click();
		
		//lp.OrderNow().click();
		
	}
}
