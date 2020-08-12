package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class etenetReport_TestNG {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver = null;

	@BeforeSuite
	public void setUp() {

		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	
	
	@BeforeTest
	public void setUpTest() {
	System.setProperty("webdriver.chrome.driver", "C://Selenium Driver/chromedriver.exe");
	driver = new ChromeDriver();
	}

	@Test
	public void test1() throws Exception {  

		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		
		driver.get("https://google.com");
		test.pass("Going to google.com");

		// log(Status, details)
		test.log(Status.INFO, "This step shows usage of log(status, details)");

		// info(details)
		test.info("This step shows usage of info(details)");

		// log with snapshot
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");
	}

	@AfterSuite
	
	@AfterTest
	public void tearDownTest() {
		
		//close browser
				driver.close();
				driver.quit();
				System.out.println("Test Completed Successfully");

	}

}
