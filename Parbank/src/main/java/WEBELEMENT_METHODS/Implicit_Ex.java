package WEBELEMENT_METHODS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Ex {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");  
		
        // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  

        // Launch Website  
        driver.navigate().to("file:///C:/Users/91973/git/repository/Parbank/HTML_PAGES/Five_Sec.html"); 
       
        
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        //Click on Register Link
       WebElement ele = driver.findElement(By.xpath("/html/body/button"));
       ele.click();
       
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       Alert alert = driver.switchTo().alert();
              
       alert.accept();
       
	}

}
