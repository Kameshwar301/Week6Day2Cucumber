package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class CreateLead extends BaseClass {
	
	@Given("click on crmsfa link")
	public void clickCrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();

	}
	@And("click on Lead button")
	public void clickLead() {
		driver.findElementByLinkText("Leads").click();

	}

}
