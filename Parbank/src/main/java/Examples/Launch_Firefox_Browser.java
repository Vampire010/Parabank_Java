package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browser {

	public static void main(String[] args) {
		  System.setProperty("webdriver.gecko.driver", "G:\\Parbank\\Drivers\\geckodriver.exe");  
			
	        // Instantiate a ChromeDriver class.     
	        WebDriver driver=new FirefoxDriver();  

	      // Launch Website  
 driver.navigate().to("https://parabank.parasoft.com/"); 
	        
	        driver.findElement(By.name("username")).sendKeys("Devil024");
	}

}
