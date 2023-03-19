package javapackage1;

public class Super2 extends Super1
{

	public Super2() {
		this(22,23);
		System.out.println("Child default parameterized constructor");
	}

	public Super2(int a) {
		this(22,32,1);
		System.out.println("Child one parameterized constructor");
	}
	
	public Super2(int a, int b) {
		super(22,21);
		System.out.println("Child two parameterized constructor");
	}
	

	public Super2(int a,int b,int c) 
	{
		this();
		System.out.println("Child three parameterized constructor");
	}
	
	public static void main(String[] args) {
		Super2 Obj=new Super2(22);
	}
}
