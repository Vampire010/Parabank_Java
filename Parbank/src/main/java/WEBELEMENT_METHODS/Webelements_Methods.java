package WEBELEMENT_METHODS;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");  
		
        // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  

        // Launch Website  
        driver.navigate().to("https://parabank.parasoft.com/"); 
        
        //Click on Register Link
       WebElement ele = driver.findElement(By.xpath("//*[@id=\'topPanel\']/a[2]/img"));
        
        
        Dimension SIZE = ele.getSize();   
        
        System.out.println(SIZE);
        
        String TAGNAME = ele.getTagName();
        
        System.out.println(TAGNAME);
        
        
        WebElement ele1 = driver.findElement(By.xpath("//*[@id=\'topPanel\']/p"));
        String Normal_TEXTER = ele1.getText();       
        System.out.println("Normal_TEXTER : " + Normal_TEXTER);
		
        
        WebElement ele2 = driver.findElement(By.xpath("//*[@id=\'loginPanel\']/p[1]/a"));
        String Link_TEXTER = ele2.getText();       
        System.out.println(" Link_TEXTER : "+  Link_TEXTER);
        
        WebElement ele3 = driver.findElement(By.xpath("//*[@id=\'loginPanel\']/form/div[3]/input"));
        String Button_TEXTER = ele3.getAttribute("value");       
        System.out.println(" Button_TEXTER : "+  Button_TEXTER);
        		
	}

}
