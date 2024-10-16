package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class salesforce {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Karthik/Eclipse Workspace/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("[class = 'input r4 wide mb16 mt8 username']")).sendKeys("ahsdjahda");

	}

}
