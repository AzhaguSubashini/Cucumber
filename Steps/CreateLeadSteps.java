package Steps;

import org.openqa.selenium.By;
/*import io.cucumber.java.en.Given;*/
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSteps extends BaseClass {

	
@When("Click on {string} link")
public void clickLink(String locatorValue) {
	driver.findElement(By.linkText(locatorValue)).click();}

@Then("CreateLead page should be displayed")
public void createleadpagedisplayed() {
	System.out.println("CreateLead page is displayed");

}}/*
	 * 
	 * @Given("Enter the company name {string}") public void companyname(String
	 * Compname) {
	 * driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Compname);
	 * 
	 * }
	 * 
	 * @Given("Enter the First name {string}") public void Fristname(String
	 * Fristname) {
	 * driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Fristname);
	 * 
	 * }
	 * 
	 * @Given("Enter the Secondname {string}") public void Secondname(String
	 * Secname) {
	 * driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Secname);
	 * 
	 * }
	 * 
	 * @Given("Enter the phonenumber {string}") public void phonenumber(String phno)
	 * {
	 * driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno)
	 * ;
	 * 
	 * }
	 * 
	 * @When("Click on create button") public void createbutton() {
	 * driver.findElement(By.name("submitButton")).click(); }
	 * 
	 * @Then("New lead will create") public void newlead() {
	 * System.out.println("New lead is created");
	 * 
	 * }}
	 * 
	 */