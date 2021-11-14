package stepDefinitions;

import cucumber.bdd.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {

	@Before("@Smoke")
	public void beforeValidation() {
		System.out.println("Before validation");
	}

	@After("@Smoke")
	public void afterValidation() {
		System.out.println("After validation");
	}

	@After("@SeleniumTest")
	public void quitDriver() {
		driver.quit();
	}

}
