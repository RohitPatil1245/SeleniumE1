
package methodsofWebdriver;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPositionMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Point targetPoint= new Point(400, 200);// to pass width and height to Dimension class
		
		driver.manage().window().setPosition(targetPoint);// to pass the dimension to setSize method 
		

	}

}
