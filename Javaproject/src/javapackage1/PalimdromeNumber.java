package javapackage1;

import java.util.Scanner;

public class PalimdromeNumber 
{
   public void checkpalimedromenumber(int number) 
   {
	   int original_number =number;  // 141
	   int sum=0;                    // 0
	    
	   while (number > 0)            // 141
	    {
		int r=number %10;            //1
		sum =sum*10+r;              // 1
		number =number /10;         //41    
	   }
	   
	   if (original_number == sum) 
	   {
		System.out.println("it's a Palimedrome number "+original_number);
		
       }
	   else 
	   {
		   System.out.println("it's not a Palimedrome number "+original_number);
	   }
	   
   }
   
   public static void main(String[] args) {
	   
	   System.out.println("Please enter the values of max");
		Scanner S=new Scanner(System.in);
		int number=S.nextInt();
	   
	   PalimdromeNumber obj=new PalimdromeNumber();
	   obj.checkpalimedromenumber(number);
}
   
}
