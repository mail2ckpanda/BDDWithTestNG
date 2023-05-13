package StepDefinition;
import static org.testng.Assert.assertTrue;

import Factory.DriverFactory;
import Pages.RegistationPage;
import io.cucumber.java.en.*;

public class RegistationPage_SD  {
	
	private RegistationPage regPage = new RegistationPage(DriverFactory.getDriver());	
	
	@Then("user is on resistation page")
	public void user_is_on_resistation_page() {
	    
	}

	@Then("user enters {string} in firstname field")
	public void user_enters_in_firstname_field(String fname) {
		regPage.enterFirstName(fname);
	}
	
	@Then("user enters {string} in lastname field")
	public void user_enters_in_lastname_field(String lname) {
		regPage.enterLastName(lname);
	}

	@Then("user enters valid email id in email address field")
	public void user_enters_email_address() {
	   regPage.enterEmail();
	}

	@Then("user enters {string} in password field")
	public void user_enters_in_password_field(String pwd) {
	    regPage.enterPassword(pwd);
	}

	@Then("user selects  from countryCode field")
	public void user_selects_from_country_code_field() {
	    
	}

	@Then("user enters {string} in mobile number field")
	public void user_enters_in_mobile_number_field(String mobNum) {
	    regPage.enterMobileNum(mobNum);
	}

	@Then("user verify that the receive newsletter checkbox is checked by default")
	public void user_verify_that_the_receive_newsletter_checkbox_is_checked_by_default() {
	    
	}

	@Then("user clicks the register button")
	public void user_clicks_the_register_button() throws InterruptedException {
		regPage.clickRegisterButton();
	}
}


