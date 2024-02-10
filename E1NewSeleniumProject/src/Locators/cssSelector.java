package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.instagram.com/accounts/login/");
     Thread.sleep(2000);
     
    WebElement userNameTB =driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']"));
     userNameTB.sendKeys("9970265713");
     
     WebElement passTB=driver.findElement(By.cssSelector("input[aria-label='Password']"));
     passTB.sendKeys("Rohit");
     
     WebElement loginBT=driver.findElement(By.cssSelector(""));
	}

}
