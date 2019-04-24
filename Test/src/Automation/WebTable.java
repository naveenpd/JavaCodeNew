package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url = "https://www.w3schools.com/html/html_tables.asp";
		driver.get(url);
		
		//table
		
		WebElement table = driver.findElement(By.id("customers"));

		
		//Row Count
		
		List<WebElement> table_Rows = table.findElements(By.tagName("tr"));// Rows
		int row_Count = table_Rows.size();
		System.out.println("Row Count :"+row_Count);
		int row_Num=1;
		for (WebElement table_row:table_Rows) {
//			List<WebElement> table_Cells = table_row.findElements(By.tagName("th")); // capture column names
			List<WebElement> table_Cells = table_row.findElements(By.tagName("td")); // capture cell data
			int col_Num=1;
			for (WebElement table_Cell: table_Cells) {
				System.out.println("RowNo :"+row_Num+"ColNo :"+col_Num+" "+table_Cell.getText());
				col_Num++;
			}
			row_Num++;
		}
		

	}

}
