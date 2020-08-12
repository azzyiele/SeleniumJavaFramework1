package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class ExcelDataProvider {

	WebDriver driver = null;


@BeforeTest
public void setUpTest() {


	System.setProperty("webdriver.chrome.driver", "C://Selenium Driver/chromedriver.exe");
	driver = new ChromeDriver();

}

	@Test(dataProvider = "Test1 Data")
	public void test1(String username, String password) throws Exception {
		System.out.println(username+" | "+password);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(4000);
		



	}

	@DataProvider(name = "Test1 Data")
	public Object[][]  getData() {
		String excelPath = "C:\\Users\\CYDELEIYZZAMARIEPILL\\Documents\\CYD\\eclipseworkspace\\SeleniumFramework\\excelfile\\data.xlsx";

		Object data[][] = testDat(excelPath, "Sheet1");
		return data;
	}

	public Object[][] testDat(String excelPath, String sheetName) {

		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);

		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		Object data [][] = new Object [rowCount-1][colCount];

		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {

				String cellData = excel.getCellDataString(i, j);
				//System.out.print(cellData+" | ");
				data [i-1][j] = cellData;
			}
			//System.out.println();
		}
		return data;
	}

}
