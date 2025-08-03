package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googletest1 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromejars\\\\chromedriver-win64\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.co.uk/");
	}
	
	@Test(priority=2,groups="t")
	public void gooltest()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test()
	public void googletesttype() throws InterruptedException
	{
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(2000);
	}
	@Test(priority=1,groups="logo")
	public void googlelink() throws InterruptedException
	{
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(2000);
	}
	@Test(groups="t")
	public void run()
	{
		driver.findElement(By.linkText("About")).click();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
}
