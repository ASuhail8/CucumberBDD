package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given("^I want to write a step with precondition$")
	public void I_want_to_write_a_step_with_precondition() {
		System.out.println("I want to write a step with precondition");
	}

	@And("^some other precondition$")
	public void some_other_precondition() {
		System.out.println("some other precondition");
	}

	@When("^I complete action with username \"([^\"]*)\" password \"([^\"]*)\"$")
	public void i_complete_action_with_username_something_and_password_something(String strArg1, String strArg2) {
		System.out.println("logged in using " + strArg1 + " " + strArg2);
	}

	@And("^some other action$")
	public void some_other_action() {
		System.out.println("some other action");
	}

	@And("^yet another action$")
	public void yet_another_action() {
		System.out.println("yet another action");
	}

	@Then("^I validate the outcomes$")
	public void I_validate_the_outcomes() {
		System.out.println("I validate the outcomes");
	}

	@And("^validation is \"([^\"]*)\"$")
	public void validation_is_something(String strArg1) throws Throwable {
		System.out.println("validation is " + strArg1);
	}

	@When("^I complete action of sign up with following details$")
	public void i_complete_action_of_sign_up_with_following_details(DataTable data) throws Throwable {
		List<List<String>> obj = data.asLists();
		System.out.println("username = " + obj.get(0).get(0));
		System.out.println("password = " + obj.get(0).get(1));
		System.out.println("email = " + obj.get(0).get(2));
		System.out.println("country = " + obj.get(0).get(3));
		System.out.println("phone No = " + obj.get(0).get(4));
	}

	@When("^I complete action with username (.+) and password (.+)$")
	public void i_complete_action_with_username_and_password(String username, String password) throws Throwable {
		System.out.println(username);
		System.out.println(password);
	}

	@Given("^validate the browser$")
	public void validate_the_browser() throws Throwable {
		System.out.println("validate the browser");
	}

	@When("^browser is triggered$")
	public void browser_is_triggered() throws Throwable {
		System.out.println("browser is triggered");
	}

	@Then("^check if browser is started$")
	public void check_if_browser_is_started() throws Throwable {
		System.out.println("check if browser is started");
	}

}
