package Automation;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UserProfileBrowserLaunch {

	public static void main(String[] args) {
//		WebDriver driver =new ChromeDriver();
		String appUrl= "http://newtours.demoaut.com/";
//		driver.manage().window().maximize();
		
		ChromeOptions opt = new ChromeOptions();
		opt.setPageLoadStrategy(PageLoadStrategy.NONE);
//		opt.addArguments("user-data-dir=C:\\Users\\C5270459\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 2");
		opt.addArguments("--start-maximized");
		opt.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(opt);
		driver.get(appUrl);

	}

}
