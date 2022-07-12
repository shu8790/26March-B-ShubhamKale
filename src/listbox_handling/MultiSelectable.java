package listbox_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectable {

	public static void main(String[] args) throws InterruptedException 
	{
				System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demoqa.com/select-menu");
		
				Thread.sleep(2000);
				
		//checking whether list-box is multi-selectable
		//1. find listbox and store in refrence variable
				
				WebElement carlistbox = driver.findElement(By.id("cars"));
				
				
		//2. object of select class
				
				Select s = new Select(carlistbox);
				
		//3. perform actions using select method
			
			//a. ismutiselect
				
				System.out.println("mutiselectable status is "+ s.isMultiple());
				//this has worked absolutely fine
				
			//b. select multiple options from list-box
				
				s.selectByVisibleText("Volvo");
				s.selectByIndex(1);
				s.selectByValue("opel");
				s.selectByIndex(3);
				// this code worked fine
				
				
			//c. de-select all
				Thread.sleep(1000);
				
			 //	s.deselectAll();
				//this method is worked fine
				
			//d. deselect one by one
				
				s.deselectByIndex(3);
				s.deselectByValue("opel");
				s.deselectByVisibleText("Saab");
				//these methods also worked well
				
		
		
		
		
		
		
		

	}

}
