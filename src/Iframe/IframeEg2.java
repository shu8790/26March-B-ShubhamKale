package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/iframes/");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("Framename1");// chanding focus from main page to frame1
		String text = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
		System.out.println(text);
		
	// read pavillion
		//1. change focus from frame to mainpage
		
		driver.switchTo().parentFrame();// switch to main page
		String text1 = driver.findElement(By.linkText("Pavilion")).getText();
		System.out.println(text1);
		
	// read category3
		//1. change focus from main page to frame2
		
		driver.switchTo().frame(1);
		String text2 = driver.findElement(By.partialLinkText("Category3")).getText();
		System.out.println(text2);
		//code work right
		
	// read blogger
		//1. change focus from frae2 to mainpage
		
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		String text3 = driver.findElement(By.partialLinkText("Blogger")).getText();
		System.out.println(text3);
		
	// read category2
		
		//1. change focus from main page to frame1
		
		driver.switchTo().frame("Frame1");
		String text4 = driver.findElement(By.xpath("//a[text()='Category2']")).getText();
		System.out.println(text4);
		
		

	}

}
