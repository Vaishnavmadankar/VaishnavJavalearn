package javapackage2;

import java.util.LinkedHashSet;

// Output given in order 

public class Collection5 
{
  public static void main(String[] args)
  {
	LinkedHashSet<Integer> HS=new LinkedHashSet<Integer>();
   	HS.add(2323);
   	HS.add(232);
   	HS.add(2323);
   	HS.add(23);
   	HS.add(2322);
   	HS.add(2323);
   	HS.add(2323);
   	HS.add(232312);
   	
	for (Integer S : HS)
	{
	  System.out.println(S);	
	}
  }
}
