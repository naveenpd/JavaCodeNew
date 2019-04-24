package Automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {

	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		String url= "file:///C:/Users/C5270459/Desktop/FileUpload.html";
		driver.manage().window().maximize();
		driver.get(url);
		
//		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("ResumeUpload")).click();
		Runtime.getRuntime().exec("C:\\Users\\C5270459\\Desktop\\FileUpload1.exe");
		System.out.println("Upload successfully");

	}

}
