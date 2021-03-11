package MOuse_Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Huore {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");  
		
        // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  

        // Launch Website  
        driver.navigate().to("https://www.snapdeal.com"); 
        driver.manage().window().maximize();
		
        WebElement source=driver.findElement(By.xpath("//*[@id=\'leftNavMenuRevamp\']/div[1]/div[2]/ul/li[1]"));

        Actions action = new Actions(driver);
       
        action.moveToElement(source).perform();
        
        driver.findElement(By.xpath("//*[@id=\'category1Data\']/div[1]/div/div/p[2]/a")).click();
        
	}

}
