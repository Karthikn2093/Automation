package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods {
	
	public CreateLead(ChromeDriver driver) {
		
		this.driver = driver;
		
	}

	public CreateLead enterCompanyName() {

		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		return this;

	}

	public CreateLead enterFirstName() {

		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		return this;

	}

	public CreateLead enterLastName() {

		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		return this;

	}

	public ViewLead clickSubmit() {

		driver.findElementByName("submitButton").click();
		return new ViewLead();
	}

}
