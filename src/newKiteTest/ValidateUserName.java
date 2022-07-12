package newKiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import newBaseKite.Base;
import newPOMPackKite.HomePage;
import newPOMPackKite.LoginPage;
import newPOMPackKite.PINPage;
import newUtilityKite.Utility;
import newUtilityKite.UtilityPropScrn;

public class ValidateUserName extends Base
{

	HomePage home;
	LoginPage login;
	PINPage pin;
	String TCID="1243";
	//@Parameters("browsername")
	@BeforeClass
	public void launchBrowser() throws IOException
	{
//		if(name.equals("Chromre"))
//		{
			openChromeBrowser();
//		}
//		else if(name.equals("Firefox"))
//		{
//			openFireFoxBrowser();
//		}
		home =new HomePage(driver);
		login=new LoginPage(driver);
		pin= new PINPage(driver);
	}
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.sendUserID(UtilityPropScrn.getDataFromPropFile("UN"));
		login.sendPassword(UtilityPropScrn.getDataFromPropFile("PWD"));
		login.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPIN(UtilityPropScrn.getDataFromPropFile("PIN"));
		pin.clickContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	@Test
  public void validateUserName() throws EncryptedDocumentException, IOException 
  {
		Assert.assertEquals(home.getActualUserName(), Utility.getdata(2, 0),"actualUserName and expectedUserName are not matching hence TC is Failed");
		UtilityPropScrn.captureScreenShot(driver,TCID);
		Reporter.log("values of actualUserName and expectedUserName maches hence Tc is passed", true);
		
  }
	@AfterMethod
	public void logout() throws InterruptedException
	{
		home.clickUserID();
		Thread.sleep(400);
		
		home.clickLogoutButton();
		
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.close();
	}
}
