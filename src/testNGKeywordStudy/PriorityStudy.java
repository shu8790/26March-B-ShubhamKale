package testNGKeywordStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityStudy {
  @Test
  public void login() 
  {
	  Reporter.log("login is sucess full", false);
  }
  @Test(priority = -1)
  public void functionalityCheck()
  {
	  Reporter.log("Fuctionality is successfully check", true);
  }
  @Test(priority = -1)
  public void logout()
  {
	  Reporter.log("logout is successful", true);
  }
 
  
  
}
