package javapackage2;

import java.util.TreeSet;

// Accending order it will give result

public class Collection6 
{
 public static void main(String[] args) 
 {
	 TreeSet<String> TS=new TreeSet<String>();
	 TS.add("231");
	 TS.add("21");
	 TS.add("19");
	 TS.add("2312");
	 TS.add("1");
	 TS.add("23");
	 TS.add("2341");
	 
	 for (String S : TS) 
	 {
	   System.out.println(S);	
	 }
	 
	 
 }
}
