package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;


public class ProjectSpecificMethods {

	public ChromeDriver driver;
	public String excelFileName;
	public static Properties prop;
	
	@BeforeMethod
	public void StartApplication() throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/main/resources/English.properties");
		
		prop = new Properties();
		
		prop.load(fis);
		
		
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
