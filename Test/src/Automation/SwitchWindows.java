package Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		String url= "https://www.hdfcbank.com/";
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		//bootstrap notification
		try {
			if (driver.findElement(By.xpath("//img[@class='popupCloseButton']")).isDisplayed()) {
				driver.findElement(By.xpath("//img[@class='popupCloseButton']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
			}
		} catch( Exception e) {
			System.out.println("Pop up not displayed");
		}
		
		String homeWindow = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("loginsubmit")).click();
		
		Set<String> childWindows =  driver.getWindowHandles();
		System.out.println("No of Child :"+childWindows.size());
		Iterator<String> it = childWindows.iterator();
		while(it.hasNext()) {
			String currentWindow = it.next();
			System.out.println("Windows are .."+currentWindow);
			if(!currentWindow.equals(homeWindow)) {
				driver.switchTo().window(currentWindow);
				System.out.println(driver.getTitle());
			}
		}
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[contains(text(),'Continue to NetBanking')])[2]")).click();
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(homeWindow);
		System.out.println(driver.getTitle());

	}

}
