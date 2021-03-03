package Registration.Parbank;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Login {

	public static void main(String[] args) throws InterruptedException
	{
		   System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");  
			
	        // Instantiate a ChromeDriver class.     
	        WebDriver driver=new ChromeDriver();  

	        // Launch Website  
	     //   driver.navigate().to("https://parabank.parasoft.com/"); 

	        driver.get("https://parabank.parasoft.com/");
	        
	        //Send USERNAME
	        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("AL2021100");
	        
	        
	        Thread.sleep(5000);
	        
	        //clear text
	        
	        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).clear();
	        
	        //Send PASSWORD
	        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("Devil@1234");
	        
	        //Click on LOGIN Button
	        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();


	}

}
