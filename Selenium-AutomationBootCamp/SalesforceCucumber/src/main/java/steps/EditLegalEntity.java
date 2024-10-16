package steps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LegalEntitiesPage;
import pages.LoginPage;

public class EditLegalEntity {

	public ChromeDriver driver;

	@Given("Login to salesforce application")
	public void login_to_salesforce_application() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		new LoginPage(driver).enterUserName("karthikn20@SelBootCamp.com").enterPassword("System!123").clickLogin();
	}

	@And("Click on the toggle menu button from the left corner")
	public void click_on_the_toggle_menu_button_from_the_left_corner() {

		new HomePage(driver).clickMenuButton();

	}

	@And("Click View All and click Legal Entities from App Launcher")
	public void click_view_all_and_click_legal_entities_from_app_launcher() {
		new HomePage(driver).clickViewAll().clickLegalEntities();
	}

	@And("Click on the legal Entities tab")
	public void click_on_the_legal_entities_tab() {
		new LegalEntitiesPage(driver).clickLegalEntitiesTab();
	}

	@When("Search the Legal Entity Salesforce Automation by Your Name")
	public void search_the_legal_entity_salesforce_automation_by_your_name() throws Exception {
		new LegalEntitiesPage(driver).searchLegalEntity("Entity2");
	}

	@And("Click on the Dropdown icon and Select Edit")
	public void click_on_the_dropdown_icon_and_select_edit() {
		new LegalEntitiesPage(driver).clickDropdown().clickEdit();
	}

	@And("Enter the Company name as Testleaf")
	public void enter_the_company_name_as_tetsleaf() {
		new LegalEntitiesPage(driver).enterCompany();
	}

	@And("Enter Description as SalesForce")
	public void enter_description_as_salesforce() {
		new LegalEntitiesPage(driver).enterDescription("Salesforce");
	}

	@And("Select Status as Active")
	public void select_status_as_active() {
		new LegalEntitiesPage(driver).selectStatus();
	}

	@When("Click on Save and Verify Status as Active")
	public void click_on_save_and_verify_status_as_active() {
		new LegalEntitiesPage(driver).clickSave();
	}

	@Then("Verify Edit is saved")
	public void verify_edit_is_saved() {
		new LegalEntitiesPage(driver).verifyEditSaved();
		driver.quit();
	}

}
