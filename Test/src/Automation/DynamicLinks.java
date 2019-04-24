package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicLinks {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver =new ChromeDriver();
		String url= "https://www.bbc.com";
		driver.manage().window().maximize();
				
		driver.get(url);
		WebElement header = driver.findElement(By.xpath("//div[@class='most-popular']//ul[@class='top-list__list']"));
		List<WebElement> list = header.findElements(By.tagName("a"));
		int listSize = list.size();
		System.out.println(listSize);
		
		for(int i=0;i<listSize; i++) {

			String links = list.get(i).getText();
		
			System.out.println(links);
				list.get(i).click();

				System.out.println("Title :"+driver.getTitle());
				driver.navigate().back();
				Thread.sleep(5000);
			header = driver.findElement(By.xpath("//div[@class='most-popular']//ul[@class='top-list__list']"));
			list = header.findElements(By.tagName("a"));
			
		}

	}

}
