package methodsofWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
         
         driver.get("https://www.selenium.dev/downloads/");//to launch url/application
         
	}

}
