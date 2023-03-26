package ExcelFilehandler;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excelwrite1 
{
  public void Excelreaddata() throws IOException, RowsExceededException, WriteException 
  {
	  File f=new File("../Javaproject/src/ExcelFilehandler/ExcelFilehandiling2.xls");
	  WritableWorkbook wb=Workbook.createWorkbook(f);
	  WritableSheet ws=wb.createSheet("Deepak", 0);
	  
	  for (int i = 0; i < 3; i++) // loops for rows
	  {
		for (int j = 0; j < 3; j++)  // loops for column 
		{
		         Label l=new Label(j, i,"DC");
		         ws.addCell(l);
		}  
		
	  }
	  
	  wb.write();
	  wb.close();
  }
  
    public static void main(String[] args) throws RowsExceededException, WriteException, IOException 
    {
    	Excelwrite1 Ex=new Excelwrite1();
    	Ex.Excelreaddata();
		
	}
   
}
