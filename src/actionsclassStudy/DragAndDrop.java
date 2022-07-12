package actionsclassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			
			Thread.sleep(2000);
			
			WebElement source = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
			WebElement destination = driver.findElement(By.id("amt8"));
			WebElement destination1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
			
	//how to drag and drop element
		//1.create the object of the action class and pass driver object
			
			Actions act= new Actions(driver);
			
//			act.click(source).clickAndHold(source).moveToElement(destination).release(source).build().perform();
//			act.dragAndDrop(source, destination).perform();
//			act.moveToElement(source).clickAndHold().moveToElement(destination1).release().build().perform();
			act.dragAndDrop(source, destination1).perform();
			
	}

}
