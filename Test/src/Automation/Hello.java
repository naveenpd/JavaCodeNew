package Automation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello");
		String url = "http:\\service.ariba.com";
		String chromePath = "C:\\Users\\C5270459\\Desktop\\SAP Project\\Selenium\\chromedriver.exe"; 
		
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[3]/table/tbody/tr[2]/td/div/font/a")).click();
//		Thread.sleep(20);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[2]/td[1]/div/table/tbody/tr/td[1]/form/div[2]/table/tbody/tr[1]/td/div/input")).sendKeys("user@lobapjsupplier1.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("welcome1a");
		driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[2]/td[1]/div/table/tbody/tr/td[1]/form/div[2]/table/tbody/tr[3]/td/input")).click();
		String currentURL= driver.getCurrentUrl();
		System.out.println("getCurrentUrl: "+currentURL);
		String title = driver.getTitle();
		int titleLength = driver.getTitle().length();
		System.out.println("Title: "+title);
		System.out.println("Title Length :"+titleLength);
		String actualUrl= driver.getCurrentUrl();
		if(actualUrl.equals(url)) {
			System.out.println("URL Match");
		} else {
			System.out.println("URL Mismatch");
		}
		int pageSourceLength = driver.getPageSource().length();
		System.out.println("pageSourceLength :"+pageSourceLength);
		System.out.println("test Complete");
		driver.close();
		driver.quit();

	}

}


