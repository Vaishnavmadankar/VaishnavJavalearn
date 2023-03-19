package javapackage1;

import java.util.Scanner;

public class TablePrint 
{
   public void tableprint(int number) 
   {
	for (int i = 1; i <=10; i++) 
	{	
     System.out.println(number+"*"+i+"="+number*i);
	}
	   
   }
	
	public static void main(String[] args) {
		System.out.println("Please enter the values of table");
		Scanner S=new Scanner(System.in);
		int number=S.nextInt();   
		
		TablePrint Obj=new TablePrint();
		System.out.println("Table for "+number);
        Obj.tableprint(number);
        
	}
}
