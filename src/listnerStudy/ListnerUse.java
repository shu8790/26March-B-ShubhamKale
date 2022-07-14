package listnerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerUse implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("screenShot is taken check the desired location", true);
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("congratulation Method is passed,name of method is"+result.getName(), true);
		
	}
	
	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("this method is skipped name of method is"+result.getName(),true);
		
	}

}
