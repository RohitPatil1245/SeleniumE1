package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ByEventFiringSWebDriver {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.whatsapp.com/");
		
		EventFiringWebDriver EFWD=new EventFiringWebDriver(driver);
		
		File src = EFWD.getScreenshotAs(OutputType.FILE);// to take the screenshot of webpage
		
		File dest = new File("./screenshots/whatsapp.png");//to specify location,name and extention of screenshot
		
		Files.copy(src, dest);//to save the screenshot into screenshot folder

	}

}
