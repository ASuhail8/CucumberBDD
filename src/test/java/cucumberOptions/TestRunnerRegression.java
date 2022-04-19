package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/Practice.feature", glue = "stepDefinitions", monochrome = true, tags = "@Regression", stepNotifications = true, plugin = {
		"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/RegressionTests.xml" })
public class TestRunnerRegression {

}
