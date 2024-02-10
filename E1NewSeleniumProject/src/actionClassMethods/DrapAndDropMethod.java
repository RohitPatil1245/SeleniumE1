package actionClassMethods;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrapAndDropMethod {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		   driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		   
		   driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		   driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		   driver.findElement(By.partialLinkText("Drag Position")).click();
		   
		   
		   WebElement mobileChargerSorce = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));		   
		   WebElement laptopChargerSorce = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
	        WebElement mobileCoverSource = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
	      WebElement laptopCoverSorce = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
	      WebElement mobileAccessoriesTarget = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
	      WebElement laptopAccessoriesTarget = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
	      
	      Actions act = new Actions(driver);
	      
	      act.dragAndDrop(mobileChargerSorce,mobileAccessoriesTarget ).perform();
	      act.dragAndDrop(mobileCoverSource,mobileAccessoriesTarget ).perform();
	      act.dragAndDrop(laptopChargerSorce,laptopAccessoriesTarget ).perform();
	      act.dragAndDrop(laptopCoverSorce,laptopAccessoriesTarget ).perform();
	      
	      Thread.sleep(2000);
	      driver.close();
	      //trello.com
	      
	
	
	}
	}


