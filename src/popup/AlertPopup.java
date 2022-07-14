package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException 
	{
			
			System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/alerts");
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("alertButton")).click();
			
		// change focus from main page to alert popup
			
			Alert alt = driver.switchTo().alert();
			
			System.out.println(alt.getText()); //get text
			Thread.sleep(1000);
			alt.accept(); // click ok
			
		// click on diff option
			
			driver.findElement(By.xpath("(//button[text()='Click me'])[2]")).click();
			Thread.sleep(6000);
			
			Alert alt1 = driver.switchTo().alert();
			System.out.println(alt1.getText());
			Thread.sleep(2000);
			alt1.accept();
			
		// click on diff option
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
			
			Thread.sleep(2000);
			
			Alert alt2 = driver.switchTo().alert();
			
			System.out.println(alt2.getText());
			alt2.accept();
		
			
		// click diff option
			
			Thread.sleep(7000);
			
			driver.findElement(By.xpath("//button[@id='promtButton']")).click();
			Alert alt3 = driver.switchTo().alert();
			System.out.println(alt3.getText());
			Thread.sleep(5000);
			alt3.sendKeys("hello");
			Thread.sleep(1000);
			alt3.accept();
			
			
			
		

	}

}
