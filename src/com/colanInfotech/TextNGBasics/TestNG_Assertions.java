package com.colanInfotech.TextNGBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Assertions
{
	  public static WebDriver driver;
	  public static String url="https://acegrades.com/";
	 
	@BeforeMethod	
	 public void setup()
	 {
   	 driver=new FirefoxDriver();
   	 driver.manage().window().maximize();
   	 driver.manage().deleteAllCookies();
   	 
   	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
   	 driver.get(url);	 
	 }
    
        @Test
        public void verifyAceTitleTest() 
        {
       	    String title=driver.getTitle();
       	    Assert.assertEquals(title,"ACEGRADES","Title is not matched");
        }
        
       
        @Test
        public void logoTest()
        {
        	boolean b=driver.findElement(By.xpath("*//img[@class='left logo' and @alt='logo']")).isDisplayed();
            Assert.assertTrue(b);
        }
	 
	 @AfterMethod
	 public void teardown()
	 {
		 driver.close();
		 
	 }


}
