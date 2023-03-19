package javapackage2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// to read particular line //

public class FilehandlingAss1 
{
	public FilehandlingAss1(int a) throws IOException 
	{
		File F=new File("../Javaproject/src/Package2/FIleH.txt");
		FileReader Fr=new FileReader(F);
		BufferedReader Br=new BufferedReader(Fr);
		String s;
		int D=0;
		while (((s=Br.readLine())!=null)) 
		{
		   D=D+1;
		   if (D == a) 
		   {
			System.out.println(s);
			break;
			
         	}
		}	
	}

	public static void main(String[] args) throws IOException 
	{
		FilehandlingAss1 Fh=new FilehandlingAss1(2);	
	    
	}

}
