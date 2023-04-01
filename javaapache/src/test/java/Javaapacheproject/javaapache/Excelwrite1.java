package Javaapacheproject.javaapache;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.chainsaw.Main;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwrite1
{
       public void excelwrite() throws IOException 
       {
    	  File f=new File("../javaapache/ExcelFilehandiling2.xlsx");
    	  FileOutputStream Fi=new FileOutputStream(f);
          XSSFWorkbook Xw=new XSSFWorkbook();
          XSSFSheet Xs=Xw.createSheet("VAISHNAV");
          
          for (int i = 0; i < 5; i++)      // loop for row 
          { 
			XSSFRow Xr=Xs.createRow(i);          // row object created
			 for (int j = 0; j < 5; j++)         // loop for colomns
			 {
				XSSFCell xc=Xr.createCell(j);    // cell object created
				xc.setCellValue("DC");           // set the CELL DATA
				
		     }
			
		  }
          
          Xw.write(Fi);    // move the data from woorkbook to stream
          Fi.flush();      // move the data stream to file
          Fi.close();        // closed the stream
          
       }
       
       public static void main(String[] args) throws IOException 
       {
    	   Excelwrite1 e=new Excelwrite1();
		   e.excelwrite();
	   }
}
