package kitePOMTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ValidateUserNameCT {
  
	WebDriver driver;
	Sheet mysheet;
	HomePage home;
	LoginPage login;
	PINPage pin1;
	@Parameters("browsername")
  @BeforeClass
  public void launchBrowser(String name) throws EncryptedDocumentException, IOException
  {
			if(name.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
				driver= new ChromeDriver();
			}
			else if(name.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "G:\\1Sele\\geckodriver.exe");
				driver= new FirefoxDriver();
			}
	  	
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File myfile= new File("G:\\1Sele\\xl\\record.xlsx");
		 mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
		 home= new HomePage(driver);
		 login= new LoginPage(driver);
		 pin1=new PINPage(driver);
	  
  }
  @BeforeMethod
  public void loginKiteApp() throws InterruptedException
  {
	   String userId = mysheet.getRow(2).getCell(0).getStringCellValue();
		String pwd = mysheet.getRow(2).getCell(1).getStringCellValue();
		String pin = mysheet.getRow(2).getCell(2).getStringCellValue();

		login.sendUserID(userId);
		login.sendPassword(pwd);
		login.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		pin1.sendPIN(pin);
		Thread.sleep(200);
		pin1.clickContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		
  }
	
  @Test
  public void validateUserName()
  {
	  String actualUserName = home.getActualUserName();
	  String expectedUserName = mysheet.getRow(2).getCell(0).getStringCellValue();
	  Assert.assertEquals(actualUserName, expectedUserName,"values of actualUsername and expectedUserName are not equal hence tc is failed");
	  Reporter.log("the values of actualUsername and expectedUserName are equal hence TC is passed", true);
	  
  }
  
  @AfterMethod
  public void logout() throws InterruptedException
  {
	  home.clickUserID();
	  Thread.sleep(500);
	  home.clickLogoutButton();
	  
  }
  @AfterClass
  public void closeBrowser() throws InterruptedException
  {
	  Thread.sleep(1000);
	  driver.close();
	  
  }
}
