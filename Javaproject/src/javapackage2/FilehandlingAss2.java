package javapackage2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


// to read from initial to end //

public class FilehandlingAss2 
{

	public FilehandlingAss2(int a,int b) throws IOException 
	{
		
		File F=new File("../Javaproject/src/Package2/FIleH.txt");
		FileReader Fr=new FileReader(F);
		BufferedReader Br=new BufferedReader(Fr);
		String s;
		int D=0;
		while (((s=Br.readLine())!=null)) 
		{
		   D=D+1;
		   if ((D >= a)&&(D<=b)) 
		   {
			System.out.println(s);
         	}
		}	
	}

	public static void main(String[] args) throws IOException 
	{
		FilehandlingAss2 Fh=new FilehandlingAss2(1,4 );	
	    
	}
	
}
