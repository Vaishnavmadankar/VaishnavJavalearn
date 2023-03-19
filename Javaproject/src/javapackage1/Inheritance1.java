package javapackage1;

import java.util.Scanner;

public class Inheritance1 {
	
	public int sum(int x1,int x2) {
		int sum1=x1+x2;
		return sum1;
	}
	
	public int sub(int x3,int x4) {
		int sub1=x3-x4;
		return sub1;
	}
	
	public int multi(int x5,int x6) {
		int multi1=x5*x6;
		return multi1;
	}
	
	public int div(int x6,int x7) {
		int div1=x6-x7;
		return div1;
	}
	
	public static void main(String[] args) {
		Inheritance1 Obj=new Inheritance1();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First value ");
		int x1=s.nextInt();
		
		System.out.println("Enter the Second value ");
		int x2=s.nextInt();
		
		System.out.println("Enter the third value ");
		int x3=s.nextInt();
		
		System.out.println("Enter the Fourth value ");
		int x4=s.nextInt();
		
		System.out.println("Enter the fifth value ");
		int x5=s.nextInt();
		

		int sumresult=Obj.sum(x1,x2);
		System.out.println("Sum of first two values" +sumresult);
		int sumresult2=Obj.sum(sumresult,x2);
		System.out.println("Sum of three values" +sumresult2);
		int subresult=Obj.sum(sumresult,x3);
		System.out.println("Sub of fouth values" +subresult);
		int multiresult=Obj.sum(subresult,x4);
		System.out.println("Sub of fifth values" +multiresult);
		int divresult=Obj.sum(multiresult,x5);
		System.out.println("Sub of sixth values" +multiresult);
		
		System.out.println("final result"+ divresult);
	}
	  
	}
