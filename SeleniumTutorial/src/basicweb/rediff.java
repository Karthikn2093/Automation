package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class rediff {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Karthik/Eclipse Workspace/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("thanatos");
		driver.findElement(By.cssSelector("input#password")).sendKeys("asdgasdblas");
		driver.findElement(By.xpath("//input[contains(@name,'proc')]")).click();

	}

}
