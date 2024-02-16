package javascriptExcutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToforScrollingOperators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://omayo.blogspot.com/");
		
		//To Typecast WebDriver to JavascriptExecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//perform Scroll downword operation
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		
		//perform Scroll upword operation
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(1000);
		
		//perform Scroll-Right operation
		js.executeScript("window.scrollBy(500,0)");
		Thread.sleep(1000);
		
		//perform Scroll-Left operations
		js.executeScript("window.scrollBy(-200,0)");
		Thread.sleep(1000);
		
		driver.close();
		

	}

}
