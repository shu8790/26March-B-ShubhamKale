package testNGParallelAndSerialExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyClass1 {
  @Test
  public void fb() 
  {
	  System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  //driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  
  }
}
