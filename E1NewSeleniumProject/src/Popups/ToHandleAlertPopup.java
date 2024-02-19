package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actionClassMethods.ClickAndHoldMethod;

import java.time.Duration;

public class ToHandleAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		//To generate alert popup
		driver.findElement(By.id("alert1")).click();
		Thread.sleep(2000);
		
		//to Switch the control to Alert popup
		Alert alertPopup = driver.switchTo().alert();
		
		alertPopup.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("alert1")).click();
		Thread.sleep(2000);
		
		alertPopup.dismiss();
		Thread.sleep(2000);
		
		

	}

}
