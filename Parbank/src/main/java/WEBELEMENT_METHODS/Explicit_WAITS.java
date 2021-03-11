package WEBELEMENT_METHODS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_WAITS {

	public static void main(String[] args) 
	{
		

		System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");  
		
        // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  

        // Launch Website  
        driver.navigate().to("http://mykidsbank.org/"); 
       
        //Click on Register Link
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[6]/td[2]/input"))).click();
  
        //Click on Register Link
        WebElement ele = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[6]/td[2]/input"));
        
        //After Selecting the Checkbox
        boolean Bef_sel = ele.isSelected();          
        System.out.println("After Selecting the Checkbox : " + Bef_sel);
       
	}

}
