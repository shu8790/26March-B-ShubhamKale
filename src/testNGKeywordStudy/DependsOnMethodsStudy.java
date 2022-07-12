package testNGKeywordStudy;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsStudy {
  @Test
  public void d()
  {
	  Reporter.log("hello", true);
  }
  @Test(dependsOnMethods = {"x","g"})
  public void a()
  {
	  Reporter.log("hii", true);
  }
  @Test
  public void x()
  {
	  
	  Reporter.log("good morning",true);
  }
  @Test
  public void g()
  {
	  Reporter.log("good afternoon", true);
  }
  
}
