package goibibo;
import java.time.Duration;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.List;
//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoibiboWebsite
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\chromejars\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

    // Create ChromeOptions instance
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-notifications");
    options.addArguments("--start-maximized");

 
  WebDriver driver=new ChromeDriver(options);
  
    driver.get("https://www.goibibo.com/");
    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
   
    WebElement closeBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='logSprite icClose']")));
    closeBtn.click();
       // System.out.println("Login/signup popup closed successfully.");
    WebElement holiday;
    holiday=driver.findElement(By.xpath("//span[text()='Holidays']"));
    holiday.click();
    
    Thread.sleep(4000); // Wait for the page to load

    WebDriverWait waitNew = new WebDriverWait(driver, Duration.ofSeconds(10));
    
    System.out.println("hellllo");
    //List<WebElement> modalEls = driver.findElements(By.cssSelector(".modalContainer"));
    
    WebDriver driver1=new ChromeDriver(options);

    // 1. Wait and locate the city input box
    JavascriptExecutor js = (JavascriptExecutor) driver1;

    driver1.get("https://giholidays.makemytrip.com/holidays-india/");

    int maxAttempts = 2;
    boolean modalStillPresent = true;

    for (int attempt = 1; attempt <= maxAttempts; attempt++) {
        System.out.println("Attempt #" + attempt + ": Checking for modal...");

        // Use JS to check if modal is in DOM
        Boolean isModalPresent = (Boolean) js.executeScript(
            "return document.querySelector('div.modalContainer') !== null;" );

        if (!isModalPresent) 
        {
        	System.out.println("Modal is gone! Proceeding...");
            modalStillPresent = false;
           // break;
        }

        System.out.println("Modal is still present. Refreshing page...");
        driver1.navigate().refresh();

        // Optional wait after reload
        try {
            Thread.sleep(2000); // wait 2 seconds after reload
        } 
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    if (modalStillPresent) 
    {
        System.out.println("❌ Modal still present after 5 attempts.");
    }
    // Proceed with next actions, or close driver
    /*WebElement fromcity=driver.findElement(By.xpath("//input[@id='fromCity']"));
    fromcity.sendKeys("Pune");
    */
    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
    //Thread.sleep(3000);
    WebElement cityInput = wait2.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//input[@data-testid='citypicker_input']")));

    cityInput.click();
    cityInput.clear();
    cityInput.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE)); // Hard clear
   // cityInput.sendKeys("Pune");

    
  //  driver.quit();
    }
}