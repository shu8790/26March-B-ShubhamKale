package actionsclassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fbkeyboard {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
// set your dob using actions class
	//1. locate all list box
	//2. create the object of actins class
	//3. perform actions
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		
		
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		WebElement month = driver.findElement(By.name("birthday_month"));
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		Actions act = new Actions(driver);
		for(int i=3; i>=1; i--)
		{
			act.click(day).sendKeys(Keys.ARROW_UP).build().perform();
		}
		act.sendKeys(Keys.ENTER);
		
		for(int i=1;i<=4;i++)
		{
			act.click(month).sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		act.sendKeys(Keys.ENTER);
		
		for(int i=1;i<=27;i++)
		{
			act.click(year).sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		act.sendKeys(Keys.ENTER).perform();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		
		act.click(firstname).keyDown(Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("hubham").build().perform();
		act.click(lastname).keyDown(Keys.SHIFT).sendKeys("k").keyUp(Keys.SHIFT).sendKeys("ale").build().perform();
		
		
	}

}
