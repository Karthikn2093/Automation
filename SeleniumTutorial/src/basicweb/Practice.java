package basicweb;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Karthik/Eclipse Workspace/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Limiting scope to a section in the webpage. In this it is footer
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		
		WebElement columnfooter = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int link = columnfooter.findElements(By.tagName("a")).size();
		System.out.println(link);
		
		for(int i=1 ; i<link; i++) {
			
			String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnfooter.findElements(By.tagName("a")).get(i).sendKeys(click);
			Thread.sleep(5000L);
			
		}
		
		Set<String>abc = driver.getWindowHandles();
		Iterator<String> it = (Iterator) abc.iterator();
		
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
				
		
	}
		
}
