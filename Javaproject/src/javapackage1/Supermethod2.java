package javapackage1;

public class Supermethod2 extends Supermethod1

{
	public void m1()
	{
		this.m3();
		System.out.println("Child default paraterized method");
	}
	
	public void m2()
	{
		this.m1();
		System.out.println("Child one paraterized method");
	}
	
	public void m3()
	{
		super.method4();
		System.out.println("Child two paraterized method");
	}

	public void m4()
	{  
		this.m2();
		System.out.println("Child three paraterized method");
	}
	
	public static void main(String[] args) {
		Supermethod2 obj=new Supermethod2();
		obj.m4();
	}
}
