package TestNG;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsSelenium 
{
	public static WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		 try {
		        System.setProperty("webdriver.chrome.driver", "C:\\chromejars\\chromedriver-win64\\chromedriver.exe");
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);  // Increased
		        driver.get("https://demoqa.com/alerts");
		    } catch (Exception e)
		 		{
		        System.err.println("Setup failed: " + e.getMessage());
		 		}
		}
	
	
	
	@Test
	public void firstAlert() throws InterruptedException
	{	
		
	driver.findElement(By.id("alertButton")).click();
	Alert a=driver.switchTo().alert();
	Thread.sleep(2000);
	a.accept();
	System.out.println(driver.getTitle());
	}
	
	@Test
	public void secondAlert() throws InterruptedException
	{
		 
			    // Hide all iframes (especially ad overlays)
			    ((org.openqa.selenium.JavascriptExecutor) driver).executeScript(
			        "document.querySelectorAll('iframe').forEach(el => el.style.display='none');"
			    );

			    // Now click the alert button
			    driver.findElement(By.id("timerAlertButton")).click();

			    // Wait for alert
			    new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());

			    // Optional wait (not really necessary if you're using WebDriverWait correctly)
			    

			    // Accept the alert
			    driver.switchTo().alert().accept();
			}
	
	@Test
	public void ThirdAlert()
	{
		driver.findElement(By.id("confirmButton")).click();
		
		Alert a=driver.switchTo().alert();
		a.dismiss();	
	}
	
	
	@Test
	public void FourthAlert()
	{
	
		((org.openqa.selenium.JavascriptExecutor) driver).executeScript(
		        "document.querySelectorAll('iframe').forEach(el => el.style.display='none');"
		    );

		    // Scroll the button into view before clicking
		    WebElement promptBtn = driver.findElement(By.id("promtButton"));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", promptBtn);
		    promptBtn.click();

		    // Interact with alert
		    Alert a = driver.switchTo().alert();
		    a.sendKeys("neha hii");
		    a.accept();
	}
	
	@AfterMethod
	public void closeBrowser() 
	{
	    if (driver != null)
	    {
	        driver.quit();
	    }
	}
	
}
