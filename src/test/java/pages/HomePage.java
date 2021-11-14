package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public WebDriver driver;

	By search = By.cssSelector(".search-keyword");
	By product = By.xpath("//h4[@class='product-name']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void searchForProduct(String productName) {
		driver.findElement(search).sendKeys(productName);
	}

	public String getProduct() {
		return driver.findElement(product).getText();
	}

}
