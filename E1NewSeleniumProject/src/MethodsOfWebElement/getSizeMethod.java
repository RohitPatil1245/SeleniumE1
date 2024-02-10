package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSizeMethod {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		   driver.get("http://127.0.0.1/login.do;jsessionid=64ro7sq79tv77");
		   
		   WebElement userTXT = driver.findElement(By.name("username"));
		   Dimension size = userTXT.getSize();
		   int height = size.getHeight();
		   int width = size.getWidth();
		   
		   System.out.println("Hieght is : "+height+" and Width is : "+width);

	}

}
