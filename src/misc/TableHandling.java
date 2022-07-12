package misc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) throws InterruptedException 
	{
			
			System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			Thread.sleep(2000);
			
		//find no rows in table
			List<WebElement> tablerows = driver.findElements(By.xpath("//table//tr"));
			int countofrows = tablerows.size();
			System.out.println("no of rows in table are "+countofrows);
			
		//find no of columns in table
			
			List<WebElement> columns = driver.findElements(By.xpath("//table//tr[1]//th"));
			int noofcolumns = columns.size();
			System.out.println("no. of columns in tables are "+noofcolumns);
		
		// how to read header
			
			Iterator<WebElement> it = columns.iterator();
			while(it.hasNext())
			{
			   System.out.print(it.next().getText()+" ");
			}
			
		// read all rows
			
			List<WebElement> allrowsdata = driver.findElements(By.xpath("//table//tr"));
			Iterator<WebElement> it1 = allrowsdata.iterator();
			while(it1.hasNext())
			{
				System.out.print(it1.next().getText());
				System.out.println();
			}
			
		

	}

}
