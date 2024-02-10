package methodsofWebdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMetod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(15000);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		 
		//driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		WebElement activeEle=driver.switchTo().activeElement();
		activeEle.sendKeys("java",Keys.ENTER);
		
		//driver.close();		
		

	}

}
