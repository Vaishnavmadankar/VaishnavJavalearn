package Javaapacheproject.javaapache;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread1 
{
	public void Excelreaddata() throws IOException 
	{
	   File f=new File("../javaapache/ExcelFilehandiling.xlsx");	
	   FileInputStream fs=new FileInputStream(f);
	   XSSFWorkbook xs=new XSSFWorkbook(fs);
	   XSSFSheet xt=xs.getSheetAt(0);
	   int r=xt.getPhysicalNumberOfRows();                      // loop for rows
	   for (int i = 0; i < r; i++)                                 // loop for rows 
	   { 
             XSSFRow xr=xt.getRow(i);                                // row object creation
             int c=xr.getPhysicalNumberOfCells();                    // number of cell in r ow
             for (int j = 0; j < c; j++)                         // loop for cell (coloumns)
              {
			     XSSFCell xc=xr.getCell(j);
		         System.out.println(xc.getStringCellValue());	
	 		
	      	  }
	  }
	   
	}
	
	public static void main(String[] args) throws IOException 
	{
	
		Excelread1 e=new Excelread1();
		e.Excelreaddata();
		
		
	}

}
