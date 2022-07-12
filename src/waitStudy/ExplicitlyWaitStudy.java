package waitStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitStudy {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		WebElement text = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofMillis(50000));
	
		wait.until(ExpectedConditions.visibilityOf(text));
		System.out.println(text.getText());
		driver.close();
		
		
	}

}
