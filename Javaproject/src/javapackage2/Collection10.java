package javapackage2;

import java.util.HashMap;
import java.util.Set;


// The key and values

public class Collection10 
{
  public static void main(String[] args) 
  {
 	 HashMap<String, String> Hm=new HashMap<String, String>();  
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
