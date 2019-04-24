package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		String url= "https://www.google.co.in";
				
		driver.get(url);
		List<WebElement> list = driver.findElements(By.tagName("a"));
		int listSize = list.size();
		
		for(int i=0;i<listSize; i++) {
			String links = list.get(i).getText();
			if(!links.isEmpty()) {
				System.out.println(links);
			}
		}

	}

}
