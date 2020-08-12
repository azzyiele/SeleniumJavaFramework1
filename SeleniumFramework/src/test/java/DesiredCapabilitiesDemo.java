import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {
	public static void main(String[] args) {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("ignoreProtectedModeSettings	", true);
        
		System.setProperty("webdriver.ie.driver", "C://Selenium Driver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(caps);
		
		driver.get("http://google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("liam");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();

	}

}
