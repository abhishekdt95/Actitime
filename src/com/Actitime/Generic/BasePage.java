package com.Actitime.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class BasePage {

	public WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}
	//Verify Title
	public void VerifyTitle(String ExpectedTitle ) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		try {
			wait.until(ExpectedConditions.titleIs(ExpectedTitle));
			Reporter.log("Title is verified and matching with Expected title"+ExpectedTitle, true);
		} catch (Exception e) {
			Reporter.log("Title is verified and is not matching with Expected title"+ExpectedTitle, true);
			Assert.fail();
		}
	}
	
	//verify Element
	public void VerifyElement(WebElement Element) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		try {
			wait.until(ExpectedConditions.visibilityOf(Element));
			Reporter.log("Element is Present", true);
		} catch (Exception e) {
			Reporter.log("Element is not Present", true);
			Assert.fail();
		}
	}
	
	//verify Login Error Msg
	public void VerifyErrorMsg(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
