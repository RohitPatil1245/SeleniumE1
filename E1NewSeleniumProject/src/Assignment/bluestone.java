package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class bluestone {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gad_source=1&gclid=Cj0KCQiAw6yuBhDrARIsACf94RXD8KvTWSheiIbkdpKQGL4dJIeOHfmnVfsJ0qIWusBARCwUGMtOYrYaAkgAEALw_wcB");
        
		Actions act = new Actions(driver);
		WebElement coins = driver.findElement(By.xpath("//a[@title='Coins']"));
		act.moveToElement(coins).perform();
		
		WebElement grame1 = driver.findElement(By.xpath("//span[text()='1 gram' ]"));
		act.click(grame1).perform();
		
		TakesScreenshot tS=(TakesScreenshot)driver;
		File src = tS.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/bluestone.jpg");
		Files.copy(src, dest);
	}
	

}

