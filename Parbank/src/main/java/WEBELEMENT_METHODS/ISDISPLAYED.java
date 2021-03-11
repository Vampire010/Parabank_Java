package WEBELEMENT_METHODS;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISDISPLAYED {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");  
		
        // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  

        // Launch Website  
        driver.navigate().to("file:///C:/Users/91973/git/repository/Parbank/HTML_PAGES/Enb_Disp.html"); 
        
        //Click on Register Link
       WebElement ele = driver.findElement(By.xpath("//*[@id=\'lname\']"));
      
        try
        {
        
        	WebElement ele1 = driver.findElement(By.xpath("//*[@id=\'lnames\']"));
        boolean Displayed = ele1.isDisplayed();
        
        System.out.println(Displayed);
        }
        
        catch(Exception e)
        {
        	
        	System.out.println("Element is Not Displayed");
        }
        
        
        boolean Enabeled = ele.isEnabled();
        
        System.out.println(Enabeled);
        

	}

}
