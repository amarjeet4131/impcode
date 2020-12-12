package TestProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicateWord2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "My Name is Amar is a good Name";
		String[] strArray=str.split(" ");
		List<String> gfg = new ArrayList<>( 
	            Arrays.asList("Geeks", 
	                    "for", 
	                    "Geeks")); 
		
	
		System.out.println("Check duplicate in list="+gfg.contains("for"));
	
		
		  HashMap<String,Integer> wordCountMap = new HashMap<>();
		  for (int i = 0; i < strArray.length; i++) {
		   String  cs = strArray[i];
		 
		   if (wordCountMap.containsKey(cs)) {
		    wordCountMap.put(cs, wordCountMap.get(cs) + 1);
		   } else {
		    wordCountMap.put(cs, 1);
		   }
		 
		  }
		  for (String c : wordCountMap.keySet()) {
		 //  if (wordCountMap.get(c) > 1)
		    System.out.println("duplicate character : " + c + " ====== " + " count : " + wordCountMap.get(c));
		 
		  }
		  
		  Set<String> store = new HashSet<>(); 
		  for (String name : strArray)
		  { if (store.add(name) == false) 
		  { System.out.println("found a duplicate element in array : " + name); } }

		  

	}

}
