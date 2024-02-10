package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://shoppersstack.com/");
		
		driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 Pro']")).click();
		
		driver.findElement(By.id("Check Delivery")).sendKeys("423223");
		
		wait.until(ExpectedCondition.elementToBeClickable(driver.findElement(By.xpath("//button[]@id='check'"))));
		driver.findElement(By.xpath("//button[]@id='check'")).click();
		
	//	WebElement checkbutton = driver.findElement(By.xpath("//button[]@id='check'"));
	// wait.until(ExpectedCondition.elementToBeClickable(checkbutton));
	//    checkbutton.click();
		
		
		
	}

}
