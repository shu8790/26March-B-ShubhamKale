package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	@Parameters("browserName")
	@Test
  public void myMethod(String name) throws InterruptedException 
  {
	  WebDriver driver = null;
	  	if(name.equals("chrome"))
	  	{
	  		System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromeDriver.exe");
	  		 driver= new ChromeDriver();
	  	}
	  	else if(name.equals("firefox"))
	  	{
	  		System.setProperty("webdriver.gecko.driver", "G:\\1Sele\\geckodriver.exe");
	  		driver= new FirefoxDriver();
	  	}
	  	
	  	driver.manage().window().maximize();
	  	driver.get("https://vctcpune.com/selenium/practice.html");
	  	Thread.sleep(2000);
	  	driver.close();
	  	
	  	
  }
}
