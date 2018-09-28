package com.colanInfotech.TextNGBasics;

import org.testng.annotations.Test;

public class TestNG_Priorities
{
	
	  @Test(priority=1)
	  public void sample1()
	  {
		  System.out.println("This sample method1");
	  }
	  
	  @Test(priority=3)
	  public void sample2()
	  {
		  System.out.println("This sample method2");
	  }
	  
	  @Test(priority=2)
	  public void sample3()
	  {
		  System.out.println("This sample method3");
	  }
	  
	  @Test(priority=5)
	  public void sample4()
	  {
		  System.out.println("This sample method4");
	  }
	  
	  @Test(priority=4)
	  public void sample5()
	  {
		  System.out.println("This sample method5");
	  }
	

}
