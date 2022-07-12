package testNGSoftAssertStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EqualsAndNotEqualsUse {
  @Test
  public void myMethod() 
  {
	  	String city="pune";
	  	String city1="delhi";
	  	
	  	SoftAssert soft= new SoftAssert();
	  	
//	  	soft.assertEquals(city, city1,"values of city and city1 are not equals hence TC failed");
	  	
	  	soft.assertNotEquals(city, city1,"values of city and city1 are equals hence TC failed");
	  	Reporter.log("values of the city and city1 is not equal hence TC is passed", true);
	  	
	  	
	  	soft.assertNotNull(city, "the value of city is  null hence TC failed");
	  	Reporter.log("the value of city is not null hence the TC is Passed",true);
	  	soft.assertAll();
  }
}
