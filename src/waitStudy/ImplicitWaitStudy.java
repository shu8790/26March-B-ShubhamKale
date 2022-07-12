package waitStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		// launch facebook
		System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		Thread.sleep(20000);
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
		
		driver.findElement(By.id("email")).sendKeys("shk@gmail.com");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		

	}

}
