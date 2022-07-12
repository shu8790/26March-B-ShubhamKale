package misc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderedList {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(2000);
		
		List<WebElement> result = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		System.out.println(result.size());
		
		for(WebElement v:result)
		{
			System.out.println(v.getText());
		}
		
		for(WebElement r:result)
		{
				String actualresult = r.getText();
				String expectedresult= "honda amaze";
				if(actualresult.equals(expectedresult))
				{
					r.click();
					break;
				}
		}
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Images")).click();
		

	}

}
