package methodsofWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
         
         driver.navigate().to("https://www.selenium.dev/downloads/");
         Thread.sleep(2000);
         driver.navigate().back(); // navigate to back page
         Thread.sleep(2000);
         driver.navigate().forward();
         Thread.sleep(2000);
         driver.navigate().refresh();
         
	}

}
