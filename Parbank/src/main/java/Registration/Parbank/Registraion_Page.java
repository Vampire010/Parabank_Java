package Registration.Parbank;

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
	        driver.navigate().to("https://www.amazon.com"); 
	        
	        
	}

}
