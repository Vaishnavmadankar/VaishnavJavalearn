package javapackage2;

import java.util.Stack;

public class Collection3 
{
 public static void main(String[] args) 
 {
       Stack<String> S=new Stack<String>();
       S.push("SUMIT");
       S.push("RAMESH");
       S.push("DINESH");
       S.push("NIMESH");
       S.push("MAHESH");
       
       for (String SP : S) 
       {
		System.out.println(SP);
	}
 }
}
