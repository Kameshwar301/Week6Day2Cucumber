package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class DeleteLead extends BaseClass{
	@And("click on Find Leads option")
	public void findLeadButton() {
		driver.findElementByLinkText("Find Leads").click();
		
	}
	@And("Click on Phone number and give phone number as 89")
	public void phoneNumber() {
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("89");

	}
	@And("click the button of find")
	public void clickFind() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	}
		
	 @And("Click the list of lead id") 
	  public void firstLeadID() throws InterruptedException {
		  Thread.sleep(1000); 
	  driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	  
	  }
	 
	@And("click the delete button")
	public void deleteButton() {
		driver.findElementByLinkText("Delete").click();
		
	}
	@And("again click the find lead")
	public void againFindLead() {
		driver.findElementByLinkText("Find Leads").click();

	}
	@And("Enter the name field in lead id is 11528")
	public void enterLeadId() {
		driver.findElementByXPath("//input[@name='id']").sendKeys("11528");

	}
	@And("Click find button")
	public void findButt() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();

	}
	@Then("the string text is")
	public void stringText() {
		String text = driver.findElementByClassName("x-paging-info").getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}

	}

}
