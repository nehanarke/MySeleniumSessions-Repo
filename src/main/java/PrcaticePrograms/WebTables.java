package PrcaticePrograms;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTables 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\chromejars\\chromedriver-win64\\chromedriver.exe")	;
	driver=new ChromeDriver();	
	
	/*driver.findElement(By.id("delete-record-1")).click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	*/
	try {
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement addButton = wait1.until(ExpectedConditions.elementToBeClickable(By.id("addNewRecordButton")));
        addButton.click();
        
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
        
        driver.findElement(By.id("firstName")).sendKeys("John");
        driver.findElement(By.id("lastName")).sendKeys("Doe");
        driver.findElement(By.id("userEmail")).sendKeys("john.doe@example.com");
        driver.findElement(By.id("age")).sendKeys("30");
        driver.findElement(By.id("salary")).sendKeys("50000");
        driver.findElement(By.id("department")).sendKeys("Engineering");
        
        driver.findElement(By.id("submit")).click();
	
	  } 
	catch (Exception e)
	  {
          e.printStackTrace();
  //printStackTrace() is a method in Java (and other programming languages) used for debugging and exception handling.
	  }
	finally
	{
		
	}
	
	
	}

}
