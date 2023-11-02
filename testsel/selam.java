package testsel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class selam {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:/Software/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.edge.driver", "C:/Software/msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		driver.get("https://petstore.octoperf.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Enter the Store")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='FI-SW-01']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='EST-1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Return to FISH")).click();
		driver.findElement(By.linkText("Return to FISH")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Return to Main Menu")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Sign")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("j2ee");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("j2ee");
		Thread.sleep(3000);
		driver.findElement(By.name("signon")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.name("repeatedPassword")).sendKeys(Keys.TAB);
		  Thread.sleep(3000);
		  driver.findElement(By.name("account.firstName")).clear();
		  Thread.sleep(3000);
		driver.findElement(By.name("account.firstName")).sendKeys("ABCD");
		Thread.sleep(3000);
		driver.findElement(By.name("editAccount")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(3000);
		driver.quit();
		
		

	}

	private static void gotToNextElem(WebDriver driver, String shftTab) {
		// TODO Auto-generated method stub
		
	}

}
