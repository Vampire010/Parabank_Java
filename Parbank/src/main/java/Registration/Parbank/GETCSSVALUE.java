package Registration.Parbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GETCSSVALUE {

	public static void main(String[] args)
{
		 System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");  
			
	        // Instantiate a ChromeDriver class.     
	        WebDriver driver=new ChromeDriver();  

	        // Launch Website  
	        //   driver.navigate().to("https://parabank.parasoft.com/"); 

	        driver.get("https://parabank.parasoft.com/");
	        
	        //Send USERNAME
	    WebElement attr =    driver.findElement(By.xpath("//*[@id=\'leftPanel\']/h2"));
	    
	  //  String att= attr.getCssValue("background");
	    String att= attr.getCssValue("font-size");
	    System.out.print(att);

	}

}
