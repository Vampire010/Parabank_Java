package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CLOSE_QUIT {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");  
			
	        // Instantiate a ChromeDriver class.     
	        WebDriver driver=new ChromeDriver();  

	        // Launch Website  
	     //   driver.navigate().to("https://parabank.parasoft.com/"); 

	        driver.get("https://www.snapdeal.com/");
	        
	        //Send USERNAME
	     WebElement ele=   driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/section/div[4]/section/div[2]/div[1]/div/div[5]/a/div[3]/div[1]"));
	     ele.click();
	     
	     
	     
	     Thread.sleep(5000);
	     driver.close();
	     
	     Thread.sleep(5000);
	     driver.quit();
	     
	     
	}

}



