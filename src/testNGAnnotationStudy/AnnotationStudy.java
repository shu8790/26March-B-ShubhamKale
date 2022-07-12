package testNGAnnotationStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationStudy 
{
	//write two test methods and use all different
	//annotations provided by the TestNG 
  @Test
  public void test1() 
  {
	  Reporter.log("method test1 run successfully", true);
  }
 @Test
 public void test2()
 {
	 Reporter.log("method test2 run successfully", true);
	 
 }
 
  
}
