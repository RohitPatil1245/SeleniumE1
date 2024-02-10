package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValueMethod {
	public static void main(String[] args) {
		
		
		 WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		   driver.get("http://127.0.0.1/login.do;jsessionid=64ro7sq79tv77");
		   
		   WebElement loginBT = driver.findElement(By.id("loginButton"));
		   String cssValue = loginBT.getCssValue("background");
		   
		   System.out.println(cssValue);
	}

}
