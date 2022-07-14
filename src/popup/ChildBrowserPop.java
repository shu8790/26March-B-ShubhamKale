package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(2000);
		
		String MainpageID = driver.getWindowHandle();
		System.out.println(MainpageID);
		
		driver.findElement(By.name("NewWindow")).click();
		System.out.println("==============");
		Set<String> MultipleID= driver.getWindowHandles();
		Iterator<String> it = MultipleID.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		String mainpage = it.next();
		String childwindow = it.next();
		System.out.println("mainpage=> "+mainpage);
		System.out.println("childwindow=> "+childwindow);
		
		driver.switchTo().window(childwindow); 
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("selenium");

		driver.switchTo().window(mainpage);
		WebElement text = driver.findElement(By.xpath("(//p[contains(text(),'Click below to open link')])[2]"));
		System.out.println(text.getText());
		
	}

}
