package dropDownSelectionMethod;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptionsMethod {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		   driver.get("file:///C:/Users/patil/OneDrive/Desktop/WebElements/multi-dropdown.html");
		   
        WebElement multiSelectDD = driver.findElement(By.id("menu"));
		   
		   Select sel = new Select(multiSelectDD);
		   
		   List<WebElement> options = sel.getOptions();
		   
		  // int size = options.size();
		  // System.out.println(size);
		   
		  for (int i=0;i<options.size();i++) {
			  String ops = options.get(i).getText();
			  System.out.println(ops);
		  }
	}

}
