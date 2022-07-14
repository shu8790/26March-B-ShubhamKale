package zerodhaExcel;
import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class KiteAppExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		
			System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			Thread.sleep(2000);
			
		//how to get the credentials from excel sheet
		//1.file class
		//2.workbookfactory class methods
			
			File myfile= new File("G:\\1Sele\\xl\\record.xlsx");
			Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
			String un = mysheet.getRow(2).getCell(0).getStringCellValue();
			String pwd = mysheet.getRow(2).getCell(1).getStringCellValue();
			String pin = mysheet.getRow(2).getCell(2).getStringCellValue();
			
		//find locaters
		//1.login page	
			WebElement userID = driver.findElement(By.id("userid"));
			WebElement pwdtextBox = driver.findElement(By.id("password"));
			WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
			
			userID.sendKeys(un);
			pwdtextBox.sendKeys(pwd);
			loginButton.click();
			Thread.sleep(1000);
			
		//2. pin page
			WebElement pinBox = driver.findElement(By.xpath("//input[@type='password']"));
			WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
			pinBox.sendKeys(pin);
			continueButton.click();
			Thread.sleep(1000);
			
		//3.home page
			WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
			
			
						
			String actualUN = userName.getText();
			String expectedUN = un;
			
			if(actualUN.equals(expectedUN))
			{
				System.out.println("username maches hence test case is passed");
			}
			else
			{
				System.out.println("username does not maches hence test case is failed");
			}
			Thread.sleep(1000);
			userName.click();
			Thread.sleep(1000);
			WebElement logoutButton = driver.findElement(By.xpath("//a[@href='/logout']"));
			logoutButton.click();
			Thread.sleep(2000);
			driver.close();
			
	}

}
