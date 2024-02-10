package dropDownSelectionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownSelectionMethods {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		   driver.get("file:///C:/Users/patil/OneDrive/Desktop/WebElements/dropdown1.html");
		   
		   WebElement singleSelectDD = driver.findElement(By.id("menu"));
		   Select sel = new Select(singleSelectDD);
		   
		   sel.selectByIndex(4);
		   Thread.sleep(2000);
		   
		   sel.selectByValue("v2");
		   Thread.sleep(2000);
		   
		   sel.selectByVisibleText("Coffee");

	}

}
