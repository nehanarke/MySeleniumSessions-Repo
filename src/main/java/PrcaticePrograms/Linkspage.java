package PrcaticePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.errorprone.annotations.Var;

public class Linkspage
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\chromejars\\chromedriver-win64\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	
	try
	{
	driver.get("https://demoqa.com/links");
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.id("simpleLink")).click();
	Thread.sleep(2000);
	Var tabs;
	//driver.close();
	//driver.switchTo().window(tabs.get(0));
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
	driver.close();	
	}
	
}
}
