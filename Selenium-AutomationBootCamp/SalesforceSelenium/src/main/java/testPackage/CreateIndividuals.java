package testPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateIndividuals {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://login.salesforce.com");
		
		driver.findElement(By.id("username")).sendKeys("karthik.kn2093@gmail.com");
		driver.findElement(By.id("password")).sendKeys("System!123");
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//p[text()='Individuals']"))).click().perform();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//lightning-icon[contains(@class,'slds-icon-text-default slds-m-right--x-small')]/following-sibling::span)[1]")).click();
		driver.findElement(By.xpath("//span[text()='New Individual']")).click();
		
		Thread.sleep(4000);
		driver.quit();
		
		

	}

}
