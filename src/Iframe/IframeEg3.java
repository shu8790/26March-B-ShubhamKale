package Iframe;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class IframeEg3 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		Thread.sleep(2000);
		
		// iframe operation
		
		driver.switchTo().frame("a077aa5e");
		//driver.switchTo().frame(0);
	//	driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		// input email
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("serjak@gamil.com");
		
		// listbox handling
		
		WebElement listbox = driver.findElement(By.xpath("//select[@id='awf_field-91977689']"));
		
		Select s= new Select(listbox);
		
		boolean resuslt = s.isMultiple();
		
		System.out.println("multiselect status"+resuslt);
		
		s.selectByVisibleText("SAP CRM");
		
		//screenshot
		
		String no = RandomString.make(4);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File destnation= new File("G:\\1Sele\\SelScreenshots\\mysc"+no+".png");
		
		FileHandler.copy(src, destnation);
		
		
		
		
	}
	
	

}
