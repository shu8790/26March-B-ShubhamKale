package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablehandlingipl {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.iplt20.com/stats/2022");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text()='Accept cookies']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		int totalrows = rows.size();
		System.out.println("total no. rows are "+totalrows);
		
		List<WebElement> columns = driver.findElements(By.xpath("//table//tr[1]"));
		int columnno = columns.size();
		System.out.println("no of columns in table are "+columnno);
		for(WebElement v:columns)
		{
			System.out.print(v.getText()+" ");
		}

	}

}
