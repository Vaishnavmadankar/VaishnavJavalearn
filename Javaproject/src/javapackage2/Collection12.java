package javapackage2;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Collection12 
{
	public static void main(String[] args) 
	  {
	 	 TreeMap<String, String> Hm=new TreeMap<String, String>();  
	 	 Hm.put("Deepak", "Teacher");
	 	 Hm.put("Channna", "TEACH");
	 	 Hm.put("Id", "RN02");
	 	 Hm.put("Designation", "TL");
	 	 
	 	Set<String> Allkey = Hm.keySet();
	 	
	 	for (String S : Allkey) 
	 	{
		  System.out.println("The Key Names Are "+S);
		  System.out.println("The Keyvalues Are "+Hm.get(S) );
		}
	 	 
	  }
}
