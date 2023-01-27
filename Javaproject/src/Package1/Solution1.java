package Package1;

public class Solution1 {
	
	public Solution1() {
	    this(23,24,45);
		System.out.println("Defalt parameterized Constructor");
	}
  
	public Solution1(int a) {
		this();
		System.out.println("One parameterized Constructors");
	}
	
	public Solution1(int a,int b) {
		this(20,12,33,12);
		System.out.println("Two parameterized Constructor");
	}
	
	public Solution1(int a,int b,int c) {
		System.out.println("Three parameterized Constructors");
	}
	public Solution1(int a,int b,int c,int d) {
		this(12);
		System.out.println("Four parameterized Constructor");
	}
	
	public static void  main(String[] args) {
		Solution1 obj=new Solution1(12,19);
	}
}

