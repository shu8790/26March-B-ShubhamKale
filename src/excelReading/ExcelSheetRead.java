package excelReading;
import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
	// how to read excel sheet
		//1. create an excel file and pass its path 
		//2. using workbookfactory class read data in excel sheet
		
		File myfile= new File("G:\\1Sele\\xl\\record.xlsx");
		
		String header1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(header1);
		
		String state1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		String capital1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
//		double code1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(2).getNumericCellValue();
//		String cat1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(3).getStringCellValue();
//		boolean auth1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(4).getBooleanCellValue();
		
		double code = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(2).getNumericCellValue();
	//	double code = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(2).getNumericCellValue();
		System.out.println(state1+" "+capital1);
		System.out.println(code);
		String cat = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(3).getStringCellValue();
		System.out.println(cat);
	
		String State2 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		System.out.println(State2);
		
		double code1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(2).getNumericCellValue();
		System.out.println(code1);
	
	}

}
