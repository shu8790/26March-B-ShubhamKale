package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickUse {

	public static void main(String[] args) throws InterruptedException 
	{
		//How to use webelement method "click"
		
		System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(3000);
		
		//find the web element
		
			driver.findElement(By.xpath("//input[@value='Radio3']")).click();
		
		

	}

}
