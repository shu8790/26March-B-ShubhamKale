package testNGKeywordStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableStudy {
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
	  @Test(enabled = false)
	  public void logout()
	  {
		  Reporter.log("logout is successful", true);
	  }
}
