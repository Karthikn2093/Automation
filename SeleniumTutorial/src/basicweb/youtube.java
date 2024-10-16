package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Karthik/Eclipse Workspace/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/?gl=IN");
		driver.findElement(By.id("search")).click();
		driver.findElement(By.id("search")).sendKeys("Songs");
		//System.out.println(driver.findElements(By.id("video-title")).size());

	}

}
