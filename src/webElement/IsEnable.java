package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	public static void main(String[] args) throws InterruptedException 
	{
		//chrowser launched and app opened
		System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.discoveryplus.in");
		Thread.sleep(10000); //synchronisation statement

		// use is enable method
		
			driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
			Thread.sleep(10000);
		
		// checking isenable method
			
			System.out.println(driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled());
		
		// puting number in text box
			
			driver.findElement(By.id("mobileNumber")).sendKeys("9876453256");
			
		// checking is enable
			
			System.out.println( driver.findElement(By.xpath("//button[@type='submit']")).isEnabled());
		
		// creating variable of otp button
			
			WebElement otpbutton = driver.findElement(By.xpath("//button[@type='submit']"));
			
		// clicking on otp button
			
			otpbutton.click();
	}

}
