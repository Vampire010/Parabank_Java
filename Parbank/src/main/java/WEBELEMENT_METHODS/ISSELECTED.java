package WEBELEMENT_METHODS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISSELECTED {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");  
		
        // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  

        // Launch Website  
        driver.navigate().to("http://mykidsbank.org/"); 
       
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        //Click on Register Link
       WebElement ele = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[6]/td[2]/input"));
       
       //Before Selecting the Checkbox
       boolean Bef_sel = ele.isSelected();          
       System.out.println("Before Selecting the Checkbox : " + Bef_sel);
       
 
        ele.click();
        
        //After Selecting the Checkbox
        boolean Aft_sel = ele.isSelected();           
        System.out.println("After Selecting the Checkbox : " +Aft_sel);

	}

}
