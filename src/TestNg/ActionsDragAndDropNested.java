package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDragAndDropNested {

	@Test
	public void HandlingTables() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
		driver.get("https://jqueryui.com/droppable/");
		
		//Switch to nested window
		driver.switchTo().frame(0);
		WebElement Src = driver.findElement(By.id("draggable"));
		WebElement Dest = driver.findElement(By.id("droppable"));
		
		Actions Act=new Actions(driver);
		Act.dragAndDrop(Src, Dest).perform();
	//	Act.clickAndHold(Src).moveToElement(Dest).release().perform();
		
	}
}
