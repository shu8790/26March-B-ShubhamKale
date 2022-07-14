package testNGParallelAndSerialExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyClass2 {
  @Test
  public void zero()
  {
	  System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  //driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
  }
}
