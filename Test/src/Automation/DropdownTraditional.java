package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTraditional {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		String url= "https://www.amazon.in";
		driver.manage().window().maximize();
		driver.get(url);
//		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Porter");
//		driver.findElement(By.className("nav-input")).click();
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Porter");
		driver.findElement(By.className("nav-input")).click();		

	}

}
