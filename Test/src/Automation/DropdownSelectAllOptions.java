package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectAllOptions {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		String url= "http://newtours.demoaut.com/";
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement country = driver.findElement(By.name("country"));
		Select select = new Select(country);
//		List<WebElement> options = country.findElements(By.tagName("option"));
				List<WebElement> options = select.getOptions();
		for(int i=0;i<options.size();i++) {
			options.get(i).click();
			if(options.get(i).isSelected()) {
				System.out.println(options.get(i).getText());
			}
		}


	}

}
