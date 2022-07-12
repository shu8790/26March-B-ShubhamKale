package listbox_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException 
	{
		
				System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://vctcpune.com/selenium/practice.html");
				
				Thread.sleep(2000);
				
		// How to handle list box?
				
		//1. identify the text box and store it into refrence
		//	 variable
				
				WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
				
				
		//2. create object of 'select' method,which accept webelement as argument
		
				Select s= new Select(listbox);
				
		//3. use select class method to choose options from listbox
			
				s.selectByVisibleText("Option1"); //here matching don't matter because using this method 
												  //list-box only
				s.selectByValue("option3");
				
				s.selectByIndex(2);
				
				//above code is working absolutely fine
			 
				
				
		
		
		
		

	}

}
