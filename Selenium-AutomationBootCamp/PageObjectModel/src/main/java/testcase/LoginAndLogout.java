package testcase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class LoginAndLogout extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setFileName() {
		
		excelFileName = "Login";
	}
	
	@Test(dataProvider = "fetchData")
	public void loginLogout(String username, String password) throws InterruptedException {
		
		//LoginPage lp = new LoginPage();
		
		new LoginPage(driver)
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.clickSubmit()
		.viewlead();
		
	}
}
