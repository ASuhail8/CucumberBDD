package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.bdd.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class searchStepDefinition extends Base {
	public WebDriver driver;
	HomePage homePage;

	@Given("^User is on GreenKart landing page$")
	public void user_is_on_greenkart_landing_page() throws Throwable {
		driver = Base.getDriver();
		Assert.assertEquals(driver.getTitle(), "GreenKart - veg and fruits kart");
	}

	@When("^User searches for vegetable \"([^\"]*)\"$")
	public void user_searches_for_vegetable_something(String vegetableName) throws Throwable {
		homePage = new HomePage(driver);
		homePage.searchForProduct(vegetableName);
		Thread.sleep(2000);
	}

	@Then("^\"([^\"]*)\" results are displayed$")
	public void something_results_are_displayed(String vegetableName) throws Throwable {
		homePage = new HomePage(driver);
		// Assert.assertTrue(
		// driver.findElement(By.xpath("//h4[@class='product-name']")).getText().contains(vegetableName));
		Assert.assertTrue(homePage.getProduct().contains(vegetableName));

	}

	@Then("^Verify selected product \"([^\"]*)\" item is displayed in checkout page$")
	public void verify_selected_product_something_item_is_displayed_in_checkout_page(String productName)
			throws Throwable {
		Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(productName));
	}

	@And("^Added \"([^\"]*)\" items to cart$")
	public void added_something_items_to_cart(String number) throws Throwable {
		int num = Integer.parseInt(number);
		for (int i = 1; i < num; i++) {
			Base.waitUntilElementIsClickable(By.cssSelector("a.increment")).click();
		}
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
	}

	@And("^User clicks on proceed to checkout page for purchase$")
	public void user_clicks_on_proceed_to_checkout_page_for_purchase() throws Throwable {
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
	}

	@When("^User searches for vegetables (.+)$")
	public void user_searches_for_vegetables(String vegetable) throws Throwable {
		homePage = new HomePage(driver);
		homePage.searchForProduct(vegetable);
		Thread.sleep(2000);
	}

	@Then("^Verify selected products (.+) item is displayed in checkout page$")
	public void verify_selected_products_item_is_displayed_in_checkout_page(String vegetable) throws Throwable {
		Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(vegetable));
	}

}
