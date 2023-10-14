package com.Actitime.Test;

import org.testng.annotations.Test;

import com.Actitime.Generic.BaseTest;
import com.Actitime.Generic.ExcelData;
import com.Actitime.Page.LoginPage;

public class VerifyActitimeVersion extends BaseTest {

	@Test(priority = 3)
	public void GetActitimeVersion() {
		LoginPage Login=new LoginPage(driver);
		
		//Get Data
		ExcelData Data=new ExcelData();
		String ExpectedActitimeVersion = Data.GetExcelData(Filepath, "ActitimeVersion", 1, 0);
		
		Login.VerifyVersion(ExpectedActitimeVersion);
	}
}
