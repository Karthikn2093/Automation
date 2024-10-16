package testPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLegalEntity {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://login.salesforce.com");
		
		driver.findElement(By.id("username")).sendKeys("karthikn20@SelBootCamp.com");
		driver.findElement(By.id("password")).sendKeys("System!123");
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//p[text()='Legal Entities']"))).click().perform();
		
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@class='slds-input']"));
		search.click();
		Thread.sleep(2000);
		search.sendKeys("Entity1" + Keys.ENTER);
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//span[@class='slds-icon_container slds-icon-utility-down']//span[1]")).click();
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		
		driver.findElement(By.xpath("(//input[@class=' input'])[2]")).sendKeys("Testleaf");
		driver.findElement(By.className("textarea")).sendKeys("Salesforce");
		
		driver.findElement(By.className("select")).click();
		driver.findElement(By.xpath("(//a[@role='menuitemradio'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();	
		
		driver.findElement(By.xpath("//span[contains(@class,'toastMessage slds-text-heading--small')]")).isDisplayed();
						
		Thread.sleep(4000);
		driver.quit();
	}

}
