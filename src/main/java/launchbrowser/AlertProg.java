package launchbrowser;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertProg {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\chromejars\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	
	driver.manage().timeouts().pageLoadTimeout(05,TimeUnit.SECONDS);
	
	driver.findElement(By.id("alertButton")).click();
	Alert a=driver.switchTo().alert();
	Thread.sleep(2000);
	a.accept();
	
	driver.findElement(By.id("timerAlertButton")).click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	alert.accept();
	
	
	driver.findElement(By.id("confirmButton")).click();
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	Alert a2=driver.switchTo().alert();
	Thread.sleep(5000);
	a2.dismiss();
	
	driver.findElement(By.id("promtButton")).click();
	
	Alert a3=driver.switchTo().alert();
	Thread.sleep(5000);
	a3.sendKeys("neha hii");
	Thread.sleep(2000);
	a3.accept();
	
	}

}
