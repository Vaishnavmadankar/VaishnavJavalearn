package javapackage1;

public class Student {
	
	int age;
	int rollno;

	public void abc1() 
	   {
            System.out.println("welcome to all of you  ");	
            
	   } 
	public void abc2() 
	   {
            
			System.out.println("Automation is very easyS  ");
		}

	
    public static void main(String[] args) 
    {
    	Student Vaishnav=new Student();
    	Vaishnav.age=25;
    	Vaishnav.abc1();
    	System.out.println("this is my age ="+ Vaishnav.age);
    	Vaishnav.abc2();
    	Vaishnav.rollno=21;
    	System.out.println("this is my roll no ="+ Vaishnav.rollno);
    	
    	
    }

}