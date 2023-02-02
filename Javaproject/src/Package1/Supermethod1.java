package Package1;

public class Supermethod1 {
	
	public void method1()
	{
	System.out.println("Parent default paraterized method");
	}
	
	public void method2(){
		System.out.println("Parent one paraterized method");
		}
	
	public void method3(){
		System.out.println("Parent two paraterized method");
		}

	public void method4(){
		this.method1();
		this.method3();
		this.method2();
		System.out.println("Parent three paraterized method");
		
		}
}
