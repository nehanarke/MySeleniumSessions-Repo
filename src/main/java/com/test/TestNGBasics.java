package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics 
{
	static WebDriver driver;
	
	@BeforeSuite
	public void pre()
	{
		System.out.println("pre");	
	}
	@BeforeTest
	public void test()
	{
		System.out.println("test");	
	}
	@BeforeClass
	public void launch()
	{
	System.out.println("launch");
	}
	
	//pre conditions
	@BeforeMethod
	public void url()
	{
	System.out.println("url");
	}
	
	//testcases start with @test
	@Test
	public void title()
	{
		System.out.println("title");	
	}
	
	//post conditions
	@AfterMethod
	public void logout()
	{
		System.out.println("logout");	
	}
	
	@AfterClass
	public void closebrowser()
	{
		System.out.println("close browser");
	}
	
	@AfterTest
	public void delete()
	{
		System.out.println("AfterTest");	
	}
	
	
	@AfterSuite
	public void generatereports()
	{
		System.out.println("reports");
	}
	
}
