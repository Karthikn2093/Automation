package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Karthik/Eclipse Workspace/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		/*driver.findElement(By.xpath("//*[@type='email']")).sendKeys("Xpath example");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("asdklasnlk");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();    */
		
		//Using CSS
		
		//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Using CSS");
		driver.findElement(By.cssSelector("input#email")).sendKeys("CSS");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("password");
		driver.findElement(By.cssSelector("label#loginbutton")).click();
		//driver.findElement(By.cssSelector("[value='Log In']")).click();
	}

}
