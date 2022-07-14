package newUtilityKite;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility 
{
	//screenShot
	//excel reading
	//browser close
	
	public static String getdata(int row, int cell) throws EncryptedDocumentException, IOException
	{
		File myfile= new File("G:\\1Sele\\xl\\record.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		String data = mysheet.getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
	

}
