package com.Actitime.Test;


import org.testng.annotations.Test;

import com.Actitime.Generic.BaseTest;
import com.Actitime.Generic.ExcelData;
import com.Actitime.Page.EnterTimeTrackPage;
import com.Actitime.Page.LoginPage;

public class VerifyProductVersion extends BaseTest{

	@Test(priority = 4)
	public void GetproductVersion() throws InterruptedException {
		LoginPage Login=new LoginPage(driver);
		EnterTimeTrackPage EnteTimeTrack=new EnterTimeTrackPage(driver);
		
		//Getvalues from Excel
		ExcelData Data=new ExcelData();
		String LoginPageTitle = Data.GetExcelData(Filepath, "valid.logiin", 1, 2);
		String Username = Data.GetExcelData(Filepath, "valid.logiin", 1, 0);
		String Password = Data.GetExcelData(Filepath, "valid.logiin", 1, 1);
		String EnteTimeTrackPageTitle = Data.GetExcelData(Filepath, "valid.logiin", 2, 2);
		String ExpectedproductVersion = Data.GetExcelData(Filepath, "productVersion", 1, 0);
		
		Login.VerifyTitle(LoginPageTitle);
		Login.EnterUserName(Username);
		Login.EnterPassword(Password);
		Login.ClickOnLoginBtn();
		Thread.sleep(8000);
		EnteTimeTrack.VerifyTitle(EnteTimeTrackPageTitle);
		EnteTimeTrack.ClickOnHelp$SupportIcon();
		EnteTimeTrack.clickOnAboutyouractitime();
		EnteTimeTrack.VerifyproductVersion(ExpectedproductVersion);
		EnteTimeTrack.clickOnProductInfoCloseBtn();
		Thread.sleep(4000);
		EnteTimeTrack.ClickOnLogoutBtn();
	}
}
