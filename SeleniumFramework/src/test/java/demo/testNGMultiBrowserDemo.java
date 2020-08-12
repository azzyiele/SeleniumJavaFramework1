package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNGMultiBrowserDemo {


	WebDriver driver = null;

	@Parameters("browsername")


	@BeforeTest
	public void setup(String browsername) {
		System.out.println("browser name is:" +browsername);

		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C://Selenium Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if(browsername.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C://Selenium Driver/geckodriver.exe");
			driver = new FirefoxDriver();

		}

		else if(browsername.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "C://Selenium Driver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	}

		@Test
		public void test1() {
			driver.get("https://google.com");

		}

		@AfterTest
		public void tearDown() throws Exception {
			driver.close();
			System.out.println("Test Completed");
			Thread.sleep(4000);


		}

	}
	
