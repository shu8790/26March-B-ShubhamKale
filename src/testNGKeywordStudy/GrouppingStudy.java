package testNGKeywordStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GrouppingStudy {
  
	@Test(groups = {"sanity"})
	public void x()
	{
//		Assert.fail();
		Reporter.log("method x is running fine,sanity", true);
	}
	@Test(groups = {"regression"})
	public void z()
	{
		Reporter.log("method z is running fine,regresion", true);
	}
	@Test(groups = {"sanity"})
	public void y()
	{
//		Assert.fail();
		Reporter.log("method y is running fine,sanity", true);
	}
	@Test(groups = {"regression"})
	public void aa()
	{
		Reporter.log("method aa is running fine,regresion", true);
	}
	@Test
	public void ty()
	{
		Reporter.log("method ty is running fine", true);
	}
	
	
}
