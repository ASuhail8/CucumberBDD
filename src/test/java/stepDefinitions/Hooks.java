package stepDefinitions;

import cucumber.bdd.Base;
import io.cucumber.java.After;

public class Hooks extends Base {

	@After
	public void quitDriver() {
		driver.quit();
	}

}
