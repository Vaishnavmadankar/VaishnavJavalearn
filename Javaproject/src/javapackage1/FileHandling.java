package javapackage1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling 
{
  public static void main(String[] args) throws IOException 
  {
	File f=new File("../Javaproject/src/Package1/FIleH.txt");  
	FileReader fr=new FileReader(f);                            // Read the Data Character By Character 
	int a;
	while ((a=fr.read())!=-1)              
	{
	 System.out.println((char)a);	
	}
	
  }
}
