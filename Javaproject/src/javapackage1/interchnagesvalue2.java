package javapackage1;

public class interchnagesvalue2 {

	public static void main(String[] args) {
         
		int a=12;
		int b=15;
		
		System.out.println("Value of A without swapping "+ a);
		System.out.println("Value of B without swapping "+ b);
		
		System.out.println();
		
		int c=a+b;
		b=c-b;
		a=c-a;
		
		System.out.println("Value of A with swapping "+ a);
		System.out.println("Value of B with swapping "+ b);
	}

}
