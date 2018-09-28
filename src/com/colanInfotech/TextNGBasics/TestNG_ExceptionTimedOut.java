package com.colanInfotech.TextNGBasics;

import org.testng.annotations.Test;

public class TestNG_ExceptionTimedOut 
{
	/*@Test(invocationTimeOut=2)
	public void infiniteLoopTest()
	{
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
	}*/
	
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1(){
		
		String a="10A";
		Integer.parseInt(a);
	}

}
