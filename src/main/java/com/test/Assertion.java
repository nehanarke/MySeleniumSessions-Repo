package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertion 
{
	WebDriver driver;
	@BeforeMethod
	public void openpage()
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\chromejars\\\\chromedriver-win64\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.uk/");
	}
	@Test
	public void titlepage()
	{
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title,"Google12","title is not matched");
	
	}
}
