package javapackage2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

// it will give output in Order

public class Collection11 
{
	public static void main(String[] args) 
	  {
	 	 LinkedHashMap<String, String> Hm=new LinkedHashMap<String, String>();  
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
