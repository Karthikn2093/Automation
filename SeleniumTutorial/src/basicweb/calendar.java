package basicweb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calendar {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Karthik/Eclipse Workspace/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000L);

		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		
		
		while(!driver.findElement(By.xpath("//span[contains(text(),'September')]")).getText().contains("September")) {
			
			driver.findElement(By.className("ui-icon ui-icon-circle-triangle-e")).click();
			
		}
		
		List<WebElement> dates = driver.findElements(By.className("ui-state-default"));
		
		int count = driver.findElements(By.className("ui-state-default")).size();
		
		for(int i =0; i<count; i++) {
			
			String text = driver.findElements(By.className("ui-state-default")).get(i).getText();
			if(text.contentEquals("28")) {
				driver.findElements(By.className("ui-state-default")).get(i).click();
				break;
			}
		}
	}

}
