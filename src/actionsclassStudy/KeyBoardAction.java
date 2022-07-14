package actionsclassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException 
	{
			
			System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			Thread.sleep(2000);
			
	//how to perform the keyboard action
		//1. first select listbox 
		//2. create object of the actions class
		//3. click on list box
		//4. now use send key method to use keys
			
			
			WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
			
			Actions act= new Actions(driver);
//			act.click(listbox).perform();
//			act.click(listbox).sendKeys(Keys.ARROW_DOWN).click().build().perform();
			for(int i=1;i<=3;i++)
			{
				act.click(listbox).sendKeys(Keys.ARROW_DOWN).build().perform();
			}
			act.sendKeys(Keys.ENTER).perform();
		
//how to input text into textbox using actions class
		//1. find the textbox
		//2. create object of actions class
		//3. call send key method
			
			WebElement textbox = driver.findElement(By.id("autocomplete"));
			
			act.sendKeys(textbox, "Shubham").perform();
			
			
			
			
		
	}

}
