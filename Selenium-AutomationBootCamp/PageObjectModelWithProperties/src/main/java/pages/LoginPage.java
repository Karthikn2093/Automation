package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage(ChromeDriver driver) {
		
		this.driver = driver;
	}
	
	public LoginPage enterUserName(String uName) {
		
		driver.findElement(By.id(prop.getProperty("LoginPage.Username.Id"))).sendKeys(uName);
		return this;
	}
	
	public LoginPage enterPassword(String pwd) {
		
		driver.findElement(By.id(prop.getProperty("LoginPage.Password.Id"))).sendKeys(pwd);
		return this;
		
	}
	
	public HomePage clickLogin() {
		
		driver.findElement(By.className(prop.getProperty("LoginPage.LoginButton.ClassName"))).click();
		
		//HomePage hp = new HomePage();
		
		return new HomePage(driver);
		
	}
	
	public LoginPage clickLoginForInvalidData() {
		
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
		
	}
	
	public LoginPage getErrorText() {
		
		System.out.println(driver.findElement(By.id("errorDiv")).getText());
		return this;
	
	}

}
