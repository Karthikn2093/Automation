package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ProductPage extends ProjectSpecificMethods {
	
	public ProductPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public ProductPage verifyPageTitle() {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		return this;
	}
	
	public ProductPage clickMenuButton() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		return this;
	}
	
	public LoginPage clickLogoutButton() {
		driver.findElement(By.id("logout_sidebar_link")).click();
		return new LoginPage(driver);
	}

}
