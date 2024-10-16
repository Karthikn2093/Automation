package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	
	public MyLeadsPage(ChromeDriver driver) {
		
		this.driver = driver;
		
	}

	public CreateLead clickCreateLead() {

		driver.findElementByLinkText("Create Lead").click();
		return new CreateLead(driver);

	}

}
