package testPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLegalEntityWithoutMandatoryFields {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-geolocation");
		options.addArguments("--incognito");
		options.addArguments("--enable-strict-powerful-feature-restrictions");
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://login.salesforce.com");

		driver.findElement(By.id("username")).sendKeys("karthikn20@SelBootCamp.com");
		driver.findElement(By.id("password")).sendKeys("System!123");
		driver.findElement(By.id("Login")).click();

		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();

		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//p[text()='Legal Entities']"))).click().perform();

		Thread.sleep(5000);

		WebElement element = driver.findElement(By.xpath("//span[text()='Legal Entities']"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[@title='Legal Entities']/following::a[1]")).click();

		Thread.sleep(2000);
		WebElement createEntity = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", createEntity);
		
				
		driver.findElement(By.xpath("(//input[@class=' input'])[2]")).sendKeys("Testleaf-1");
		driver.findElement(By.className("textarea")).sendKeys("Salesforce-1");
		driver.findElement(By.className("select")).click();
		driver.findElement(By.xpath("(//a[@role='menuitemradio'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class=' label bBody'])[5]")).click();

		System.out.println(driver.findElement(By.className("form-element__help")).isDisplayed());

		Thread.sleep(3000);
		driver.quit();

	}

}
