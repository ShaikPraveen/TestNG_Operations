package com.colanInfotech.TextNGBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample_TestNGTest
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
         public void verifyAceLoginTest() throws InterruptedException
         {
        	 driver.findElement(By.linkText("LOG IN")).click();
        	 driver.findElement(By.id("email")).sendKeys("sample.teacher@gmail.com");
        	 driver.findElement(By.id("password")).sendKeys("123456");
        	 driver.findElement(By.xpath("//button[@id='loginId']")).click();
        	 
        	  
        	 Thread.sleep(2000);
        	 Assert.assertEquals(driver.getCurrentUrl(), "https://acegrades.com/tutor");
         }
	 
	 @AfterMethod
	 public void teardown()
	 {
		 driver.close();
		 
	 }

}
