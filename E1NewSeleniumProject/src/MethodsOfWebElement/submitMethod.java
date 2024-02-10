package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submitMethod {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		   driver.get("https://www.instagram.com/accounts/login/");
            
		   driver.findElement(By.name("username")).sendKeys("Qspider");
		   driver.findElement(By.name("password")).sendKeys("123456");
		   
		   WebElement loginBT = driver.findElement(By.xpath("//button[@type='submit']"));
		   loginBT.submit();
		   
	}

}
