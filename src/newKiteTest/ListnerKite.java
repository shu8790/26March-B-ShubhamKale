package newKiteTest;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import newBaseKite.Base;
import newUtilityKite.UtilityPropScrn;

public class ListnerKite extends Base implements ITestListener

{
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("congragulation Tc is passed,Name of passed Tc is"+result.getName(),true);
		
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("TC is failed screenshot is taken plz check the your folder ", true);
		try {
			UtilityPropScrn.captureScreenShot(driver,result.getName() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("Tc is skipped ,name of SKIPPED method is"+result.getName());
	}

}
