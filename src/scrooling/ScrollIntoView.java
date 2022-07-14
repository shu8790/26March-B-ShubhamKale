package scrooling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		WebElement radioButton = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		j.executeScript("arguments[0].scrollIntoView(true);",radioButton);
		Thread.sleep(1000);
		radioButton.click();
		Thread.sleep(1000);
		
		WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		j.executeScript("arguments[0].scrollIntoView(true);",textBox);
		textBox.sendKeys("Shubham");
		
	}

}
