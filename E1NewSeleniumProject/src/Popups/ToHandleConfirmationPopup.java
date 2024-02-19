package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		//To generate alert popup
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		
		Alert Comfirmpopup = driver.switchTo().alert();
		Thread.sleep(2000);
		
		Comfirmpopup.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		
		Comfirmpopup.dismiss();
		Thread.sleep(2000);
		
		driver.close();
		
		
		

	}

}
