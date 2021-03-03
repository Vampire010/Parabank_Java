package Registration.Parbank;

import org.openqa.selenium.By;

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
	        
	        //Send FirstName
	        driver.findElement(By.xpath("//*[@id=\'customer.firstName\']")).sendKeys("Girish");
	        
	        //Send FirstName
	        driver.findElement(By.xpath("//*[@id=\'customer.lastName\']")).sendKeys("Rathode");

	        //Address
	        driver.findElement(By.xpath("//*[@id=\'customer.address.street\']")).sendKeys("#100,Church Street");
	        
	        //City
	        driver.findElement(By.xpath("//*[@id=\'customer.address.city\']")).sendKeys("Austin");
	        
	        //State
	        driver.findElement(By.xpath("//*[@id=\'customer.address.state\']")).sendKeys("Alska");
	        
	        //ZipCode
	        driver.findElement(By.xpath("//*[@id=\'customer.address.zipCode\']")).sendKeys("123456");
	        
	        //Phone
	        driver.findElement(By.xpath("//*[@id=\'customer.phoneNumber\']")).sendKeys("1237894560");
	        
	        //SSN
	        driver.findElement(By.xpath("//*[@id=\'customer.ssn\']")).sendKeys("AL2021100");	        
	        
	        //Username
	        driver.findElement(By.xpath("//*[@id=\'customer.username\']")).sendKeys("AL2021100");    
	        
	        //Password
	        driver.findElement(By.xpath("//*[@id=\'customer.password\']")).sendKeys("Devil@1234");	        
	        
	        //Confirm Password
	        driver.findElement(By.xpath("//*[@id=\'repeatedPassword\']")).sendKeys("Devil@1234");      
	        
	        //Click on Register Button
	        driver.findElement(By.xpath("//*[@id=\'customerForm\']/table/tbody/tr[13]/td[2]/input")).click();	        
	        
	        
	        
	}

}
