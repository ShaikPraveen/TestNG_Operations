package com.colanInfotech.TextNGBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_DependsOnMethod
{
	public static WebDriver driver;
	
	   @BeforeMethod
	   public void launchAp()
	   {
		   
		    System.setProperty("webdriver.chrome.driver", "E:\\Praveen_Automation\\Launching_Browsers\\Launching_Browsers_Latest\\chromedriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			 
			 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 driver.get("https://www.acegrades.com");   
	   }
	   
	   

		   @Test()
		   public void loginTest()
		   {
			   driver.findElement(By.linkText("LOG IN")).click();
			   driver.findElement(By.id("email")).sendKeys("sample.teacher@gmail.com");
			   driver.findElement(By.id("password")).sendKeys("123456");
			   driver.findElement(By.id("loginId123")).click();
			  
			}
	
		   @Test(dependsOnMethods="loginTest")
		   public void  homepageTest()
		   {
			   driver.findElement(By.linkText("LOG IN")).click();
			   driver.findElement(By.id("email")).sendKeys("ace.ifs@acegrades.com");
			   driver.findElement(By.id("password")).sendKeys("123456");
			   driver.findElement(By.id("loginId")).click();
		   }
		 
		 
	   @AfterMethod
	   public void closeApp()
	   {
		   driver.quit();
	   }
}
