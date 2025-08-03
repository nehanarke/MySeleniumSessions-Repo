package launchbrowser;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitElement {

	private static final Class<? extends Throwable> StaleElementException = null;
	public static void main(String[] args) 
	{
	//
		System.setProperty("webdriver.chrome.driver","C:\\chromejars\\chromedriver-win64\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/modal-dialogs");
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		//driver.get("");
		clickOn(driver,driver.findElement(By.id("showLargeModal")),20);
		
		
		
	}
	private static void clickOn(WebDriver driver, WebElement element, int i) {
		// TODO Auto-generated method stub
		
	}
	public static void clickOn(WebDriver driver,WebElement locator, Duration i)
	{
		new WebDriverWait(driver,i).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
	locator.click();
	}
	

}
