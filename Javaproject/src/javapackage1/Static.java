package javapackage1;

public class Static 
{

	static int abc=25;
	
	public void increament() 
	{
	   abc=abc+1;	
	}
	
	public static void main(String[] args) {
		/**************First Object***********/
		Static s=new Static();
		s.increament();
		System.out.println("Value of object one");
		System.out.println(s.abc);
				
		/**************Second Object***********/
		Static M=new Static();
		M.increament();
		System.out.println("Value of object one");
		System.out.println(M.abc);
		
		/**************Third Object***********/
		Static Z=new Static();
		Z.increament();
		System.out.println("Value of object one");
		System.out.println(Z.abc);
	
		

	}
}
