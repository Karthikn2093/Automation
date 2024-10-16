package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Karthik/Eclipse Workspace/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement Google = driver.findElement(By.xpath("//input[@title='Search']"));
		Google.sendKeys("Google");
		Google.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[@data-sc='N']")).click();
		

	}

}
