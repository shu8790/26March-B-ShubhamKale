package webdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	// get method is use to enter url or open the browser
		
		driver.get("https://vctcpune.com/selenium/practice.html");
	
	// close() method is use to close the current tab of 
	// browser open by the selenium tool
		
//		Thread.sleep(1000);
//		
//		driver.close();
//		

	// quit() method is use to close the all open ta of the 
	// browser by the selenium tool
		
//		driver.quit();
		
	// maximize and minimize method
		
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
		
	
		
		
		
	}

}
