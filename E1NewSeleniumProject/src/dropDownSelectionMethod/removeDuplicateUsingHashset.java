package dropDownSelectionMethod;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class removeDuplicateUsingHashset {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		   driver.get("file:///C:/Users/patil/OneDrive/Desktop/WebElements/multi-dropdown.html");
		   
            WebElement multiSelectDD = driver.findElement(By.id("menu"));
    
              Select sel=new Select(multiSelectDD);
              
             HashSet<String> hs = new HashSet<String>();
              
              List<WebElement> options = sel.getOptions();
              
             for(int i=0;i<options.size();i++) {
            	 
            	 String textToInsert = options.get(i).getText();
            	 hs.add(textToInsert);
            	  
              }
             
             for(String text :hs) {
            	 System.out.println(text);
             }
	         
	      /* for(WebElement we:options) {
	        	String TXT = we.getText();
	        	 hs.add(TXT);
	        	 
	         }
	         
	         for(String text :hs) {
	        	 
	        	 System.out.println(text);
	         }*/
	         
              
              

	}

}
