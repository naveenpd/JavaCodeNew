package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownCheckbox {

	public static void main(String[] args) {
		// https://www.jquery-az.com/boots/demo.php?ex=63.0_1
		
		WebDriver driver =new ChromeDriver();
		String url= "https://www.jquery-az.com/boots/demo.php?ex=63.0_1";
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.className("multiselect-native-select")).click();
		WebElement header = driver.findElement(By.xpath("//ul[@class='multiselect-container dropdown-menu']"));
		List<WebElement> checkbox = header.findElements(By.xpath("//label[@class='checkbox']"));
		for ( int i=0;i<checkbox.size();i++) {
			if(checkbox.get(i).getText().equals("HTML")) {
				checkbox.get(i).click();
				break;
			}
		}

	}

}
