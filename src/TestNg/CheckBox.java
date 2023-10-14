package TestNg;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CheckBox {

	@Test
	public void checkbox() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
		driver.get("file:///C:/Users/Rakesh/Desktop/abhi/Sel/HTML/SelCheckBox.html");
		List<WebElement> allCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(allCheckbox.size());
//		for (WebElement checkboxs : allCheckbox) {
//			checkboxs.click();
//			Thread.sleep(1000);
//		}
		
		//rev order
		for (int i = allCheckbox.size()-1; i >0; i--) {
			WebElement checkboxs = allCheckbox.get(i);
			if (i%2==0) {
				checkboxs.click();
				Thread.sleep(1000);
			}
		}
		driver.close();
	}
}
