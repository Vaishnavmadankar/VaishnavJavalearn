package javapackage1;

public class Interchangevalues1 {
	
	public static void main(String[] args) {
		
		int a=12;
		int b=15;
		
       System.out.println("Value of A without swapping "+ a);
       System.out.println("Value of B without swapping "+ b);
       
       a=a+b;
       b=a-b;
       a=a-b;
       
       System.out.println();
    
       System.out.println("Value of A with swapping "+ a);
       System.out.println("Value of A with swapping "+ b);         
	}

}
