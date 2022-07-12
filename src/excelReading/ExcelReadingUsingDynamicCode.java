package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingUsingDynamicCode {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
// read the excel sheet using dynamic coding
	//1. split the data reading methods into single steps
	//2. find the limits of rows and cloumns
	//3. check the data type of each cell and then get cell data
	
			File myfile= new File("G:\\1Sele\\xl\\record.xlsx");
			
			Workbook book = WorkbookFactory.create(myfile);
			Sheet mysheet = book.getSheet("Sheet1");
		
			int totalnoofrows = mysheet.getLastRowNum();
//			System.out.println(totalnoofrows);
			int rowcount = totalnoofrows;
			short totalnoofcell = mysheet.getRow(totalnoofrows).getLastCellNum();
//			System.out.println(totalnoofcell);
			int cellcount = totalnoofcell-1;
			
			for(int i=0;i<=rowcount;i++)
			{
				for(int j=0;j<=cellcount;j++)
				{
					Cell value = mysheet.getRow(i).getCell(j);
					if (value!=null)
					{
						CellType datatype = value.getCellType();
						if(datatype==CellType.STRING)
						{
							String v = value.getStringCellValue();
							System.out.print(v+"  ");
						}
						else if(datatype==CellType.NUMERIC)
						{
							double v = value.getNumericCellValue();
							System.out.print(v+"  ");
						}
						else if(datatype==CellType.BOOLEAN)
						{
							boolean v = value.getBooleanCellValue();
							System.out.print(v+"  ");
						}
					}
					else
					{
//							else if(datatype==CellType.BLANK)
//							{
//								System.out.print("  ");
//							}
						System.out.print(" --- ");
					}
				}
				System.out.println();
			}
			

	}

}
