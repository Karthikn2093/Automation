package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class LoginWithInvalidData extends ProjectSpecificMethods {
	
	@Test
	public void inValidData() {
		
		new LoginPage(driver)
		.enterUserName("demo12")
		.enterPassword("crmsfa")
		.clickLoginForInvalidData()
		.getErrorText();
		
		
	}
	
}
