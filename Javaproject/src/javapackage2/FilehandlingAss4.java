package javapackage2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


// To Write till range

public class FilehandlingAss4 
{
 
	public void FilehandingAss4(int initial,int end) throws IOException 
	{
	 File fr=new File("../Javaproject/src/Package2/file2.txt");	
	 FileWriter Fw=new FileWriter(fr);
	 BufferedWriter Bw=new BufferedWriter(Fw);
	 
	 Scanner Sc=new Scanner(System.in);
	 System.out.println("Please enter Data");
	 
	 String d;
	 
	 for (int i = 1; i <= end; i++) 
	 {
		 if ((i>=initial)&&(i<=end)) 
		  {
			   d=Sc.next();
			   Bw.write(d);
			   Bw.newLine();
			
	      }  
		 else 
		  {
              Bw.newLine();
		  }
       
	   
	 }
	       Bw.close();  // TO close the Data
	 	 
}
	public static void main(String[] args) throws IOException 
	{
		FilehandlingAss4 Fh=new FilehandlingAss4();
		Fh.FilehandingAss4(3, 5);
	
	}
}
