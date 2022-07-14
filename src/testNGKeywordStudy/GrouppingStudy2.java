package testNGKeywordStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GrouppingStudy2 {
  @Test(groups = {"regression"})
  public void f() 
  {
	  Reporter.log("method f is running properly,regression", true);
  }
  @Test(groups = {"sanity"})
  public void mn()
  {
	  Reporter.log("method mn is running properly,sanity", true);
  }
  @Test(groups = {"sanity"})
  public void dh()
  {
//	  Assert.fail();
	  Reporter.log("method dh is running properly,sanity", true);
  }
  @Test(groups = {"regression"})
  public void jk()
  {
//	  Assert.fail();
	  Reporter.log("method jk is running properly,regression", true);
  }
  @Test
  public void sd()
  {
	  Reporter.log("method sd is running properly", true);
  }
}
