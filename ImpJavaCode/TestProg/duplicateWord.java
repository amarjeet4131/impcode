package TestProg;

import java.util.HashMap;

public class duplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "My Name is Amar is a good Name";
		String[] strArray=str.split(" ");
		
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

	}

}
