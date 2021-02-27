package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Browser {

	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");  
			
	        // Instantiate a ChromeDriver class.     
	        WebDriver driver=new ChromeDriver();  

	      // Launch Website  
	        driver.navigate().to("https://parabank.parasoft.com/"); 
	        
	        driver.findElement(By.name("username")).sendKeys("Devil024");
	        driver.findElement(By.name("password")).sendKeys("Devil024");
	        driver.findElement(By.className("button")).click();

	}

}
