package javapackage1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling4 
{
	public static void main(String[] args) throws IOException {
		File F=new File("../Javaproject/src/Package1/FIleH.txt");
		FileWriter Fr=new FileWriter(F,true);                                  // Append line command      
		BufferedWriter Bw=new BufferedWriter(Fr);                                   
		Bw.newLine(); 
		Bw.write("This is First line of Append");
		Bw.newLine();                                                            
		Bw.write("This is Second line of Append");                                               
		Bw.close();
	}
}
