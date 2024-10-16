package basicweb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ibibo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Karthik/Eclipse Workspace/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.abhibus.com/trains/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("startTxtJourneyDate")).click();
		
		List<WebElement> dates = driver.findElements(By.xpath("//a[@class='_720kb-datepicker-calendar-day ng-binding ng-scope']"));
		
				
	}

}
