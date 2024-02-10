package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://app.fireflink.com/signin");
	     Thread.sleep(5000);
	     
	  //   WebElement signlk=driver.findElement(By.partialLinkText("Sign in"));
	  //   signlk.click();
	   //  Thread.sleep(2000);
	     
	     WebElement emailTB=driver.findElement(By.xpath("//input[@name='emailId']"));
	     emailTB.sendKeys("patilrohit");
	     Thread.sleep(1000);
	     
	     WebElement passTB=driver.findElement(By.xpath("//input[@name='password']"));
	     passTB.sendKeys("Rohit21222");
	     Thread.sleep(1000);
	     
	     WebElement loginTB=driver.findElement(By.xpath("//button[@type='submit']"));
	     loginTB.click();	
	     Thread.sleep(5000);
	     
	     

	}

}
