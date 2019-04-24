package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownLinks {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		String url= "https://www.bbc.com";
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.linkText("More")).click();
		WebElement header = driver.findElement(By.xpath("//div[@class='orb-panel-content b-g-p b-r orb-nav-sec']//ul"));
		List<WebElement> links = header.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++) {
			String linkName = links.get(i).getAttribute("innerHTML");
			System.out.println(linkName);
			if(linkName.equals("Radio")) {
				links.get(i).click();
				break;
			}
		}


	}

}
