package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2 {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
	System.setProperty("webdriver.chrome.driver", "C://Selenium Driver/chromedriver.exe");
	driver = new ChromeDriver();
	}
	
	@Test
	public void googleSearch2() {
		
		//go to google.com
		driver.get("https://google.com");
		
		//enter text in textbox
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium dev");
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
		
	}
	
public void googleSearch3() {
		
		//go to google.com
		driver.get("https://google.com");
		
		//enter text in textbox
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium dev");
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
		
	}
	
	@AfterTest
	public void tearDownTest() {
		
		//close browser
				driver.close();
				driver.quit();
				System.out.println("Test Completed Successfully");
	}
	
}
