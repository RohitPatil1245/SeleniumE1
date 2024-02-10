package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		   driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		   
		   driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		   driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		   
		   WebElement clickAndHold = driver.findElement(By.xpath("//div[@id='circle']"));
		   
		   Actions act = new Actions(driver);
		   act.clickAndHold(clickAndHold).perform();
		   
		   Thread.sleep(4000);
		   driver.close();
		   
		   

	}

}
