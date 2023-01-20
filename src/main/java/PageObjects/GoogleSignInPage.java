// Do not need this Page Objects because google does not Login because of there security policy
package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSignInPage {
	public WebDriver driver;
	public GoogleSignInPage(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "identifierId")
	WebElement googleEmail;
	
	public WebElement GoogleEmail() {
		return googleEmail;
	}
	
}
