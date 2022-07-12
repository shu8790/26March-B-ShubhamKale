package newUtilityKite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import newBaseKite.Base;

public class UtilityPropScrn 
{
		//1.screenShot
//			a)Write method for it
			//2.read Data using PropertyFile
//			a)first Create prop File 
//			b)Store data into it
//			c)write method for reading that data
	
	
	
	public static void captureScreenShot(WebDriver driver,String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("G:\\1Sele\\SelScreenshots\\"+TCID+".png");
		FileHandler.copy(src, dest);
	}
	
	public static String getDataFromPropFile(String key) throws IOException
	{
		Properties p=new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\26thMarch-B Selenium\\MyProperty.properties");
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
	}
	

}
