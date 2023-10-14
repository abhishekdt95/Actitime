package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NestedFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
		driver.get("file:///C:/Users/Rakesh/Desktop/abhi/Sel/HTML/Frames/Nested/Page1.html");
		driver.findElement(By.id("fn")).sendKeys("abhi");
		driver.switchTo().frame("frame");
		driver.findElement(By.id("mn")).sendKeys("shek");
		driver.findElement(By.id("a")).sendKeys("28");
		driver.switchTo().frame(0);
		driver.findElement(By.id("loc")).sendKeys("bpt");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("ln")).sendKeys("DT");
	}

}
