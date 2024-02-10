package dropDownSelectionMethod;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownDeselectionMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		   driver.get("file:///C:/Users/patil/OneDrive/Desktop/WebElements/multi-dropdown.html");
		   
		   WebElement multiSelectDD = driver.findElement(By.id("menu"));
		   
		   Select sel = new Select(multiSelectDD);
		   sel.selectByIndex(3);
		   Thread.sleep(2000);
		   
		   sel.deselectByIndex(3);
		   Thread.sleep(2000);
		   
		   sel.selectByValue("v2");
		   Thread.sleep(2000);
		   
		   sel.deselectByValue("v2");
		   Thread.sleep(2000);
		   
		   sel.selectByVisibleText("Chai");
		   Thread.sleep(2000);
		   
		   sel.deselectByVisibleText("Chai");
		   
		    for (int i=0;i<=5;i++) {
		    	sel.selectByIndex(i);
		    	Thread.sleep(2000);
		    }
		    
		    sel.deselectAll();
		    Thread.sleep(2000);
		    
		    for (int i=0;i<=5;i++) {
		    	sel.selectByIndex(i);
		    	Thread.sleep(1000);
		    }
		    
		    for(int j=0;j<=5;j++) {
		    	
		    	sel.deselectByIndex(j);
		    	Thread.sleep(1000);
		    }

		   


	}

}
