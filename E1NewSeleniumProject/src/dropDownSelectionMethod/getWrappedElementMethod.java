package dropDownSelectionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getWrappedElementMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		   driver.get("file:///C:/Users/patil/OneDrive/Desktop/WebElements/multi-dropdown.html");
		   
WebElement multiSelectDD = driver.findElement(By.id("menu"));
		   
		   Select sel = new Select(multiSelectDD);
		   WebElement elements = sel.getWrappedElement();
		   String textOptions = elements.getText();
		   System.out.println(textOptions);

	}

}
