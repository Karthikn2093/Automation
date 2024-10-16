package steps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseClass{
	
	public ChromeDriver driver;
	
	@Given("User is already signed into the application")
	public void user_is_already_signed_into_the_application() {
	   
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		new LoginPage(driver).enterUserName("karthikn20@SelBootCamp.com").enterPassword("System123").clickLogin();
		
	} 
	
	@When("User signed in with valid credentials")
	public void user_signed_in_with_valid_credentials() {
	  System.out.println(driver.getTitle());
	}
	
	@Then("User should be able to login and should be redirected to the HomePage")
	public void user_should_be_able_to_login_and_should_be_redirected_to_the_home_page() {
		 System.out.println(driver.getTitle());
	}
	
	@When("User should click on the Menu button")
	public void user_should_click_on_the_menu_button(){
		new HomePage(driver).clickMenuButton();
	}
	
	@Then("Browser should be closed")
	public void browser_should_be_closed() {
		driver.quit();
	}
}
