package ExcelFilehandler;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excelread1 
{
	
	public void Excelread() throws BiffException, IOException 
	{
		File f=new File("../Javaproject/src/ExcelFilehandler/ExcelFilehandiling.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int column=ws.getColumns();
		int row=ws.getRows();
		
		for (int i = 0; i < row; i++) // Loop for rows
		{
          for (int j = 0; j < column; j++) // loop for columns
          {
			Cell c1=ws.getCell(j, i);
			System.out.println(c1.getContents());
		  }
			
		}
	}

	  public static void main(String[] args) throws BiffException, IOException {
		Excelread1 Ex=new Excelread1();
		Ex.Excelread();
	}
	
}
