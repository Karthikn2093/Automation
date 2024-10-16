package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestoionDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Karthik/Eclipse Workspace/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
		source.click();

	}

}
