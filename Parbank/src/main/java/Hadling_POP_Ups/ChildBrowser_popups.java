
package Hadling_POP_Ups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowser_popups {


	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site");
		
		
		
		String parentWinHandle = driver.getWindowHandle();

		System.out.println("Parent window handle: " + parentWinHandle);

		// Locate 'Click to open a new browser window!' button using id
        WebElement newWindowBtn = driver.findElement(By.id("win1"));

        // Click the button to open a new window
        newWindowBtn.click();


        // Get the window handles of all open windows

        Set<String>winHandles = driver.getWindowHandles();
        System.out.println("Open window handle: " + winHandles);
        // Loop through all handles
        for(String handle: winHandles){
            if(!handle.equals(parentWinHandle))
            {
            	
            	System.out.println("Where I am: " +  driver.getTitle());
            	
            	driver.switchTo().window(handle);
            	
            	Thread.sleep(1000);
            	System.out.println("Title of the new window: " + driver.getTitle());
            	
            	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Hello");

            	System.out.println("Closing the new window...");


            	driver.switchTo().window(parentWinHandle);
            	Thread.sleep(2000);
            	driver.switchTo().window(handle);
            	Thread.sleep(2000);
            	driver.close();

            }
        }
        // 	Switching the control back to parent window
        	driver.switchTo().window(parentWinHandle);
        // Print the URL to the console
        	System.out.println("Parent window URL: " + driver.getCurrentUrl());

	}

}
