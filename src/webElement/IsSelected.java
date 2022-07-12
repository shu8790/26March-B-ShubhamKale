package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);
		
	//checking "isselected method"
		
		driver.findElement(By.xpath("//input[@value='Radio2']")).isSelected();
	   //printing result	
		System.out.println(driver.findElement(By.xpath("//input[@value='Radio2']")).isSelected());
	
	//"creating variable" of radio2
		
		WebElement radio2 = driver.findElement(By.xpath("//input[@value='Radio2']"));

	// "clicking" radio2 button
		
		radio2.click();
		
	// again checking radio2 button by "isselected method"
	
		radio2.isSelected();
		System.out.println(radio2.isSelected());
	
	
	}

}
