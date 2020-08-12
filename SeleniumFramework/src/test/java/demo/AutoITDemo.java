package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {

	public static void main(String[] args) throws Exception {
		test();
		}
	

	public static void test() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C://Selenium Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tinyupload.com/");
		//driver.findElement(By.xpath("//input[@name='uploaded_file']")).click();
		driver.findElement(By.name("uploaded_file")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\CYDELEIYZZAMARIEPILL\\Documents\\AutoIT(Selenium)Demo\\FileUploadScript.exe");

		//Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
	

}
