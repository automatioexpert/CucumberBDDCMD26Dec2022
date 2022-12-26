package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user_is_on_login_page");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		System.out.println("user_enters_valid_username_and_password");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("clicks_on_login_button");
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
		System.out.println("user_is_navigated_to_homepage");
	}

	@When("user enters 	invalid username and password")
	public void user_enters_invalid_username_and_password() {
		System.out.println("user_enters_invalid_username_and_password");
	}

	@Then("error message is displayed-Invalid credentials")
	public void error_message_is_displayed_invalid_credentials() {
		System.out.println("error_message_is_displayed_invalid_credentials");

	}

}
