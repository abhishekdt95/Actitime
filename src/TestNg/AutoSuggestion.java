package TestNg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AutoSuggestion {

	@Test
	public void autosugg() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		List<WebElement> AllSuggestions = driver.findElements(By.xpath("//span[contains(.,'selenium')]"));
		System.out.println(AllSuggestions.size());
		for (WebElement Suggestions : AllSuggestions) {
			String Text = Suggestions.getText();
			if (Text.contains("selenium webdriver")) {
				Suggestions.click();
				break;
			}
//			System.out.println(Text);
		}
		
	}
}