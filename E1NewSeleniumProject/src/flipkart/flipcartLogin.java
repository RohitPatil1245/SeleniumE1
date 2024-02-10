package flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	    Thread.sleep(2000);
	    
	   driver.findElement(By.name("q")).sendKeys("HP laptop");
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//div[text()='Brand']")).click();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//div[text()='HP']")).click();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//div[text()='RAM Capacity']")).click();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//div[text()='8 GB']")).click();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//div[text()='Core i5']")).click();
	   Thread.sleep(2000);
	
	   List<WebElement> laptop = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	   
	  List<WebElement> laptopprise = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
	   
	   for(int i=0;i<laptop.size();i++)
	   {
		   String op = laptop.get(i).getText();
		   
		   for(int j=i;j<=i;j++)
		   {
			   String prise = laptopprise.get(j).getText();
			   System.out.print(op+" : "+prise);
			   Thread.sleep(2000);
				
		   }
		   
		   System.out.println();
		   
		  		   
	   }
	   
	}
}
	
