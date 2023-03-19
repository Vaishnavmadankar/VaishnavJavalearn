package javapackage1;

public class NonstatictoStatic {
	
	public void method1() {
		System.out.println("this is non static method");
	}

	public static void main(String[] args) {
		NonstatictoStatic Obj=new NonstatictoStatic();
		Obj.method1();
		
	}
}
