package methodsofWebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Dimension targetSize=new Dimension(400,500);// to pass width and height to Dimension class
		
		driver.manage().window().setSize(targetSize);// to pass the dimension to setSize method 
		

	}

}
