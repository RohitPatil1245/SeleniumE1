package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		   driver.get("http://127.0.0.1/login.do;jsessionid=64ro7sq79tv77");
		   
		   WebElement checkBox = driver.findElement(By.name("remember"));
		   checkBox.click();
		   Thread.sleep(1000);
		   
		   boolean result = checkBox.isSelected();
		   System.out.println(result);
		   
		   checkBox.click();
		   
		   boolean result1 = checkBox.isSelected();
		   System.out.println(result1);

	}

}
