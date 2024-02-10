package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextClickMethod {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		
	
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		
		WebElement BT1 = driver.findElement(By.id("btn30"));
		WebElement BT2 = driver.findElement(By.id("btn31"));
         
		Actions act = new Actions(driver);
		
		act.contextClick(BT2).perform();
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		
	}

}
