package testNGSoftAssertStudy;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTrueAndFalse {
  @Test
  public void myMethod() 
  {
	  boolean name=true;
	  boolean home=false;
	  
	  SoftAssert s=new SoftAssert();
	  
	  s.assertTrue(home,"the value of home is false hence Tc is failed");
	  
	  s.assertFalse(home,"the value of home is true hence Tc is Failed");
//	  s.assertAll();
	  
  }
}
