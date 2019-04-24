package Automation;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class TC_003 extends BasePage{
	
	private static final Logger log = Logger.getLogger(TC_003.class.getName());

	public static void main(String[] args) throws Exception {

		openBrowser("chromebrowser");
		log.info("Opened the Browser of type:"+loadData("chromebrowser"));
		
		navigate("amazonurl");
		log.info("Navigate to URL :"+loadData("amazonurl"));
		
//		driver.manage().window().maximize();
//		
		type("amazonsearchbox_name","textvalue");
		log.info("Entered the searched Text :"+loadData("textvalue"));
		
		click("amazonsearchbutton_xpath");
		log.info("Clicked on Amazon search button");
		
//		Date dt =new Date();
////		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
//		String dateFormat = dt.toString().replace(":", "_").replace(" ", "_");
////		String title =driver.getTitle();
////		String title2 = title.substring(0, 15).replaceFirst(" ", "-");
////		System.out.println("C:\\Users\\C5270459\\Desktop\\Screenshots\\"+title2+".jpeg");
//				
//		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
////		FileHandler.copy(srcFile,new File("C:\\Users\\C5270459\\Desktop\\"+dateFormat.format(dt)+".jpeg"));
//		FileHandler.copy(srcFile,new File("C:\\Users\\C5270459\\Desktop\\Screenshots\\"+dateFormat+".jpeg"));
//	
//		isElementPresent("amazoncustomerservice_linktext");
//		boolean val = verifyText("amazoncustomerservice_linktext","expectedvalue");
//		System.out.println(val);
		
//		String actLink = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).getText();
//		String expLink ="sony";
//		if(actLink.contains(expLink))
//			System.out.println("Both are equal");
//		else
//			System.out.println("Both are not equal");
//		
		driver.quit();

	}



	

	

}
