package cucumber.bdd;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	protected static WebDriver driver;
	private static WebDriverWait wait;

	public static WebDriver getDriver() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(getProperties().getProperty("PracticeUrl"));
		return driver;
	}

	public static Properties getProperties() throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/java/cucumber/bdd/global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop;
	}

	public static WebElement waitUntilElementIsClickable(By locator) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public static WebElement waitUntilElementTobeVisible(By locator) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static Select selectDropdown(WebElement element) {
		Select select = new Select(element);
		return select;
	}

}
