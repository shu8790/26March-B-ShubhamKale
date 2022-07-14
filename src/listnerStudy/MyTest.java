package listnerStudy;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listnerStudy.ListnerUse.class)
public class MyTest {
  @Test
  public void myMethod1()
  {
	  Reporter.log("myMethod1 is succesfull", true);
  }
  
  @Test
  public void myMethod2()
  {
	  Assert.fail();
  }
  
  @Test(dependsOnMethods = {"myMethod2"})
  public void myMethod3()
  {
	  Reporter.log("myMethod3", true);
  }
  
}
