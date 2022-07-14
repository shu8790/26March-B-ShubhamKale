package setsizeandposition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			
			System.out.println(driver.manage().window().getPosition());
			
	//how to set the position of the browser
		//1)create object of the point class
			
			Point p= new Point(80, 3);
			
		//2)call the setposition method
			
			driver.manage().window().setPosition(p);
			
		

	}

}
