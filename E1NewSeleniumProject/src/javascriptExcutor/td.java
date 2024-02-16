package javascriptExcutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class td {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		
		WebElement hiddenElement = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		//hiddenElement.sendKeys("Qspider");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].value='Qspider'", hiddenElement);

	}

}
