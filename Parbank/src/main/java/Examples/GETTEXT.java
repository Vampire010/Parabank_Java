package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GETTEXT {

	public static void main(String[] args)
	{
		   System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");  
			
	        // Instantiate a ChromeDriver class.     
	        WebDriver driver=new ChromeDriver();  

	        // Launch Website  
	     //   driver.navigate().to("https://parabank.parasoft.com/"); 

	        driver.get("https://parabank.parasoft.com/");
	        
	        //Send USERNAME
	       WebElement ele=   driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[2]/a"));
	        
	        
	        String TEXTS = ele.getText();
	        
	        System.out.println(TEXTS);
	        
	        
	   driver.findElement(By.tagName("a")).click();
	        


	}

}
