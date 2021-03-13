package Registration.Parbank;

import java.io.File;

import org.apache.commons.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Registraion_Page
{

	public static void main(String[] args)
	{
		
		   System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");  
		
	        // Instantiate a ChromeDriver class.     
	        WebDriver driver=new ChromeDriver();  

	        // Launch Website  
	        driver.navigate().to("https://parabank.parasoft.com/"); 
	        
	        //Click on Register Link
	        driver.findElement(By.xpath("//*[@id=\'loginPanel\']/p[2]/a")).click();
	        
	        
	        
	        //   driver.findElement(By.linkText("Register")).click();
	        
		     //   driver.findElement(By.partialLinkText("Regi")).click();
		        
	        
	        //Send FirstName
	        driver.findElement(By.id("customer.firstName")).sendKeys("Girish");
	        
	        //Send FirstName
	        driver.findElement(By.id("customer.lastName")).sendKeys("Rathode");

	        
	        
	        
	        
	        //Address
	        driver.findElement(By.name("customer.address.street")).sendKeys("#100,Church Street");
	        
	        //City
	        driver.findElement(By.name("customer.address.city")).sendKeys("Austin");
	        
	        //State
	        driver.findElement(By.cssSelector("#customer\\.address\\.state")).sendKeys("Alska");
	        
	        //ZipCode
	        driver.findElement(By.cssSelector("#customer\\.address\\.zipCode")).sendKeys("123456");
	        
	        //Phone
	        driver.findElement(By.xpath("//*[@id=\'customer.phoneNumber\']")).sendKeys("1237894560");
	        
	        //SSN
	        driver.findElement(By.xpath("//*[@name='customer.ssn']")).sendKeys("AL2021113");	        
	        
	        //Username
	        driver.findElement(By.xpath("//*[@id=\'customer.username\']")).sendKeys("AL2021113");    
	        
	        //Password
	        driver.findElement(By.xpath("//*[@id=\'customer.password\']")).sendKeys("Devil@1234");	        
	        
	        //Confirm Password
	        driver.findElement(By.xpath("//*[@id=\'repeatedPassword\']")).sendKeys("Devil@1234");      
	        
	        //Click on Register Button
	        driver.findElement(By.xpath("//*[@id=\'customerForm\']/table/tbody/tr[13]/td[2]/input")).submit();	   
	        
	        //Take the screenshot
	       TakesScreenshot ts =((TakesScreenshot)driver);
	        
	        File srcfile =ts.getScreenshotAs(OutputType.FILE);
	        
	        try
	        {
	        	FileUtils.copyFile(srcfile, new File("./SCREENSHOTS_TS/Screnshot.png"));
	        	
	        }
	        catch(Exception e)
	        {
	        	
	        	System.out.println(e);
	        } 
	}

}
