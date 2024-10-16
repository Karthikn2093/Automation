package testPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class CreateIndividual extends BaseClass {

	

	public void createIndividual() throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		driver = new ChromeDriver(options);
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
		driver.findElement(By.xpath(
				"(//lightning-icon[contains(@class,'slds-icon-text-default slds-m-right--x-small')]/following-sibling::span)[1]"))
				.click();
		driver.findElement(By.xpath("//span[text()='New Individual']")).click();

		Thread.sleep(4000);
		driver.quit();

	}

	@AfterMethod
	public void exitApp(ITestResult result) throws IOException {
		
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./images/"+result.getName()+".png");
		FileUtils.copyFile(src, dest);
		driver.quit();

	}

}
