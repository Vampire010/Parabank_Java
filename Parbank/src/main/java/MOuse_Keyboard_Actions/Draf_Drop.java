package MOuse_Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Draf_Drop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");  
		
        // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  

        // Launch Website  
        driver.navigate().to("http://demo.guru99.com/test/drag_drop.html"); 
        driver.manage().window().maximize();
		
        WebElement source=driver.findElement(By.xpath("//*[@id='credit2']/a"));
    	WebElement target=driver.findElement(By.xpath("//*[@id='bank']/li"));

		// Actions act=new Actions(driver);
	//	act.dragAndDrop(source, target).perform();

		Thread.sleep(3000);
		//Creating object of Actions class to build composite actions
		Actions builder = new Actions(driver);

		//Building a drag and drop action
		Action dragAndDrop = builder.clickAndHold(source)
				.moveToElement(target)
				.release(target)
			.build();

		//Performing the drag and drop action
		dragAndDrop.perform();

		
		
	}

}
