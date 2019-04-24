package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOptionsdisplay {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		String url= "https://www.amazon.in";
		driver.manage().window().maximize();
		driver.get(url);

		WebElement header = driver.findElement(By.id("searchDropdownBox"));
//		List<WebElement> options = header.findElements(By.tagName("option"));
		Select select = new Select(header);
		List<WebElement> options = select.getOptions();
		int listSize = options.size();
		System.out.println(listSize);
		
		for(int i=0;i<listSize;i++) {
			String values = options.get(i).getText();
			System.out.println(values);
			
		}

	}

}
