package TestNg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Rakesh/Desktop/abhi/Sel/HTML/SLVDropdown.html");
		WebElement Menu = driver.findElement(By.id("slv"));
		Select sel=new Select(Menu);
//		sel.selectByIndex(0);
//		sel.selectByVisibleText("Poori");
//		sel.selectByValue("d");
//		if (sel.isMultiple()) {
//			System.out.println("multi select");
//			
//		}else {
//			System.out.println("single select");
//		}
//		
//		List<WebElement> Allselected = sel.getAllSelectedOptions();
//		for (WebElement alsel : Allselected) {
//			String text = alsel.getText();
//			System.out.println(text);
//		}
		
//		//select all options
//		List<WebElement> alloptions = sel.getOptions();
//		for (WebElement options : alloptions) {
//			String text = options.getText();
//			System.out.println(text);
//			options.click();
//		}
		
//		//sort
//		ArrayList<String> List=new ArrayList<>();
//		List<WebElement> alloptions = sel.getOptions();
//		for (WebElement options : alloptions) {
//			String text = options.getText();
//			List.add(text);
//		}
//		
//		Collections.sort(List);
//		
//		for (String SortedOptions : List) {
//			System.out.println(SortedOptions);
//		}
		
		//Sorted and without duplicate
		ArrayList<String> List=new ArrayList<>();
		TreeSet<String> Set=new TreeSet<>();
		List<WebElement> AllOptions = sel.getOptions();
		for (WebElement Options : AllOptions) {
			String text = Options.getText();
			Set.add(text);
			List.add(text);
		}
		
		if (Set.size()==List.size()) {
			System.out.println("No duplicates");
		}else {
			System.out.println("duplicates");
		}

	}
	

}
