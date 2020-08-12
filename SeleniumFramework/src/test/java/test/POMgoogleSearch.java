package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import test2.POM;

public class POMgoogleSearch {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch();
		
	}

	
	public static void googleSearch() {
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium Driver/chromedriver.exe");
		 driver = new ChromeDriver();
		
		//go to google.com
		driver.get("https://google.com/");
		
		//enter text in textbox
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium dev");
		
		POM.textbox_search(driver).sendKeys("selenium dev");
		
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		
		POM.button_search(driver).sendKeys(Keys.RETURN);
		
		//close browser
		driver.close();
		
		System.out.println("Test Completed Successfully");
		
	}
	
}
