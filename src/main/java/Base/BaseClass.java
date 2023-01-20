package Base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.ReadConfig;

public class BaseClass {
	public WebDriver driver;
	public static Logger logger;

	ReadConfig readConfig = new ReadConfig(); // Class object Created
	// Integrating Data from ReadConfig
	public String BaseUrl = readConfig.BaseUrl();
	public String UserEmail1 = readConfig.UserEmail1();
	public String UserEmail2 = readConfig.UserEmail2();
	public String Password1 = readConfig.Password1();
	public String Password2 = readConfig.Password2();
	public String PostalCode = readConfig.PostalCode();
	public String DummyCreditCardNumber = readConfig.Creditcardnumber();
	public String CreditCardcvc = readConfig.Creditcardcvc();
	public String CreditCardmm = readConfig.creditcardmm();
	public String CreditCardyy = readConfig.creditcardyy();
	public String CreditCardName = readConfig.creditcardname();

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup() {

		String br = "Chrome";
		logger = Logger.getLogger("FreshiiWebApplication");
		PropertyConfigurator.configure("log4j.properties");

		logger.setLevel(Level.DEBUG);
		logger.debug("Debug logging has Started ");

		if (br.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", readConfig.ChromePath());
			driver = new ChromeDriver();
			driver.get(BaseUrl);
			logger.debug("Opening base URL - in Chrome");
		} else if (br.equalsIgnoreCase("IE")) {
		} else if (br.equalsIgnoreCase("Firefox")) {
		} else {
			logger.debug("Issue With Setting of Driver");
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}

	@AfterClass
	public void tearDown() {
		// driver.quit();
	}

	public void captureScreen(String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/ScreenShot/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("ScreenShot Taken");

	}

}
