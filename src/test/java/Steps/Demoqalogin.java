package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demoqalogin {

	@Given("I am on Demoqa login page")
	public void i_am_on_demoqa_login_page() {
		System.out.println("I am on Demoqa login page");
	}

	@When("I click on NewUser")
	public void i_click_on_new_user() {
		System.out.println("I click on NewUser");

	}

	@Then("I get navigate to Register Book Store Page")
	public void i_get_navigate_to_register_book_store_page() {
		System.out.println("I get navigate to Register Book Store Page");
		
	}
}
