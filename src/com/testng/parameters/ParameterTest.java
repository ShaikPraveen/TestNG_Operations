package com.testng.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest 
{
	 static WebDriver driver;
	
	
	@Test
	@Parameters({"url","browser","username","password"})
	public void freeCRMLoginTest(String browser,String url,String username,String password)
	{
		if (browser.equals("chrome"))
		{
             System.setProperty("webdriver.chrome.driver", "E:\\Praveen_Automation\\Launching_Browsers\\Launching_Browsers_Latest\\chromedriver.exe");		
			 driver=new ChromeDriver();
			
		}else if (browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Assert.assertEquals(driver.getTitle(), "CRMPRO");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		if (driver!=null) 
		{
			driver.close();
			
		}
	}

}
