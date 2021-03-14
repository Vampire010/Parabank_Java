package Hadling_POP_Ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_Pop_Up {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");  
		
        // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  

        // Launch Website  
        driver.navigate().to("https://artoftesting.com/sampleSiteForSelenium"); 
	
		WebElement Gen_btn = driver.findElement(By.xpath("//*[@id=\"ConfirmBox\"]/button"));
		Gen_btn.click();

		Alert alrt = driver.switchTo().alert();
		
		String Alert_Text = alrt.getText();
		System.out.println( Alert_Text );
		
		//alrt.accept();
		alrt.dismiss();
		
		WebElement txt_field = driver.findElement(By.xpath("//*[@id=\"demo\"]"));
		
		String txt =txt_field.getText();
		System.out.println(  txt);
	
	}

}
