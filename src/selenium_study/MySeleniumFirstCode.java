package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySeleniumFirstCode {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		// identify the elements
		
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();

		driver.findElement(By.xpath("//input[@value='Radio3']")).click();
		
		driver.findElement(By.xpath("//input[@value='Radio2']")).click();
		
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hi shubham");
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		
		//driver.findElement(By.xpath("//select[@name='dropdown-class-example']")).click();
		driver.findElement(By.xpath("//option[@value='option1']")).click();
		

	}

}
