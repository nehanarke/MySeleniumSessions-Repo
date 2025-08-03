package PrcaticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebApiPage 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\chromejars\\chromedriver-win64\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	
	try
	{
	driver.get("https://demoqa.com/links");	
	WebElement w;
	w=driver.findElement(By.id("created"));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", w);
	
	WebElement w2;
	w2=driver.findElement(By.linkText("No Content"));
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", w2);
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		
	}
}
}
