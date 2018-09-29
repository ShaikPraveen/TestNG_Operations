package com.colanInfotech.TextNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameters 
{
	public static WebDriver driver;
	
	
	@Test
	@Parameters({"browser","url","email","password"})
	public void aceloginTest(String browser,String url,String email, String password) throws InterruptedException
	{
		if (browser.equals("firefox")) 
		{
			System.setProperty("wedbriver.gecko.driver", "E:\\Praveen_Automation\\Launching_Browsers\\Launching_Browsers_Latest\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			
		}else if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Praveen_Automation\\Launching_Browsers\\Launching_Browsers_Latest\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
		}
		
		driver.get(url);
		driver.findElement(By.linkText("LOG IN")).click();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("loginId")).click();
		
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Teacher Dashboard");
		driver.close();
		
	}
}
