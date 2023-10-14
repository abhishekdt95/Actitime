package TestNg;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Table {

	@Test
	public void HandlingTables() throws InterruptedException, IOException {
		int sum=0, count=0;
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
		driver.get("file:///C:/Users/Rakesh/Desktop/abhi/Sel/HTML/HandlingTable.html");
		
		//takes Screen shot
		TakesScreenshot Screenshot=(TakesScreenshot) driver;
		File src = Screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/tab.png");
		FileUtils.copyFile(src, dest);
		//WAS to print only numbers present in the table
		List<WebElement> allText = driver.findElements(By.tagName("td"));
		System.out.println(allText.size());
		for (WebElement Data : allText) {
			String text = Data.getText();
			try {
				int n=Integer.parseInt(text);
				System.out.println(n);
				sum=sum+n;
				count++;
			} catch (Exception e) {
				
			}
		}
		System.out.println("S"+sum);
		System.out.println("C"+count);
	}
}
