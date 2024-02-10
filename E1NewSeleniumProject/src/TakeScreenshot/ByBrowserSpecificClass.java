package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByBrowserSpecificClass {

	public static void main(String[] args) throws IOException {
		
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		
		RemoteWebDriver rwd=(RemoteWebDriver)driver;//to store the reference with chromedriver
		
		File src = rwd.getScreenshotAs(OutputType.FILE);// to take the screenshot of web page
		File dest = new File("./screenshots/facebook.jpg");//to specify location,name and extention of screenshot
		Files.copy(src, dest);//to save the screenshot into screenshot folder

	}

}
