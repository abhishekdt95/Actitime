package TestNg;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDowns {

	@Test
	public void HandlingTables() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
		driver.get("file:///C:/Users/Rakesh/Desktop/abhi/Sel/HTML/SLVDropdown.html");
		
		WebElement Menu = driver.findElement(By.id("slv"));
		
		Select Sel=new Select(Menu);
//		Sel.selectByIndex(0);
//		Sel.selectByValue("v");
//		Sel.selectByVisibleText("Dose");
		//Sel.deselectAll();
		
		//Get all selected options
//		List<WebElement> AllItems = Sel.getAllSelectedOptions();
//		for (WebElement Items : AllItems) {
//			String Text = Items.getText();
//			System.out.println(Text);
//		}
		
		//Get First selected options
//		WebElement First = Sel.getFirstSelectedOption();
//		System.out.println(First.getText());
		
		//Set
		TreeSet<String> Set=new TreeSet<>();
		
		//get All Options and select all
		List<WebElement> All = Sel.getOptions();
		for (WebElement AllOptions : All) {
			//AllOptions.click();
			String Text = AllOptions.getText();
			Set.add(Text);
		}
		
		for (String items : Set) {
			//System.out.println(items);
//			if (items.contains("Dose")) {
//				System.out.println("Yes");
//			}
		}
	}
}
