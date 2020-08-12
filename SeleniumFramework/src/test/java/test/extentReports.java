package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentReports {
		private static WebDriver driver = null;
	
	public static void main(String[] args) {
	
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
		
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("GoogleSearchTest1", "This test is to vaidate google search functionality");

        System.setProperty("webdriver.chrome.driver", "C://Selenium Driver/chromedriver.exe");
    	driver = new ChromeDriver();	
    	test1.log(Status.INFO, "Starting Test Case");
    	
    	driver.get("https://google.com");
    	test1.pass("Navigated to Google.com");
    	
    	driver.findElement(By.name("q")).sendKeys("Automation");
    	test1.pass("Entered the text in searchbox");
    	
    	driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
    	test1.pass("Pressed Enter Key board");
    	
    	driver.close();
    	driver.quit();
    	
    	test1.pass("Closed the browser");
    	test1.info("Test Completed");
    	
    	//Calling the report details
    	
    	extent.flush();
    	
	}
	
}
