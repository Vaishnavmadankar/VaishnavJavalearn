package javapackage2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection2 
{
     public static void main(String[] args) 
    {
	  
    	LinkedList<Integer> Al=new LinkedList<Integer>();
    	Al.add(123);
    	Al.add(122);
    	Al.add(12323);
    	Al.add(123232);
    	Al.add(11);
    	Al.add(122);
    	
       for (Integer s : Al) 
       {
        System.out.println(s);		
    	}
    	 
	}
}