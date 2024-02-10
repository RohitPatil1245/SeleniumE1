package methodsofWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();//To launch the web Application
		Thread.sleep(1000);
		
		driver.manage().window().maximize();//To maximize the web Application
		Thread.sleep(1000);
		
		driver.get("https://omayo.blogspot.com/");// To launch the web Application
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Open a popup window")).click();// To open the Child window 
		Thread.sleep(1000);
		
		
		driver.quit();// to close the parent as well as child browser window

	}

}
