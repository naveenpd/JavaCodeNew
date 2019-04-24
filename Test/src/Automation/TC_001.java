package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_001 extends BasePage{

	public static void main(String[] args) throws Exception {
	
//		launch("chrome", "http://google.com");
		launch(loadData("chromebrowser"), loadData("amazonurl"));
		driver.manage().window().maximize();
		WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
		loc.sendKeys("sony");
		loc.clear();
		driver.findElement(By.name("field-keywords")).sendKeys("LG");
		driver.findElement(By.name("field-keywords")).clear();
//		driver.findElement(By.className("nav-input")).sendKeys("samsung");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("moto");
		driver.findElement(By.linkText("Customer Service")).click();
//		driver.findElement(By.partialLinkText("Customer Servi")).click();
//		List<WebElement> link = driver.findElements(By.tagName("a"));
		String val = driver.findElement(By.linkText("Customer Service")).getAttribute("href");
		System.out.println(val);
//		for( WebElement links: link) {
//			System.out.println(links.getText());
//		}
//		
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		String url = driver.getCurrentUrl();
//		
//		System.out.println(url);
//		driver.manage().deleteAllCookies();
//		
//		driver.navigate().back();
//		Thread.sleep(5000);
//		driver.navigate().forward();
//		Thread.sleep(5000);
//		driver.navigate().refresh();
//		driver.close();
//		driver.quit();

	}

	private static void findElements(By tagName) {
		// TODO Auto-generated method stub
		
	}

}
