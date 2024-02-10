package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		   
		   driver.get("https://demoapps.qspiders.com/ui/?scenario=1");
		   Thread.sleep(1000);
		  WebElement result = driver.findElement(By.xpath("//li[text()='disabled']"));
		   Thread.sleep(1000);
		   result.click();
		   

	}

}
