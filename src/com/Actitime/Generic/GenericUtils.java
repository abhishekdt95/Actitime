package com.Actitime.Generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils {
	
	//takeScreenShot
	public static void Getscreenshot(WebDriver driver, String Name) {
		TakesScreenshot Screenshot= (TakesScreenshot) driver;
		File Src= Screenshot.getScreenshotAs(OutputType.FILE);
		File Dest = new File("./screenshot/"+Name+".png");
		try {
			FileUtils.copyFile(Src, Dest);
		} catch (IOException e) {
		}
	}
	
	//All methods of Select class
	public static void SelectbyIndex(WebElement Element, int Index ) {
		Select Sel=new Select(Element);
		Sel.selectByIndex(Index);
	}
	
	public static void SelectbyValue(WebElement Element, int Index, String Value) {
		Select Sel=new Select(Element);
		Sel.selectByValue(Value);
	}
	
	public static void SelectbyText(WebElement Element, int Index, String Value, String Text) {
		Select Sel=new Select(Element);
		Sel.selectByVisibleText(Text);
	}
	
	public static void GetAllSelectedOption(WebElement Element, int Index, String Value) {
		Select Sel=new Select(Element);
		Sel.getAllSelectedOptions();
	}

}
