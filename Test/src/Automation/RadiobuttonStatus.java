package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonStatus {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		String url= "http://echoecho.com/htmlforms10.htm";
		driver.manage().window().maximize();
		driver.get(url);
		for (int k=1;k<3;k++) {
			WebElement header = driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		List<WebElement> radiobutton = header.findElements(By.name("group"+k));
		int checkSize = radiobutton.size();
		System.out.println(checkSize);
			for ( int i=0;i<checkSize;i++) {
//				String value = radiobutton.get(i).getAttribute("value");
	//			if(value.equals("Milk"))
	//			{
	//				radiobutton.get(i).click();
	//				System.out.println(radiobutton.get(i).getAttribute("value")+ " - "+ radiobutton.get(i).getAttribute("checked"));
	//			}
				
//				if(radiobutton.get(i).isSelected())
//				{
					radiobutton.get(i).click();
//				System.out.println(radiobutton.get(i).getAttribute("value")+ " - "+ radiobutton.get(i).getAttribute("checked"));
				for (int j=0;j<checkSize;j++){
					System.out.println(radiobutton.get(j).getAttribute("value")+ " - "+ radiobutton.get(j).getAttribute("checked"));
				}
			{
//				}
				
//				System.out.println(radiobutton.get(i).getAttribute("value")+ " - "+ radiobutton.get(i).getAttribute("checked"));
					
			}
		}

	}
	}
}


