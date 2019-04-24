package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesEdit {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		String url= "http://jqueryui.com/autocomplete/";
		driver.manage().window().maximize();
		driver.get(url);
//		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.xpath("//input[@class='ui-autocomplete-input']")).sendKeys("hello");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Sortable")).click();

	}

}
