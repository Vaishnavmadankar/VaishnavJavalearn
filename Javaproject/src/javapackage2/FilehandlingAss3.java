package javapackage2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// To Write till position


public class FilehandlingAss3 
{
	public void FIlehandingAss3(int range) throws IOException 
	{
	 File fr=new File("../Javaproject/src/Package2/file2.txt");	
	 FileWriter Fw=new FileWriter(fr);
	 BufferedWriter Bw=new BufferedWriter(Fw);
	 
	 Scanner Sc=new Scanner(System.in);
	 System.out.println("Please enter Data");
	 
	 String d;
	 
	 for (int i = 1; i <= range; i++) 
	 {
       d=Sc.next();
	   Bw.write(d);
	   Bw.newLine();
	   
	}
	Bw.write(0); // TO saving the Data
	Bw.close();  // TO close the Data
	 	 
}
	public static void main(String[] args) throws IOException {
		FilehandlingAss3 Fh=new FilehandlingAss3();
		Fh.FIlehandingAss3(2);
	
	}

}
