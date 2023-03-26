package javapackage2;

import java.util.LinkedList;
import java.util.Queue;

public class Collection7 
{
   public static void main(String[] args) 
   {
	 
	 Queue<String> q=new LinkedList<String>();
	 q.add("MAHESH");
	 q.add("SURESH");
	 q.add("DINESH");
	 q.add("MAHESH");
	 q.add("NERESH");
	 q.add("BHUPESH");
	 
	 System.out.println(q.element());
	 q.poll();                           // It can be used for retrive the head and removed  //
	 System.out.println(q.element());
	 
	 System.out.println("Result of this as below");

	 
	 for (String s : q) 
	 {
	  System.out.println(s);	
     }
	 
	   
   } 
}
