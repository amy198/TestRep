package testsel;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindAllElements {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "C:/Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of Links: "+links.size());
		for(int i=1;i<links.size();i++) {
			System.out.println("Name of the link is: "+links.get(i).getText());
		}
	}




	}


