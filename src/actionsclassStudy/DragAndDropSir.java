package actionsclassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropSir {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(2000);
		
		
		// find source and destination
		WebElement source = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement destination = driver.findElement(By.id("amt8"));
		//How to drag and drop using Actions class
		//create object of ACtions class and pass driver object
		Actions act= new Actions(driver);
		// by using actions class methods perform desired action
		//act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
		act.dragAndDrop(source, destination).perform();
		

	}

}
