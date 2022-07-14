package listnerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest2 {
  @Test
  public void myMethod8()
  {
	  Reporter.log("this method is passes ", true);
  }
  @Test
  public void myMethod9()
  {
	  Assert.fail();
  }
  @Test(dependsOnMethods = {"myMethod9"})
  public void myMethod10()
  {
	  
  }
}
