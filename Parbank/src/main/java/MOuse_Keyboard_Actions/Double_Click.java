package MOuse_Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");  
		
        // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  

        // Launch Website  
        driver.navigate().to("file:/C:/Users/91973/git/repository/Parbank/HTML_PAGES/dbclick.html"); 
		
        

		WebElement ele = driver.findElement(By.xpath("//*[@id=\'demo\']"));
		
		String color = ele.getCssValue("color");
		System.out.println("Before Double click "+color);	
		
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();

		String colors = ele.getCssValue("color");
		System.out.println("After Double click "+colors);	
		
		String Current_url = driver.getCurrentUrl();
		System.out.println(" URL : " +Current_url);	
        
	}

}
