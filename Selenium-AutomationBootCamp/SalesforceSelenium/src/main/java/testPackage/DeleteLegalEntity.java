package testPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLegalEntity {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("karthik.kn2093@gmail.com");
		driver.findElement(By.id("password")).sendKeys("System!123");
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//p[text()='Legal Entities']"))).click().perform();
		
		Thread.sleep(5000);
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Legal Entities']"));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		WebElement search = driver.findElement(By.xpath("//input[@class='slds-input']"));
		search.click();
		Thread.sleep(2000);
		search.sendKeys("Entity2" + Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='slds-icon_container slds-icon-utility-down']//span[1]")).click();
		driver.findElement(By.xpath("(//a[@role='menuitem'])[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).isDisplayed());
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
