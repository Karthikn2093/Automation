package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class LoginValidData extends ProjectSpecificMethods {
	
	@Test
	@Parameters({"username","password"})
	public void loginValidData(String uname, String pwd) {
		
		new LoginPage(driver).enterUserName(uname).enterPassword(pwd).clickLogin().verifyPageTitle();
		
	}

}
