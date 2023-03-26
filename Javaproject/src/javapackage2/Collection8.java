package javapackage2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Collection8 
{
	public static void main(String[] args) 
	   {
		 
		 PriorityQueue<String> q=new PriorityQueue<String>();
		 q.add("API");
		 q.add("APPIUM");
		 q.add("APIAUtomation");
		 q.add("Selenium");
		 q.add("ISTQB");
		 q.add("SDET");
		 
	 
		 while (q.size()!=0) 
		 {
		   System.out.println(q.poll());	
	     }
		 
		   
	   } 
}
