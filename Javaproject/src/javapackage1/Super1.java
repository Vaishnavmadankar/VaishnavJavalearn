package javapackage1;

public class Super1 {

	public Super1() 
	{
		this(34,45,56);
		System.out.println("Parent default parameterized constructor");
	}
	
	public Super1(int a) 
	{
		this();
		System.out.println("Parent one parameterized constructor");
	}
	
	public Super1(int a,int b) 
	{
		this(2);
		System.out.println("Parent two parameterized constructor");
	}
	
	public Super1(int a,int b,int c) 
	{
		System.out.println("Parent three parameterized constructor");
	}


}
