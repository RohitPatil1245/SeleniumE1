package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(20000);
		
		WebElement usnTB=driver.findElement(By.name("email"));
		usnTB.sendKeys("patilrohit@gmail.com");
		Thread.sleep(1000);
		
		WebElement passTB=driver.findElement(By.name("password"));
		passTB.sendKeys("Rohit$12");
		Thread.sleep(1000);
		
		WebElement loginBT=driver.findElement(By.id("loginButton"));
		loginBT.click();
		
		
		

	}

}
