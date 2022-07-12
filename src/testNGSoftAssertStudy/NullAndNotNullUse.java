package testNGSoftAssertStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NullAndNotNullUse {
  @Test
  public void myMethod()
  {
	  	String city="pune";
	  	String city1=null;
	  	
	  	SoftAssert s= new SoftAssert();
	  	s.assertNotNull(city1, "the value of city1 is null hence TC is failed");
	  	s.assertNull(city1, "the value of city1 is not null hence Tc Failed ");
	  	Reporter.log("the value of city1 is null hence the Tc is passed", true);
	  	s.assertAll();
  }
}
