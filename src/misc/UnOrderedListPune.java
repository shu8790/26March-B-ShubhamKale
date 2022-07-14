package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderedListPune {

	public static void main(String[] args) throws InterruptedException {
		//1.search pune university
		//2. store results
		//display it 
		//click on pune university
		//click images
		//store the images present 
		//return size
		
		System.setProperty("webdriver.chrome.driver", "G:\\\\1Sele\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		//enter search
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Pune university");
		Thread.sleep(5000);
		
		List<WebElement> results = driver.findElements(By.xpath("(//ul[@role='listbox'])[2]//li"));
		System.out.println( results.size());
		
		for(  WebElement v:results)//printing the list
		{
			System.out.println(v.getText());
		}
		
		for(WebElement r:results)// clicking pune uni
		{
			String actualtext = r.getText();
			String expectedtext= "Savitribai Phule Pune University";
			
			if(actualtext.equals(expectedtext))
			{
				r.click();
				
				break;
				
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(2000);
		List<WebElement> images = driver.findElements(By.tagName("img"));
			System.out.println( images.size());

	}

}
