package Package1;

public class Solution2 {

	public void m1() {
		System.out.println("Default parameterized method");
	}
	
	public void m2() {
		System.out.println("One parameterized methods");
	}
	
	public void m3() {
		System.out.println("Two parameterized methods");
		
	}
	
	public void m4() {
		System.out.println("Three parameterized method");
	}
	
	public void m5() {
		System.out.println("Four parameterized methods");
		this.m1();
		this.m2();
		this.m4();
		this.m3();
		
	}
	
	public static void main (String[] args) {
		Solution2 Obj1=new Solution2 ();
		Obj1.m5();
	}

}