package javapackage2;

import java.util.HashSet;

// In Hashset duplicate not allowed & Output not given in order


public class Collection4 
{
 public static void main(String[] args) 
 {
	HashSet<String> HS=new HashSet<String>();
	HS.add("2322");
	HS.add("23");
	HS.add("23122");
	HS.add("2332");
	HS.add("4224");
	HS.add("23");
	HS.add("424");
	HS.add("412");
	
	for (String s : HS) {
     
		System.out.println(s);
	}
	
 }
}
