package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class encap2  {

	@FindBy(name="username")
	private WebElement UsernameTB;
	
	@FindBy(name="pwd")
	private WebElement PasswordTB;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement LoginBTN;
	
	//initialization
	public encap2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utili
	public void EnterUN(String UN) {
		UsernameTB.sendKeys(UN);
	}
	
	public void EnterPWD(String PWD) {
		PasswordTB.sendKeys(PWD);
	}
	
	public void ClickOnLoginBTN() {
		LoginBTN.click();
	}
}
