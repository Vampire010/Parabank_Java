package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Edge_Browser {

	public static void main(String[] args) {
		  System.setProperty("webdriver.edge.driver", "G:\\Parbank\\Drivers\\msedgedriver.exe");  
			
	        // Instantiate a ChromeDriver class.     
	        WebDriver driver=new EdgeDriver();

	      // Launch Website  
	        driver.navigate().to("https://parabank.parasoft.com/"); 
	        
	        driver.findElement(By.name("username")).sendKeys("Devil024");
	}

}
