package com.Actitime.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.Actitime.Generic.BasePage;

public class EnterTimeTrackPage extends BasePage{

	@FindBy(xpath = "//a[.='Logout']")
	private WebElement LogoutBTN;
	
	@FindBy(xpath = "//div[@class='menuTable']/div[4]//div[@class='popup_menu_container']")
	private WebElement Help$SupportIcon;
	
	@FindBy (xpath = "//a[.='About your actiTIME']")
	private WebElement AboutyouractitimeLink;
	
	@FindBy(xpath = "//span[.='actiTIME 2020 Online']")
	private WebElement productVersion;
	
	@FindBy(id = "aboutPopupCloseButtonId")
	private WebElement ProductInfoCloseBtn;
	
	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void ClickOnLogoutBtn() {
		VerifyElement(LogoutBTN);
		LogoutBTN.click();
	}
	
	public void ClickOnHelp$SupportIcon() {
		VerifyElement(Help$SupportIcon);
		Help$SupportIcon.click();
	}
	
	public void clickOnAboutyouractitime() {
		VerifyElement(AboutyouractitimeLink);
		AboutyouractitimeLink.click();
	}
	public void clickOnProductInfoCloseBtn() {
		VerifyElement(ProductInfoCloseBtn);
		ProductInfoCloseBtn.click();
	}
	
	public void VerifyproductVersion(String ExpectedproductVersion) {
		String Actual = productVersion.getText();
		String Expected = ExpectedproductVersion;
		Assert.assertEquals(Actual, Expected);
		Reporter.log("product Version is : ", true);
	}

}
