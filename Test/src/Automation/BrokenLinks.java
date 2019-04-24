package Automation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		String appUrl= "http://newtours.demoaut.com/";
		driver.manage().window().maximize();
		driver.get(appUrl);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linksSize = links.size();
		System.out.println(linksSize);
		
		for (int i=0;i<linksSize;i++) {
			
			String url = links.get(i).getAttribute("href");
			System.out.println(url);
			verifylinkActive(url);
		}
		
		

	}

	public static void verifylinkActive(String linkUrl) throws IOException {
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
			httpURLConnect.setConnectTimeout(3000);
			httpURLConnect.connect();
			if(httpURLConnect.getResponseCode()==200) {
				System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
			}
			if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
