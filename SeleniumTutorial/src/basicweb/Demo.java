package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Karthik/Eclipse Workspace/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.get("https://www.gmail.com");
		//driver.navigate().back();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Code");
		driver.findElement(By.id("pass")).sendKeys("asdsa");
		//driver.findElement(By.xpath("//*[@id='facebook']/body")).click();
		
		//driver.findElement(By.id("u_0_b")).click();
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
	}

}
