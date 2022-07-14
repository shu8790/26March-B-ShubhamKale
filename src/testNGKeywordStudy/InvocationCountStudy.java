package testNGKeywordStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCountStudy 
{
  @Test(invocationCount = 5)
  public void fbTimelineCheck ()
  {
	  Reporter.log("FB timeline check successfully",true);
	  
  }
  @AfterMethod
  public void logout()
  {
	  Reporter.log("FB logout successfully",true);
  }
}
