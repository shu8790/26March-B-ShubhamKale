package newBaseKite;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import newUtilityKite.UtilityPropScrn;


public class Base
{
	static protected WebDriver driver;
	public void openChromeBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(UtilityPropScrn.getDataFromPropFile("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
	public void openFireFoxBrowser() throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "G:\\1Sele\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(UtilityPropScrn.getDataFromPropFile("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
	}

}
