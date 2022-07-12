package testNGAnnotationStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy2 {
	 @Test
	 public void validateUserID()
	 {
	 Reporter.log("User ID Validated",true);
	 }
	 @Test
	 public void validateDashBoard()
	 {
	 Reporter.log("DashBoard Validated",true);
	 }

	 @BeforeMethod
	 public void loginToKiteApp()
	 {
	 Reporter.log("Login suucess",true);
	 }
	 @BeforeClass
	 public void launchBrowser()
	 {
	 Reporter.log("browser Launched",true);
	 }

	 @AfterMethod
	 public void logoutFromKiteApp()
	 {
	 Reporter.log("logging out....",true);
	 }

	 @AfterClass
	 public void closeBrowser()
	 {
	 Reporter.log("broser closed",true);
	 }
}
