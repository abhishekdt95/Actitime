package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimeLoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		ActitimeLoginPage Login=new ActitimeLoginPage(driver);
		Login.EnterUN("admin");
		Login.EnterPWD("manager");
		Login.ClickOnLoginBTN();

	}

}
