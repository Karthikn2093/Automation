package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setFileName() {
		
		excelFileName = "Login";
		
	}
	
	@Test(dataProvider = "fetchData")
	public void createLead(String username, String password) {
		
		new LoginPage(driver)
		.enterUserName(username).enterPassword(password).clickLogin()
		.clickCRMSFA().clickLeads()
		.clickCreateLead().enterCompanyName().enterFirstName().enterLastName()
		.clickSubmit();
		
	}
	
	

}
