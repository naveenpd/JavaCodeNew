package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		String url= "http://demo.guru99.com/selenium/delete_customer.php";
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		String expectedVal = "Do you really want to delete this Customer?";
		if(expectedVal.equals(al.getText())) {
			System.out.println("Matching");
		}else {
			System.out.println("Not Matching");
			
		}
		Thread.sleep(5000);
		al.accept();
		Thread.sleep(5000);
		System.out.println(al.getText());
		al.accept();

	}

}
