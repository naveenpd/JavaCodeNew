package Automation;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigateTo {

	public static void main(String[] args) throws InterruptedException {
//		String chromePath = "C:\\Users\\C5270459\\Desktop\\SAP Project\\Selenium\\chromedriver.exe"; 
//		System.setProperty("WebDriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		String url = "http://demo.guru99.com/test/delete_customer.php";
		String url = "http://demo.automationtesting.in/Windows.html";
		driver.get(url);
//		WebElement ele = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[6]/td/table/tbody/tr/td[2]/font/a"));
//		String text = ele.getAttribute("href");
//		System.out.println(text);
//		String tName =driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a")).getTagName();
////		System.out.println(tName);
//		Point color =driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]")).getLocation();
//		System.out.println("Height :"+ color.x+" "+ "Width :"+ color.y);
//		String hex = Color.fromString(color).asRgb();
//		System.out.println(hex);
		/*driver.findElement(By.name("userName")).sendKeys("Naveen");
//		driver.findElement(By.name("password")).sendKeys("welcome");
//		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("mercury");
		boolean display = driver.findElement(By.xpath("//*[@name='login']")).isDisplayed();
		System.out.println("Display :"+display);
		boolean enable = driver.findElement(By.xpath("//*[@name='login']")).isEnabled();
		System.out.println("Display :"+enable);
		driver.findElement(By.xpath("//*[@name='login']")).submit();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		boolean selected = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).isSelected();
		System.out.println("selected :"+selected);
		String newText = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font")).getText();
		System.out.println(newText);
		System.out.println("Test Complete");
		*/
		
//		driver.findElement(By.name("firstname")).sendKeys("naveen");
//		driver.findElement(By.id("sex-0")).click();
//		driver.findElement(By.partialLinkText("Partial")).click();
//		int sClass = driver.findElements(By.className("control-group")).size();
//		 System.out.println(sClass);
//		List<WebElement> list = driver.findElements(By.name("profession"));
//		int list2 = driver.findElements(By.name("profession")).size();
//		int listSize = list.size();
//		boolean isSel2 = list.get(0).isSelected();
//		for (int i =0;i<listSize;i++) {
//			boolean isSel = driver.findElement(By.id("profession-"+i)).isSelected();
//			driver.findElement(By.cssSelector("id#profession-0"));
//			String val = list.get(i).getAttribute("value");
//			if (isSel==false) {
//			if(val.equals("Manual Tester")) {
//				list.get(i).click();
//			}}
//		WebElement eleSelect = driver.findElement(By.id("selenium_commands"));
//		
//		Select oselect = new Select(eleSelect);
//		List<WebElement> list =  driver.findElements(By.id("selenium_commands"));
////		System.out.println(list.size());
//		for( int i=0;i<list.size();i++) {
//			String text = list.get(i).getText();
//			System.out.println(text);
//		}
//		boolean isMul = oselect.isMultiple();
//		System.out.println(isMul);
//		oselect.selectByVisibleText("Browser Commands");
//		oselect.selectByVisibleText("Navigation Commands");
//		oselect.selectByVisibleText("Switch Commands");
//		oselect.selectByVisibleText("Wait Commands");
//		oselect.deselectByVisibleText("Browser Commands");
//		oselect.deselectByVisibleText("Navigation Commands");
//		System.out.println("Test Complete");
		
	//*[@id='content']/table/tbody/tr[1]/td[2]
		
//		WebElement text = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[2]/th"));
//		String textValue = text.getText();
//		System.out.println(textValue);
//		int rows = driver.findElements(By.tagName("tr")).size();
//		System.out.println(rows);
////		int cols = driver.findElements(By.tagName("td")).size();
////		System.out.println(cols);
//		for ( int i =1;i<rows;i++) {
////			String text1 = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr["+i+"]/th")).getText();
//			String text2 = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr["+i+"]/td[4]")).getText();
//			if (text2.equals("2004")) {
////				for ( int j=1;j<cols;j++) {
////					String text2 = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
//					System.out.println(text2);
////					if( text2.equals("details")) {
//						break;
//					}
//				}
////				break;
//			}
//		}
//		WebDriverWait wait = new WebDriverWait(driver, 60);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@value,'Female')]")));
//		Thread.sleep(10);
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
//WebElement newWait = driver.findElement(By.xpath("//*[contains(@value,'Female')]"));
//		Wait wait2 = new FluentWait(driver);
//
//		
//		driver.findElement(By.xpath("//*[contains(@value,'Female')]")).click();
//		System.out.println("Click1");
////		driver.findElement(By.xpath("//*[contains(text(),'Manual')]")).click();
////		System.out.println("Click2");
//		driver.findElement(By.xpath("//*[text()='Manual')]")).click();
//		System.out.println("Click3");
////		driver.findElement(By.xpath("//*[start-with(@value,'Mal')]")).click();
////		System.out.println("Click4");
//		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("1234");
//		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
//		System.out.println("Clicked");
//		String text = driver.switchTo().alert().getText();
//		System.out.println(text);
//		driver.switchTo().alert().dismiss();
		
//		 driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		 
         // Store and Print the name of the First window on the console
		
//		String mainWindow = driver.getWindowHandle();
// 
//		System.out.println(driver.getTitle());
//		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
//		Thread.sleep(5000);
//				
//		Set<String> childWindow = driver.getWindowHandles();
//		
//		for( String childWindows: childWindow ) {
//			if(!mainWindow.equals(childWindows)) {
//			driver.switchTo().window(childWindows);
//			Thread.sleep(10000);
//			System.out.println("Child window title :"+driver.getTitle());
//			}
//		}
//		driver.switchTo().window(mainWindow);
////		childWindow.remove(childWindow);
//		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
//		Thread.sleep(10000);
////		String secChildWindow = driver.getWindowHandle();
//		Set<String> childWindow1 = driver.getWindowHandles();
//		for( String childWindows2: childWindow1 ) {
//			if(!mainWindow.equals(childWindows2)) {
//			driver.switchTo().window(childWindows2);
//			Thread.sleep(10000);
//			System.out.println("Child2 window title :"+driver.getTitle());
//			driver.close();
//			}
//		}
		
//		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/i")).click();
//		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[3]/a")).click();
//		WebElement ele = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
//		driver.switchTo().frame(ele)
		System.out.println("Test Complete");

		
			
		}
		
	
		

	}


