package dropDownSelectionMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookSignupDropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		   driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569897%7Cb%7Cfacebook%20log%20in%7C&placement=&creative=589460569897&keyword=facebook%20log%20in&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409266755%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiAq4KuBhA6EiwArMAw1AUHUrpmvzsMtazj5Y4GIROcBziuovdHn_KNsvMdhmqXtDQc1GDDbhoCiloQAvD_BwE");
		   
         WebElement dayDropdown = driver.findElement(By.id("day"));
         WebElement monthdropdown = driver.findElement(By.id("month"));
         WebElement yeardropdown = driver.findElement(By.id("year"));
         
          Select daySelect = new Select(dayDropdown);
          boolean result = daySelect.isMultiple();
          System.out.println("DayDropdown is Multiple : " +result);
          
          List<WebElement> dayOptions = daySelect.getOptions();
          for(WebElement we:dayOptions) {
        	  System.out.println(we.getText());
          }
          daySelect.selectByIndex(16);
          System.out.println("----------------------------------------------------------");
          System.out.println();
          
          
          Select monthSelect = new Select(monthdropdown);
          boolean result2 = monthSelect.isMultiple();
          System.out.println("MonthDropdown is Multiple : "+result2);
          
          System.out.println("------------------------------------------------------------");
          
          List<WebElement> monthOptions = monthSelect.getOptions();
          for(WebElement we:monthOptions) {
        	  System.out.println(we.getText());
          }
           monthSelect.selectByValue("10");
           System.out.println("---------------------------------------------------------------");
           System.out.println();
	}

}
