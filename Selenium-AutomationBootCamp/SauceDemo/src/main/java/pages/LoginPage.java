package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage enterUserName(String username) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	
	public ProductPage clickLogin() {
		driver.findElement(By.id("login-button")).click();
		return new ProductPage(driver);
		
	}

}
