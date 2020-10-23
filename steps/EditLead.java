package steps;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditLead extends BaseClass {

	@And("click on Find Lead button")
	public void findLeadButton() {
		driver.findElementByLinkText("Find Leads").click();
		
	}
	@And("Search with the first name as Kameshwar")
	public void firstName() {
		
		WebElement firstName = driver.findElementByXPath("(//input[@name='firstName'])[3]");
		firstName.sendKeys("Kameshwar");
	}
	@And("click on find button")
	public void findButton() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();

	}
	@And("Click on first result Lead ID")
	public void firstLeadID() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();

	}
	@Then("Lead page is Opened")
	public void leadPage() {
		System.out.println("The Lead page is opened");
	}
	@Given("Click on Edit button")
	public void editButton() {
		driver.findElementByXPath("//a[@class='subMenuButton'][3]").click();

	}
	@And("Enter new company name as Wipro")
	public void companyName() {
		WebElement name = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']");
		name.clear();
		name.sendKeys("Wipro");

	}
	@When("Click on update button")
	public void update() {
		driver.findElementByXPath("//input[@name='submitButton']").click();

	}
	@Then("Company name Edited as Successfully")
	public void updatedPage() {
		System.out.println("The page is updated");

	}
}
