package com.Actitime.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.Actitime.Generic.BasePage;

public class LoginPage extends BasePage{

	//declaration
	@FindBy (name = "username")
	private WebElement UsernameTB;
	
	@FindBy (name = "pwd")
	private WebElement PasswordTB;
	
	@FindBy (xpath = "//div[.='Login ']")
	private WebElement LoginBTN;
	
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBox;
	
	@FindBy(xpath = "//span[contains(.,'invalid')]")
	private WebElement ErrorMSG;
	
	@FindBy (xpath = "//nobr[contains(.,'Online')]")
	private WebElement  actiTimeVersion;

	
	//initialization
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void EnterUserName(String UN) {
		UsernameTB.sendKeys(UN);
	}
	
	public void EnterPassword(String PWD) {
		PasswordTB.sendKeys(PWD);
	}
	
	public void ClickOnLoginBtn() {
		LoginBTN.click();
	}
	
	public void ClickonkeepLoggedInCheckBox() {
		keepLoggedInCheckBox.click();
	}
	
	public void VerifyErrorMSG(String  ExpectedErrorMessage) {
		String ActualMsg = ErrorMSG.getText();
		String ExpectedMsg = ExpectedErrorMessage;
		Assert.assertEquals(ActualMsg, ExpectedMsg);
		Reporter.log("Error msg is displayed ", true);
	}
	
	public void VerifyVersion(String expectedVersion) {
		String ActualVersion = actiTimeVersion.getText();
		String ExpectedVersion = expectedVersion;
		Assert.assertEquals(ActualVersion, ExpectedVersion);
		Reporter.log("Version is verified", true);
	}
	
}
