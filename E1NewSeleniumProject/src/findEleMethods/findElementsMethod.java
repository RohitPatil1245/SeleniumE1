package findEleMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		WebElement activeEle = driver.switchTo().activeElement();
		activeEle.sendKeys("bikes");
		Thread.sleep(1000);
		
		 List<WebElement> bikesoptions =driver.findElement(By.xpath("//div[@class='wM6W7d']"));
		 
	//	 for(in i=0; i<bikesoptions.size(); i++)
	//	 {
	//		 String ops = bikesoptions.get(i).getText();
		//	 System.out.println(ops);
	//		 Thread.sleep(1000);
		// }
		 
		 for(WebElement we:bikesoptions)
		 {
			 String optionString=we.getText();
			 System.out.println(optionString);
			 Thread.sleep(1000);
			 }
		 
		
		

	}

}
