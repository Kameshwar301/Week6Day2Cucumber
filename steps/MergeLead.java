package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MergeLead extends BaseClass{
	
	public String leadID;
	
	@Given("click on Merge Leads")
	public void clickOnMergeLeads() {
		driver.findElementByXPath("//a[@href='/crmsfa/control/mergeLeadsForm']").click();

	}

	@Given("click on the lookup")
	public void clickOnTheLookup() {
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
	}
	@And("Enter Merge Lead first name as (.*)")
	public void EnterMergeLeadfirstnameas(String fname) throws InterruptedException {
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(fname);

	}
	@And ("click on Merge Find Leads button")
	public void clickonMergefindleadsbutton() throws InterruptedException{
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);

	}

	@And("click on the first resulting lead id")
	public void clickOnTheFirstResultingLead() {
		leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);

		driver.switchTo().window(allhandles.get(0));
	}

	@And("click on the lookup page")
	public void clickOnTheLookupAgain() {
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
	}

	@Given("Enter the first name again as (.*)")
	public void enterThefirstNameagainAs(String Fname) throws InterruptedException {
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(Fname);
		Thread.sleep(2000);
	}

	@And("click on Merge Find Leads button again")
	public void clickOnMergeFindLeadsButtonAgain() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
	}

	@And("click on the second time first leads")
	public void clickOnTheFirstResultingLeadAgain() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);

		driver.switchTo().window(allhandles2.get(0));

	}

	@And("click on Merge")
	public void clickOnMerge() {
		driver.findElementByXPath("//a[text()='Merge']").click();

	}

	@And("click on Ok in the alert")
	public void clickTheAlert() {
		driver.switchTo().alert().accept();
	}
	@Given ("find lead page Enter Lead id")
	public void EnterLeadid() {
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input").sendKeys("10520");
	}
	@When("click on find leads button again")
	public void leadFindButton() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();

	}
	@Then("record is displayed")
	public void displayed() {
		String text = driver.findElementByClassName("x-paging-info").getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}
}
