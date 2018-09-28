package com.colanInfotech.TextNGBasics;

import org.testng.annotations.Test;

public class TestNG_Groups
{ 
	@Test(groups="Login")
	 public void loginApp()
	   {
		   System.out.println("Lauch Application");
	   }
	  
	 @Test(groups="Login")
	  public void login()
	  {
		  System.out.println("Login Application");
	  }
	
	  
	  @Test(groups="enterURL") 
	   public void enterurl()
	   {
		   System.out.println("Enter URL");
	   }

	   @Test(groups="VerifyTitle")
	   public void verfifyTitle()
	   {
		   System.out.println("Verify Page Title");
	   }
	   
	   @Test(groups="Logout")
	   public void logout()
	   {
		   System.out.println("Logout Application");
	   }
	   
	   
	    
}


