package Stepdefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
public class searchpage {
	
	WebDriver driver;
	@Given("user is in Search Page")
	public void navigateSearchPage() {
		System.setProperty("webdriver.chrome.driver", "C:/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
	
	}
	
	@When("user enters {string} in search field")
	public void enterProduct(String Product) {
		driver.findElement(By.name("search")).sendKeys(Product);
	
	
	}
	
	@And("user click on Search button")
	public void clickSearch() {
		driver.findElement(By.xpath("//div[@id='search']//button")).click();
		
	}
	@Then("Product {string} should be displayed")
	public void verifyProduct(String sProduct) {
		assertTrue(driver.findElement(By.xpath("//a[text()=" + sProduct + "]" )).isDisplayed());
				driver.quit();
	}
	
	
	

}
