package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
  @Test
  public void urlLaunch() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  Reporter.log("method is running as expected", true);
	  Thread.sleep(1000);
	  
  }
 
  @Test 
  public void zerodhaLaunch()
  {
	  System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  Reporter.log("method is running as expected", true);
	  
  }
  
}
