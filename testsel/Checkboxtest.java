package testsel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxtest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:/Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.calculator.net/mortgage-calculator.html");
		
		System.out.println("Before Clicking Output of isSelected: "+driver.findElement(By.id("caddoptional")).isSelected());
		
		driver.findElement(By.id("caddoptional")).click();
		System.out.println("After Clicking Output of isSelected: "+driver.findElement(By.id("caddoptional")).isSelected());
		
		System.out.println("Output of isEnbaled: "+driver.findElement(By.id("caddoptional")).isEnabled());
		

	}



	}


