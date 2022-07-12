package kitePOMWithExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		File myfile= new File("G:\\1Sele\\xl\\record.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		String userId = mysheet.getRow(2).getCell(0).getStringCellValue();
		String pwd = mysheet.getRow(2).getCell(1).getStringCellValue();
		String pin = mysheet.getRow(2).getCell(2).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		LoginPage lg= new LoginPage(driver);
		lg.sendUserID(userId);
		lg.sendPassword(pwd);
		lg.clickLoginButton();
		Thread.sleep(1000);
		
		PINPage p= new PINPage(driver);
		p.sendPIN(pin);
		p.clickContinueButton();
		Thread.sleep(1000);
		
		HomePage hp= new HomePage(driver);
		hp.validateUserName(userId);
		hp.clickUserID();
		Thread.sleep(1000);
		hp.clickLogoutButton();
		
		

	}

}
