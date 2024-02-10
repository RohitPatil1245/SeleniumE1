package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByWebElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		WebElement loginBT = driver.findElement(By.xpath("//div[text()='Log in']"));
		
		File src = loginBT.getScreenshotAs(OutputType.FILE);// to take the screenshot of webpage
		File dest = new File("./screenshots/loginbutton.jpg");//to specify location,name and extention of screenshot
		Files.copy(src, dest);//to save the screenshot into screenshot folder

	}

}
