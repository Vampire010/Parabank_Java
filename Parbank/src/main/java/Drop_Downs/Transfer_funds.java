package Drop_Downs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Transfer_funds {

	public static void main(String[] args) throws InterruptedException 
	{
		  System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");  
			
	        // Instantiate a ChromeDriver class.     
	        WebDriver driver=new ChromeDriver();  

	        driver.get("file:///C:/Users/91973/git/repository/Parbank/HTML_PAGES/drop_don.html");	       
	        WebElement ele1 = driver.findElement(By.xpath("/html/body/bode/select"));
	        
	        Select From_account = new Select(ele1);
	        From_account.selectByIndex(2);
	        From_account.selectByValue("design");
	        From_account.selectByVisibleText("Ember");
	        
	        //From_account.deselectByIndex(2);
	       // From_account.deselectByValue("design");
	       // From_account.deselectByVisibleText("Ember");
	        Thread.sleep(2000);
	        From_account.deselectAll();
	}

}
