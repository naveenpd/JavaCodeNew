package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
	
		WebDriver driver =new ChromeDriver();
		String url= "http://www.angelfire.com/super/badwebs/";
		driver.manage().window().maximize();
		driver.get(url);
//		driver.switchTo().frame(1);
		List<WebElement> frame1 = driver.findElements(By.tagName("frame"));
		System.out.println(frame1.size());
		for(int i=0;i<frame1.size();i++) {
			System.out.println("Frame Index :"+i);
			try {
			driver.switchTo().frame(i);
			driver.findElement(By.xpath("//p[5]//font[1]")).click();
//			driver.getTitle();
			break;
			} catch( Exception e) {
//				e.printStackTrace();
				System.out.println("Element not present for index :"+i);
			}
			driver.switchTo().defaultContent();
		}
		
		
		

	}

}
