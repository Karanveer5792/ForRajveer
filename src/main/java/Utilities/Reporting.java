package Utilities;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter {
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;

	@Override
	public void onStart(ITestContext testContext) {
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); // Time Stamp
		String repName ="Test-Report-" + timeStamp + ".html" ; // Report Name and time stamp in html format
		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/"+ repName); // Specify Location of the report
		
		htmlReporter.config().setDocumentTitle("Automation Report"); // Report Title - given by the user
		htmlReporter.config().setReportName("Functional Testing"); // name of the report - given by the user
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		// System info can be any info defined by the User that comes in the report
		// populate the common details
		extent.setSystemInfo("Project: ", "Automation Regression Tests");
		extent.setSystemInfo("Host name: ", "localhost");
		extent.setSystemInfo("Environment: ", "QA");
		extent.setSystemInfo("OS: ", "Windows 10");
		extent.setSystemInfo("Browser name: ","Chrome,Firefox");
		extent.setSystemInfo("Language: ", "Java");
		extent.setSystemInfo("Tools used: ", "Maven/TestNG");
		extent.setSystemInfo("Created By: ","Karanveer");
		extent.setSystemInfo("Client: ", "Freshii");
		
	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		// TODO Auto-generated method stub
		test = extent.createTest(tr.getName()); // Create New Entry in the Report
		test.log(Status.PASS, "Test Case Passed IS " + tr.getName());
	}

	@Override
	public void onTestFailure(ITestResult tr) {
		// TODO Auto-generated method stub
		test = extent.createTest(tr.getName()); // Create's New Entry in Report
		test.log(Status.FAIL, "Test Failed IS "+ tr.getName());
		test.log(Status.FAIL, "Test Case Failed Due to " + tr.getThrowable());
		
		String screenShotPath = System.getProperty("user.dir") + "/Screenshots/" + tr.getName()+".png";
		
		try {
			test.addScreenCaptureFromPath(screenShotPath); // adding Screen Shot to Report
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		test = extent.createTest(tr.getName()); // Create new entry in the Report
		test.log(Status.SKIP, "Test Case Skipped IS " + tr.getName());
		
	}

	@Override
	public void onFinish(ITestContext testContext) {
		// TODO Auto-generated method stub
		extent.flush();
	}

}
