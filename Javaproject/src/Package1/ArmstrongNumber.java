package Package1;

import java.util.Scanner;

public class ArmstrongNumber 
{
	public void checkArmstrongNumber(int number) 
	   {
		   int original_number =number;  // 153
		   int sum=0;                    // 0
		    
		   while (number > 0)            // 153         15           1
		    {
			int r=number %10;            //3            5             1
			sum =sum+r*r*r;              // 27          152         153 
			number =number /10;         //15            1             0
		   }
		   
		   if (original_number == sum) 
		   {
			System.out.println("it's a ArmstrongNumber number "+original_number);
			
	       }
		   else 
		   {
			   System.out.println("it's not a ArmstrongNumber number "+original_number);
		   }
		   
	   }
	   
	   public static void main(String[] args) {
		   
		   System.out.println("Please enter the values of max");
			Scanner S=new Scanner(System.in);
			int number=S.nextInt();
		   
			ArmstrongNumber obj=new ArmstrongNumber();
		   obj.checkArmstrongNumber(number);
	}	

}
