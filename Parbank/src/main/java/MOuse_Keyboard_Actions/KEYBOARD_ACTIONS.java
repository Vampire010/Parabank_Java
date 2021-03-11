package MOuse_Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KEYBOARD_ACTIONS {

	public static void main(String[] args) throws InterruptedException 
	{
		  System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");  
			
	        // Instantiate a ChromeDriver class.     
	        WebDriver driver=new ChromeDriver();  


	        driver.get("file:///C:/Users/91973/git/repository/Parbank/HTML_PAGES/Login_Form.html");
	        
	        //Send USERNAME
	         WebElement ele = driver.findElement(By.xpath("/html/body/form/div[1]/input[1]"));
	         //Send PASSWORD
	        
	         ele.sendKeys("AL2021100");
	         ele.sendKeys(Keys.CONTROL,"A");
	         //ele.sendKeys("A");
	         Thread.sleep(2000);
	         ele.sendKeys(Keys.CONTROL ,"C");
	         //ele.sendKeys("C");
 
	         ele.sendKeys(Keys.TAB);	         
	         WebElement ele1  =  driver.findElement(By.xpath("/html/body/form/div[1]/input[2]"));	        
	         ele1.sendKeys(Keys.CONTROL ,"V");
	        // ele1.sendKeys("V");
	        
	}

}
