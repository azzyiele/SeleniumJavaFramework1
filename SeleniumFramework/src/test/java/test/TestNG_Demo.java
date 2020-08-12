package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNG_Demo {
	
	WebDriver driver = null;
	public static String browserName = null;
	
	@BeforeTest
	public void setUpTest() {
		
		PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C://Selenium Driver/chromedriver.exe");
			driver = new ChromeDriver();
				}
	
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C://Selenium Driver/geckodriver.exe");
			driver = new FirefoxDriver();
				}
	}
	
	@Test
	public void googleSearch() {
		
		//go to google.com
		driver.get("https://google.com");
		
		//enter text in textbox
		driver.findElement(By.name("q")).sendKeys("selenium dev");
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
		
	}
	
	@AfterTest
	public void tearDownTest() {
		
		//close browser
				driver.close();
				//driver.quit();
				System.out.println("Test Completed Successfully");
				PropertiesFile.setProprties();
	}
	
}
