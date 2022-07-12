package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeEg5 {

	public static void main(String[] args) throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
			
			Thread.sleep(2000);
			
	// frame1 action frame1 topic
		//1. change focus
			
			//driver.switchTo().frame("frame1");
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//input)[1]")).sendKeys("Shubham");
			
			driver.switchTo().parentFrame();
			String text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
			System.out.println(text);
			
	// select checkbox from frame 3
			
			driver.switchTo().frame("frame1");
			driver.switchTo().frame("frame3");
		//	driver.switchTo().frame(3);
			driver.findElement(By.xpath("//input[@id='a']")).click();
			
	// get text topic
			
			driver.switchTo().parentFrame();
			driver.switchTo().parentFrame();
			String text1 = driver.findElement(By.xpath("//h1[contains(text(),'Frames Examples ')]")).getText();
			System.out.println(text1);
			
	// get text Inner Frame Check box :
			
			driver.switchTo().frame("frame1");
			driver.switchTo().frame("frame3");
			String text2 = driver.findElement(By.xpath("//b[contains(text(),'Inner Frame Check box :')]")).getText();
			System.out.println(text2);
		
	// get text topic
			
			driver.switchTo().defaultContent();
			String text3 = driver.findElement(By.xpath("//label[contains(text(),'Topic : ')]")).getText();
			System.out.println(text3);
			
	// listbox in frame 2
			
			driver.switchTo().frame("frame2");
			
			WebElement listbox = driver.findElement(By.id("animals"));
			Select s= new Select(listbox);
			Thread.sleep(1000);
			s.selectByIndex(1);
			boolean status = s.isMultiple();
			System.out.println("multiple status of listbox="+status);
			
			
			
			
		
			
		
		

	}

}
