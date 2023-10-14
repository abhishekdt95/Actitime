package com.Actitime.Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Actitime.Generic.BaseTest;
import com.Actitime.Generic.ExcelData;
import com.Actitime.Page.LoginPage;

public class InvalidLoginTest extends BaseTest {
	
	
	//GetData
			ExcelData Data=new ExcelData();
			String ErrorMessage = Data.GetExcelData(Filepath, "invalid.login", 1, 2);
			int RowCount = Data.GetRowCount(Filepath, "invalid.login");
			
	@Test (priority = 2)
	public void InvalidLoginToActitime() throws InterruptedException{
		LoginPage Login=new LoginPage(driver);
		
		for(int i=1; i<=RowCount;i++) {
			String Username = Data.GetExcelData(Filepath, "invalid.login", i, 0);
			String Password = Data.GetExcelData(Filepath, "invalid.login", i, 1);
			Login.EnterUserName(Username);
			Login.EnterPassword(Password);
			Thread.sleep(4000);
			Login.ClickOnLoginBtn();
			Thread.sleep(4000);
			Login.VerifyErrorMSG(ErrorMessage);
			Reporter.log("MSG : "+ErrorMessage, true);
		}
		
	}
}
