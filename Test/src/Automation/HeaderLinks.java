package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderLinks {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		String url= "https://www.bing.com";
		driver.manage().window().maximize();
				
		driver.get(url);
		WebElement header = driver.findElement(By.id("sc_hdu"));
		List<WebElement> list = header.findElements(By.tagName("a"));
		int listSize = list.size();
		System.out.println(listSize);
		
		for(int i=0;i<listSize; i++) {
			String links = list.get(i).getText();
			if(!links.isEmpty()) {
				System.out.println(links);
			}
		}

	}

}
