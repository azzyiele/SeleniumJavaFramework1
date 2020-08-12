package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import test2.googleSearchPageObject;

public class GoogleSearchPageTest {

	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearchTest();
		
	}
	
	public static void googleSearchTest() {
		System.setProperty("webdriver.chrome.driver", "C://Selenium Driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		googleSearchPageObject searchPageObj = new googleSearchPageObject(driver);
		
		
		driver.get("https://google.com/");
		searchPageObj.setTextInSearchBox("Clint Liam Teves");
		searchPageObj.clickSearchButton();
		driver.close();
	}
}
