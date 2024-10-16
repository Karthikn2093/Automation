package basicweb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class redbus {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Karthik/Eclipse Workspace/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		/*WebElement source = driver.findElement(By.id("src"));
		source.click();
		source.sendKeys("Chennai");
		source.sendKeys(Keys.ENTER);
		WebElement destination = driver.findElement(By.id("dest"));
		destination.click();
		destination.sendKeys("Bengaluru");
		destination.sendKeys(Keys.ENTER);*/
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		
		List<WebElement> dates = driver.findElements(By.className("wd day"));
		
		int count = driver.findElements(By.className("wd day")).size();
		for(int i=0; i<count; i++) {
			
			String text = driver.findElements(By.className("wd day")).get(i).getText();
			if(text.contentEquals("22")) {
				
				driver.findElements(By.className("wd day")).get(i).click();
				break;
			}
			
		}
	}

}
