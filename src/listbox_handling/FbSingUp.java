package listbox_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSingUp {

	public static void main(String[] args) throws InterruptedException 
	{
		
				System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
		
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
				
				Thread.sleep(3000);
				
		//enter your date of birth in list-box
			
			//1. on fb signup page there 3 list-box therefore 
			//   create 3 refrence variable to store 3 list-box
			
					WebElement daybox = driver.findElement(By.xpath("//select[@id='day']"));
					
					WebElement monthbox = driver.findElement(By.name("birthday_month"));
					
					WebElement yearbox = driver.findElement(By.name("birthday_year"));
					
			//2. create object of select method, which accept 
			//   web element as object
					
					Select s  = new Select(daybox);
					
					Select s1 = new Select(monthbox);
					
					Select s2 = new Select(yearbox);
					
			//3. choose list box options using different select methods
					
					
					s.selectByValue("9"); 			// day selected
					s1.selectByIndex(9);            // month selected
					s2.selectByVisibleText("1996"); // year selected
					
					
					
					
					
					
					
					
					
					
				
				
				
		
		
		
		
		

	}

}
