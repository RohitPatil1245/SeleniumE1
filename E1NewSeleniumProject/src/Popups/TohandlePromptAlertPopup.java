package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TohandlePromptAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		//To generate alert pop up
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		
		Alert promptalert = driver.switchTo().alert();
		
		String promptText = promptalert.getText();
		System.out.println(promptText);
		Thread.sleep(2000);
		
		//
		promptalert.sendKeys("Qspider");
		Thread.sleep(2000);
		
		//to click on ok button
		promptalert.accept();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
