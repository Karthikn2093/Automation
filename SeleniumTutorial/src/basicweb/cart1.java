package basicweb;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] items = {"Cucumber","Brocolli","Beetroot"};				
		System.setProperty("webdriver.chrome.driver", "C:/Users/Karthik/Eclipse Workspace/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		addItems(driver, items);

	}

	private static void addItems(WebDriver driver, String[] items) {
		
		int j=0;
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size(); i++) {
			
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
		
		List itemsList = Arrays.asList(items);
		
		if(itemsList.contains(formattedName)) {
			
			//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			//Using xpath with class to identify
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		}
		
		
	  }

	
    }
	
}
