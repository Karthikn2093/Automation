package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Karthik/Eclipse Workspace/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String a = driver.findElement(By.xpath("//div[@id='checkbox-example']//label[2]")).getText();
		System.out.println(a);
		
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(a);
		
		driver.findElement(By.id("name")).sendKeys(a);
		driver.findElement(By.id("alertbtn")).click();
		String text = driver.switchTo().alert().getText();
		
		if(text.contains(a)) {
			
			System.out.println("Successful");
		}else
		{
			System.out.println("Fail");
		}
		
		
		
		

	}

}
