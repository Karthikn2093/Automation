package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Karthik/Eclipse Workspace/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		//driver.findElement(By.id("email")).sendKeys("Code");
		driver.findElement(By.id("pass")).sendKeys("asdsa");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("#email")).sendKeys("dnsakjndasdml");
		driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
		System.out.println(driver.findElement(By.cssSelector("._4rbf")).getText());
	}

}
