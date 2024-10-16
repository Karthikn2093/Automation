package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;


public class ProjectSpecificMethods {

	public ChromeDriver driver;
	public String excelFileName;
	
	@BeforeMethod
	
	public void StartApplication(String browser) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeApp() {

		System.out.println("Window should be closed");
		driver.quit();
	}
	
	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {

		ReadExcel read = new ReadExcel();
		String[][] data = read.readExcel(excelFileName);
		return data;

	}
	
	
}
