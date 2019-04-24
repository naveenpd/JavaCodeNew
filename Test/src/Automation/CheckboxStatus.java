package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxStatus {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		String url= "http://echoecho.com/htmlforms09.htm";
		driver.manage().window().maximize();
		driver.get(url);
		List<WebElement> checkbox = driver.findElements(By.xpath("(//td[@class='table5'])[2]/input[@type='checkbox']"));
		int checkSize = checkbox.size();
		System.out.println(checkSize);
		for ( int i=0;i<checkSize;i++) {
//			if(checkbox.get(i).isSelected())
//			{
////				checkbox.get(i).click();
//				System.out.println(checkbox.get(i).getAttribute("value")+ " - "+ checkbox.get(i).getAttribute("checked"));
//			}
			
			if(!checkbox.get(i).isSelected())
			{
				checkbox.get(i).click();
				
			}
			
			System.out.println(checkbox.get(i).getAttribute("value")+ " - "+ checkbox.get(i).getAttribute("checked"));
				

		}
	}

}
