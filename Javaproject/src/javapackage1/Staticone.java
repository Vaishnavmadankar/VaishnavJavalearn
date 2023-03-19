package javapackage1;

public class Staticone 
{
	static int a;
	public static void method1() 
	{
		a=a+1;
	System.out.println("This is static method");	
	}
	
	public static void main(String[] args) {
        Staticone s=new Staticone();             
		Staticone.method1();
		System.out.println(Staticone.a);
		s.method1();
		method1();
		Staticone.a=12;
		System.out.println(Staticone.a);

		
		
		
	}
	

}
