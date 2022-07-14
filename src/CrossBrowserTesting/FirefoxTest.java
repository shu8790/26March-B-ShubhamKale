package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxTest {
  @Test
  public void myMethod() throws InterruptedException 
  {
	  System.setProperty("webdriver.gecko.driver", "G:\\1Sele\\geckodriver.exe");
	  WebDriver driver= new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  Thread.sleep(1000);
  }
}
