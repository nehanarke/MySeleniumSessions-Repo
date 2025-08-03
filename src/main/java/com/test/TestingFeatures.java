package com.test;

import org.testng.annotations.Test;

public class TestingFeatures 
{
	@Test
	public void login()
	{
	System.out.println("login");	
//	int i=9/0;
	}
	@Test(dependsOnMethods="login")
	public void homepage()
	{
		System.out.println("homepage");		
	}
	@Test
	public void logout()
	{
		System.out.println("logout");		
	}

}
