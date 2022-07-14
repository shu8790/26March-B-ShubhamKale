package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedNew {

	public static void main(String[] args) throws InterruptedException 
	{
		
				System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://vctcpune.com/selenium/practice.html");
		
				Thread.sleep(2000);
		
		//perform is select method using if-else statement
				
				WebElement radio2button = driver.findElement(By.xpath("//input[@value='Radio2']"));
				
				radio2button.click();
				
				if(radio2button.isSelected())
				{
					System.out.println("you have already selected the radio2 button");
					
				}
				else
				{
					System.out.println("please select the radio2 button");
				}
				
				
				
				
				
				
				
				
		

	}

}
