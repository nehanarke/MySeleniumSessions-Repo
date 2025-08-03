package launchbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ImplicitWaitProg 
{
public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\chromejars\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//pageLoadTimeout sets the maximum time Selenium WebDriver will wait for a web page to completely load after calling driver.get(url) 

	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
	//if all web elements are loaded within 20s than rest of the 10s are saved ,
//Tells WebDriver to wait for a certain amount of time when trying to find an element if it’s not immediately available
	
	
	}
}
