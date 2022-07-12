package newKiteTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import newBaseKite.Base;
import newPOMPackKite.HomePage;
import newPOMPackKite.LoginPage;
import newPOMPackKite.PINPage;
import newUtilityKite.UtilityPropScrn;
@Listeners(newKiteTest.ListnerKite.class)
public class ValidateUserNameUsingProp extends Base
{
  
  HomePage home;
  LoginPage login;
  PINPage pin;
//  String TCID="4534";
  
  @Parameters("browsername")	
  @BeforeClass
  public void launchBrowser(String name) throws IOException
  {
	  if(name.equals("Chrome"))
	  {
		openChromeBrowser();  
	  }
	  else if(name.equals("Firefox"))
	  {
		  openFireFoxBrowser();
	  }
	  
	  home= new HomePage(driver);
	  login= new LoginPage(driver);
	  pin = new PINPage(driver);
	  
  }
  @BeforeMethod
  public void loginKiteApp() throws IOException
  {
	  login.sendUserID(UtilityPropScrn.getDataFromPropFile("UN"));
	  login.sendPassword(UtilityPropScrn.getDataFromPropFile("PWD"));
	  login.clickLoginButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  
	  pin.sendPIN(UtilityPropScrn.getDataFromPropFile("PIN"));
	  pin.clickContinueButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  
	  
  }
  @Test
  public void validateUserName() throws IOException
  {
	  
	 Assert.assertNotEquals(home.getActualUserName(), UtilityPropScrn.getDataFromPropFile("UN"),"actual and expected user name does not match TC is Failed");
//	 UtilityPropScrn.captureScreenShot(driver, TCID);
  }
  @AfterClass
  public void closeBrowser() throws InterruptedException
  {
	  Thread.sleep(1000);
	  driver.close();
	  
  }
  @AfterMethod
  public void logout() throws InterruptedException
  {
	  home.clickUserID();
	  Thread.sleep(500);
	  home.clickLogoutButton();
  }
}
