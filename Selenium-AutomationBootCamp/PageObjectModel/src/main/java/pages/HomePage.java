package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	public HomePage(ChromeDriver driver) {
		
		this.driver = driver;
		
}

	public MyHomePage clickCRMSFA() {
		
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage(driver);
		
	}
	
	public LoginPage clickLogOut() {
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		return new LoginPage(driver);
		
	}

}
