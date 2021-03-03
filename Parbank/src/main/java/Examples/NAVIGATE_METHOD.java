package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NAVIGATE_METHOD {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");  
			
	        // Instantiate a ChromeDriver class.     
	        WebDriver driver=new ChromeDriver();  

	        // Launch Website  
	        driver.navigate().to("https://parabank.parasoft.com/"); 
	        
	        //Click on ParaBank Is Now Re-Opened Link
	        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[2]/a")).click();
	        
	        //Waiting Time
	        Thread.sleep(5000);
	        
	        //Navigate to BackWard
	        driver.navigate().back();
	        
	        //Waiting Time
	        Thread.sleep(5000);
	        
	        //Navigate to forward
	        driver.navigate().forward();
	        
	        
	        //Waiting Time
	        Thread.sleep(5000);
	        
	        driver.navigate().refresh();
	        
	        
	}

}
