package testsel;
import java.sql.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newprogramdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().window().maximize();
		driver.findElement(By.name("search")).sendKeys("iphone");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='search']//button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='iPhone']")).click();
		Thread.sleep(3000);
		WebElement p=driver.findElement(By.xpath("//h2[text()='$123.20']"));
		System.out.println("Total: "+ p.getText());
		Thread.sleep(3000);
		driver.findElement(By.name("quantity")).clear();
		driver.findElement(By.name("quantity")).sendKeys("2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='product']//button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("cart")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='text-right']//ancestor::div")).click();
		WebElement t= driver.findElement(By.id("cart-total"));
		System.out.println("Total: "+ t.getText());
		driver.quit();
		
	}

}
