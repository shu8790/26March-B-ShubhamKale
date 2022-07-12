package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class sel2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.findElement(By.xpath("//input[@value='Radio4']")).click();
		
	}

}
