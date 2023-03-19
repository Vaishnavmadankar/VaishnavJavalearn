package javapackage1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class FileHandling1 
{
     public static void main(String[] args) throws IOException {
		File F=new File("../Javaproject/src/Package1/FIleH.txt");
		FileReader Fr=new FileReader(F);
		BufferedReader Br=new BufferedReader(Fr);                   // Read the Data Line by Line 
		String s;
		while ((s=Br.readLine())!=null) 
		{
		 System.out.println(s);	
		}
	}
}
