package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Karthik/Eclipse Workspace/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("Chennai");
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys("Mumbai");
		driver.findElement(By.id("departureCalendar")).click();
		driver.findElement(By.id("fare_20200708")).click();
		driver.findElement(By.id("pax_label")).click();
		
		for(int i=0; i<5; i++) {
		driver.findElement(By.id("adultPaxPlus")).click();
		}
		Select s = new Select(driver.findElement(By.id("gi_class")));
		s.selectByValue("B");
		driver.findElement(By.id("pax_close")).click();
		
		driver.findElement(By.id("gi_search_btn")).click();

}
}