package TestNg;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {

	@DataProvider
	public Object[][] Getdata(){
		Object[][] Data =new Object[2][2];
		Data[0][0]="userA";
		Data[0][1]="123";
		Data[1][0]="userB";
		Data[1][1]="9976";
		return Data;
		
	}
	@Test(dataProvider = "Getdata")
	public void createuser(Object UN, Object PWD) {
		Reporter.log(UN+" "+PWD, true);
	}
}
