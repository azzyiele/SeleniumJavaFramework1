import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
public static void main(String[] args) throws InterruptedException {
	
	//System.setProperty("webdriver.gecko.driver", "C://Selenium Driver/geckodriver.exe");
	//WebDriver driver = new FirefoxDriver();
	
	System.setProperty("webdriver.chrome.driver", "C://Selenium Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//System.setProperty("webdriver.ie.driver", "C://Selenium Driver/IEDriverServer.exe");
	//WebDriver driver = new InternetExplorerDriver();
	
	driver.get("http://google.com/");
	
	//WebElement textbox = driver.findElement(By.name("q"));
	//textbox.sendKeys("Liam");
	
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Liam Pogi");
	List<WebElement> listOfinput = driver.findElements(By.xpath("//input"));
	int count = listOfinput.size();
	System.out.println("Count of Elements: " +count );
	
	Thread.sleep(5000);
	driver.close();
}
	
}
