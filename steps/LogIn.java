package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogIn extends BaseClass{
	
	
	
	
	/*
	 * @Given("open the chrome browser as maximized") public void opneBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize(); }
	 * 
	 * @Given("load the application url") public void openUrl() {
	 * driver.get("http://leaftaps.com/opentaps/control/main");
	 * 
	 * 
	 * }
	 */ 
@Given("enter the username as (.*)")
	public void enterUserName(String uName) {
		driver.findElementById("username").sendKeys(uName);

	}
@Given("enter the password as (.*)")
	public void enetrPassword(String pWord) {
		driver.findElementById("password").sendKeys(pWord);

	}
	@When("click on login button")
	public void logInButton() {
		driver.findElementByClassName("decorativeSubmit").click();

	}
	@Then("homepage should be displayed")
	public void homePage() {
		System.out.println("homepage is displayed");
	}
	@But("error message should be displayed")
	public void errorMesg() {
		System.out.println("The error message is displayed");

	}
	
	@And("click on create lead button")
	public void createLead() {
		driver.findElementByLinkText("Create Lead").click();

	}
	@And("Enter the company name as MNW")
	public void companyName() {
		driver.findElementById("createLeadForm_companyName").sendKeys("MNW");

	}
	@And("Enter the first name as Kameshwar")
	public void firstName() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Kameshwar");

	}
	@And("Enter the last name as S")
	public void lastName() {
		driver.findElementById("createLeadForm_lastName").sendKeys("S");

	}
	@When("click the submit button")
	public void submitButton() {
		driver.findElementByName("submitButton").click();

	}
	@Then("create lead is displayed")
	public void createLeadDisplay() {
		System.out.println("The Lead is Created");
	}
}


