package com.Actitime.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

abstract public class BaseTest implements AutoConstants {
	
	public WebDriver driver;
	
	static {
		System.setProperty(chrome_key, chrome_value);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	
	@BeforeMethod
	public void PreCondition() {
//		driver=new ChromeDriver();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
	}
	
	@AfterMethod
    public void PostCondition(ITestResult Res) {
		
		int Status = Res.getStatus();
		if (Status==2) {
			String Name = Res.getName();
			GenericUtils.Getscreenshot(driver, Name);
		}
		
		driver.close();
	}
}
