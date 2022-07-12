package testNGKeywordStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutStudy {
	 @Test
	  public void login() 
	  {
		  Reporter.log("login is sucess full", false);
	  }
	  @Test
	  public void functionalityCheck()
	  {
		  Reporter.log("Fuctionality is successfully check", true);
	  }
	  @Test(timeOut = 1000)
	  public void logout() throws InterruptedException
	  {
		  Thread.sleep(1500);
		  Reporter.log("logout is successful", true);
	  }
}
