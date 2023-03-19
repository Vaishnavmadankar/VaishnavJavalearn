package javapackage1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling2 
{
	public static void main(String[] args) throws IOException {
		File F=new File("../Javaproject/src/Package1/FIleH.txt");
		FileWriter Fr=new FileWriter(F);                                         // To write the One line 
		BufferedWriter Bw=new BufferedWriter(Fr);                                // To write the One line 
		Bw.write("Hi,This is One line write File Handing We Are Learning"); 
		Bw.close();
	}
}
