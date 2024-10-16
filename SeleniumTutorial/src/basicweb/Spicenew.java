package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Spicenew {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Karthik/Eclipse Workspace/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Source 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(3000);
		
		//Destination
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		
		//Date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		//Calender Disabled or nor
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			
			System.out.println("Box is disabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	
		
		//Selecting count of Passengers
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		WebElement number = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		number.click();
		Thread.sleep(2000);
		for(int i=1; i<5; i++) {
			
			number.sendKeys(Keys.ARROW_DOWN);
		}
		number.sendKeys(Keys.ENTER);
		
		
		//Currency
		
		Select currency = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		currency.selectByValue("USD");
		
		//Checkbox
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	}

}