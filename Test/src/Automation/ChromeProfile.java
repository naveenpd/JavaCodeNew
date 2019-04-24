package Automation;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeProfile {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		//Clearing the logs
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "null");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		//Setting the chrome options
		ChromeOptions opt = new ChromeOptions();
		
		//Binary - not required to set the binaries, we use binary when browser is not loading
		
		//Page load Strategy-- page loading takes long time by downloading images, js, css
		
		//normal - Selenium to wait for the full page loading, default to selenium 
		//eager - Selenium to wait for the DOMContentLoaded event (html content downloaded and parsed only)
		//none - Selenium to return immediately after the initial page content is fully received
		
		opt.setPageLoadStrategy(PageLoadStrategy.NONE);
		
		//Profiling --> chrome://version
		
		opt.addArguments("user-data-dir=C:\\Users\\C5270459\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
		
		//chrome notifications
		
		opt.addArguments("--disable-notifications");
		opt.addArguments("disable-infobars");
		opt.addArguments("--start-maximized");
		
		//Proxy Servers --//chrome://version
		opt.addArguments("--proxy-server=http://192.168.90.84:1234");
		
		//List of arguments for chromeoptions
		//https://peter.sh/experiments/chromium-command-line-switches/
		

	}

}
