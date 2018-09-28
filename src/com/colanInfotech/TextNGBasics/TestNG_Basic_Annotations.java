package com.colanInfotech.TextNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Basic_Annotations 
{
	
  //Pre-conditions Annotations --Starting with @Before
	
	@BeforeSuite
	public void test4() //1
	{
		System.out.println("Setup Browser property");
	}
	
	@BeforeTest
	public void test3() //2
	{
		System.out.println("Launch App");
	}
	
	@BeforeClass
	public void test1() //3
	{
		System.out.println("Enter URL");
	}
	
	@BeforeMethod
	public void test2()//4
	{
		System.out.println("Maximaze Window");
	}

  //Test cases --Starting with @Test
	
	@Test
	public void test5() //5
	{
		System.out.println("Verify Page Title");
	}
	
  //Post-conditions Annotations --Starting with @After
	
	@AfterMethod
	public void test8() //6
	{
		System.out.println("Naviate to another page");
	}
	
	@AfterClass
	public void test7() //7
	{
		System.out.println("Verify Page");
	}
	
	@AfterTest
	public void test9() //8
	{
		System.out.println("Navigate Back");
	}
	
	@AfterSuite
	public void test6() //9
	{
		System.out.println("Close the Browser");
	}
}	
	
