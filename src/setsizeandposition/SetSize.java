package setsizeandposition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
//			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			
			System.out.println(driver.manage().window().getSize());
			
	//how to change the size of browser
		//1) create the object of dimension class
			
			Dimension d= new Dimension(1250, 200);
			
		//2) call setsize method
			
			driver.manage().window().setSize(d);
		

	}

}
