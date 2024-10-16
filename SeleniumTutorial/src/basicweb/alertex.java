package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Karthik";
		System.setProperty("webdriver.gecko.driver", "C:/Users/Karthik/Eclipse Workspace/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//Finding element using css with id so [attribute = value]. You can also use the tagname infront 
		driver.findElement(By.cssSelector("[id='name']")).sendKeys(text);
		//Finding element using css with class so tagname.classname
		driver.findElement(By.cssSelector("input.btn-style")).click();

		//For handling Alert box use switchTo method along with alert, accept and dismiss methods.
		driver.switchTo().alert().accept();
		
		driver.findElement(By.cssSelector("[id='name']")).sendKeys(text);
		//Finding element using xpath use //tagname[attribute = value]
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
		
		
		
	}

}
