package com.colanInfotech.TextNGBasics;

import org.testng.annotations.Test;

public class TestNG_InvocationCount 
{
	@Test(invocationCount=5)
	public void add()
	{
		int a=20;
		int b=30;
		int c=a+b;
		
		System.out.println("The sum of two numbers are "+ c);	
	}

}
