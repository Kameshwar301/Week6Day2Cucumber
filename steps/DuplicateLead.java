package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DuplicateLead extends BaseClass{
	
	@And("click on Find Lead option")
	public void findLeadButton() {
		driver.findElementByLinkText("Find Leads").click();
		
	}
	@And("Click on Phone number and give phone number as 99")
	public void phoneNumber() {
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");

	}
	@And("click the button of find lead")
	public void clickFindLead() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	}
	@And("Click the first list of lead id")
	public void firstLeadID() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();

	}
	@And("Click the Duplicate button")
	public void duplicateButton() {
		driver.findElementByLinkText("Duplicate Lead").click();
	}
	@When("click the final submit button")
	public void finalSubmit() {
		
		driver.findElementByName("submitButton").click();
	}
	@Then("The duplicate lead is created")
	public void duplicateLead() {
		System.out.println("Duplicate Lead is created");
	}

}
