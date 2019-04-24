package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramesMultiple {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		String url= "https://seleniumhq.github.io/selenium/docs/api/java/";
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
		driver.findElement(By.linkText("CommandProcessor")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.name("classFrame")));
		driver.findElement(By.linkText("HttpCommandProcessor")).click();

	}

}
