package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
			File myfile =new File("G:\\1Sele\\xl\\record.xlsx");
		//read all the data from excel file in dynamic mode
		//1.split all the reading methods into single- single steps
			
			Workbook mybook = WorkbookFactory.create(myfile);
			Sheet mysheet = mybook.getSheet("Sheet1");
			for(int i=0; i<=4;i++)
			{
				for(int j=0; j<=4;j++)
				{
					Cell value = mysheet.getRow(i).getCell(j);
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
					else if(datatype==CellType.BLANK)
					{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			
			System.out.println("this is the code for git update");
			
			
			
			
			
	}

	

}
