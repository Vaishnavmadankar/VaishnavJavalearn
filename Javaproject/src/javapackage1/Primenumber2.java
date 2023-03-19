package javapackage1;

import java.awt.Checkbox;
import java.util.Iterator;
import java.util.Scanner;

public class Primenumber2 
{

	public void Primenumber2(int number) 
	{
		int half=number/2;
		int max=0;
		
	  for (int i = 2; i <= half; i++) 
	  {
		if (number%i==0) 
		{
			System.out.println("This is Even number "+number);
			max=1;
			break;
		}
	  }
	  if (max==0) 
	  {
		  System.out.println("This is prime number "+number);
		  
      }
	  }
	
	public static void main(String[] args) {
		
		System.out.println("Please enter the values of max");
		Scanner S=new Scanner(System.in);
		int number=S.nextInt();
		
		Primenumber2 obj=new Primenumber2();
		obj.Primenumber2(number);
		
	}
}
