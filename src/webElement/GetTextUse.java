package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextUse {

	public static void main(String[] args) throws InterruptedException 
	{
		//gettext method is used to get the selecte text and
		// see it into the console window
	
		//how to use get text method
		
		//browser and application launch
			System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		
			driver.get("https://vctcpune.com/selenium/practice.html");
			Thread.sleep(5000);
			
			
		
		// actual steps to use gettext method
		
		//1. to simply see the get text
			
				System.out.println(driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText());
		
		//2. you can store the text method in one refrence 
		//	variable and can use it mutiple time
			
				String text = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
				System.out.println(text);
			
		//3. you can store the webelement into the variable 
		//		and perform gettext method on it
				
				WebElement element = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
				element.getText();
				System.out.println(element.getText());
				
			

	}

}
