package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.bdd.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PracticePage;

public class Practice extends Base {

	public WebDriver driver;
	PracticePage practicePage;

	@Given("User is on Practice Landing Page")
	public void user_is_on_practice_landing_page() throws IOException {
		driver = Base.getDriver();
		Assert.assertEquals(driver.getTitle(), "Practice Page");
	}

	@When("I click on {string}")
	public void i_click_on(String radioBtnName) {
		practicePage = new PracticePage(driver);
		practicePage.clickOnRadioBtn(radioBtnName);
	}

	@Then("i validate that {string} is clicked and selected")
	public void i_validate_that_is_clicked_and_selected(String radioBtnName) {
		practicePage.verifySelectedRadioBtn(radioBtnName);
	}

	@Then("i quit the browser")
	public void i_quit_the_browser() {
		System.out.println("browser quit");
	}

	@When("User selects {string} option")
	public void user_selects_option(String option) throws InterruptedException {
		practicePage = new PracticePage(driver);
		practicePage.selectDropdown(option);
		Thread.sleep(2000);
	}

	@When("^User enters (.+) in the select countries text box$")
	public void user_enters_in_the_select_countries_text_box(String country) {
		practicePage = new PracticePage(driver);
		practicePage.enterCountryName(country);
	}

	@Then("^User should be able to select (.+)$")
	public void user_should_be_able_to_select(String country) throws InterruptedException {
		practicePage.selectCountry(country);
		Thread.sleep(1000);
	}

}
