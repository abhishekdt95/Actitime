package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.justinmind.com/blog/drop-down-menu-examples/");
		Actions act=new Actions(driver);
		WebElement Product = driver.findElement(By.xpath("//span[.='Product ']"));
		act.moveToElement(Product).perform();
		driver.findElement(By.xpath("//div[.='UX Design']")).click();
	}

}
