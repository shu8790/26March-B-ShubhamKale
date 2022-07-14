package actionsclassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEg1 {

	public static void main(String[] args) throws InterruptedException
	{
		
			System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			
			Thread.sleep(2000);
			
		//1)how to click on the selenium button
			
			WebElement seleniumbutton = driver.findElement(By.linkText("Selenium"));
			
		//create object of actions class
			
			Actions act= new Actions(driver);
		//	act.moveToElement(seleniumbutton).click().build().perform();
		//	act.click(seleniumbutton).perform();
			
	//2)how to right click
			
			WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
//			act.moveToElement(rightclickbutton).contextClick().build().perform();
			
		//navigate through right click button
//			for(int i=1;i<=6;i++)
//			{	
//				act.sendKeys(Keys.ARROW_DOWN).perform();
//			}
//			WebElement quit = driver.findElement(By.xpath("//span[text()='Quit']"));
//			act.click(quit).perform();

	//3)how to double clicked
			
			WebElement doubleclickbutton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			act.moveToElement(doubleclickbutton).doubleClick().build().perform();
			
			
			
	}

}
