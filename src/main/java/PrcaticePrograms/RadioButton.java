package PrcaticePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromejars\\chromedriver-win64\\chromedriver.exe")	;
		driver=new ChromeDriver();
	driver.get("https://demoqa.com/radio-button");
	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(05,TimeUnit.SECONDS);
	WebElement radio;
	radio=driver.findElement(By.id("yesRadio"));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", radio);
	
	WebDriver window=driver.switchTo().newWindow(WindowType.WINDOW);
	window.get("https://google.com");
	
	WebDriver tab;
	tab=driver.switchTo().newWindow(WindowType.TAB);
	tab.get("https://web.whatsapp.com/");
	
	}

}
