package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException 
	{
		
				System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://vctcpune.com/selenium/practice.html");
				
				Thread.sleep(2000);
				
		// use isdisplayed method in if-else statement
				
				WebElement SHTextbox = driver.findElement(By.name("show-hide"));
				
				WebElement hidebutton = driver.findElement(By.xpath("//input[@value='Hide']"));
				hidebutton.click(); //hide button clicked
				
				if(SHTextbox.isDisplayed())
				{
					System.out.println("the text box is visible");
				}
				else
				{
					System.out.println("text box is not visible");
				}
				//above code work as expected no issue
				
				
		
		
		
		
		
		

	}

}
