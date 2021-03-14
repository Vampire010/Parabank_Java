package Hadling_POP_Ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");  
		
        // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  

        // Launch Website  
        driver.navigate().to("https://tus.io/demo.html"); 
	
		WebElement Gen_btn = driver.findElement(By.xpath("//*[@id=\"js-file-input\"]"));
		Gen_btn.sendKeys("C:\\Users\\91973\\git\\repository\\Parbank\\HTML_PAGES\\dbclick.html");

	}

}
