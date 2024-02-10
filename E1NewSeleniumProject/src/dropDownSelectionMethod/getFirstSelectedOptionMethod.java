package dropDownSelectionMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedOptionMethod {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		   driver.get("file:///C:/Users/patil/OneDrive/Desktop/WebElements/multi-dropdown.html");
		   
     WebElement multiSelectDD = driver.findElement(By.id("menu"));
		   
		   Select sel = new Select(multiSelectDD);
		   
		   for(int i=2;i<4;i++) {
			   sel.selectByIndex(i);
		   }
		   
		   WebElement firstOption = sel.getFirstSelectedOption();
		   
		   System.out.println(firstOption.getText());

	}

}
