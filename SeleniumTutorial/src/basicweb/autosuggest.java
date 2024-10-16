package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autosuggest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Karthik/Eclipse Workspace/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.id("BE_flight_origin_city")).click();
		driver.findElement(By.id("BE_flight_origin_city")).sendKeys("Mum");
		driver.findElement(By.id("BE_flight_origin_city")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.id("BE_flight_arrival_city")).sendKeys("Che");
		//driver.findElement(By.id("BE_flight_arrival_city")).sendKeys(Keys.ENTER);
		
	}

}
