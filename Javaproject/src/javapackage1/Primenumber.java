package javapackage1;

import java.util.Iterator;
import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
  
		System.out.println("Please enter the values of max");
		Scanner S=new Scanner(System.in);
		int max=S.nextInt();
		
		
		if(max>0) 
		{
		for (int i = 1; i <= max; i++) 
		{
			if (i%2==1) {
				
				System.out.println("this is prime number "+ i);
					
		}
			else {
				
				System.out.println();
			}
			
		}
			
		}
		
		
		
		
		
	}

}
