package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest
{
	WebDriver driver;
	@Test
	@Parameters({"env","login"})
	public void webpage(String env,String login) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\chromejars\\chromedriver-win64\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(env);
	driver.findElement(By.id("userEmail")).sendKeys(login);
	Thread.sleep(2000);
	driver.close();
	
	}

}
