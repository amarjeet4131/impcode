package Test;

import java.util.OptionalInt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Regexp {

	public static void main(String[] args) {
		
		String s= new String();
		System.out.println("resut");
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches(".s", "as"));// true (2nd char is s)
		System.out.println(Pattern.matches(".s", "mk"));// false (2nd char is
														// not s)
		System.out.println(Pattern.matches(".s", "mst"));// false (has more than
															// 2 char)
		System.out.println(Pattern.matches(".s", "amms"));// false (has more
															// than 2 char)
		System.out.println(Pattern.matches("..s", "mas"));// true (3rd char is
															// s)
		System.out.println(Pattern.matches("..s", "mas"));// true (3rd char is
															// s)
		System.out.println("---------------");
		System.out.println(Pattern.matches("[a-z]+", "mas"));// true (3rd char
																// is s)
		System.out.println(Pattern.matches("\\D+", "a"));// true (a or m or n
															// once or more
															// times)
		System.out.println(Pattern.matches("..ster", "master"));// true (3rd
																// char is s)
		System.out.println("---------------");
		System.out.println(Pattern.matches("geeks", "geeksforgeeks"));
		// Following line prints "false" because the whole
		// text "geeksfor" doesn't match pattern "g*geeks*"
		System.out.println(Pattern.matches("g*geeks*", "geeksfor"));
		
		Pattern pattern = Pattern.compile("geeks"); 
		  
        // Search above pattern in "geeksforgeeks.org" 
        Matcher m = pattern.matcher("geeksforgeeks.org"); 
  
        // Print starting and ending indexes of the pattern 
        // in text 
        while (m.find()) 
            System.out.println("Pattern found from " + m.start() + 
                               " to " + (m.end()-1)); 
        System.out.println("------check---------");
    	System.out.println(Pattern.matches("[aeiou]", "a"));
    //----program to remove vowel or cosonant from sentence----method 1----	
    	String rline= "this is to check remove of vowel";
  
    	String s1="";
    	for (int i=0;i<rline.length();i++){
    		if(!Pattern.matches("[aeiou]", rline.substring(i, i+1))){
    			s=s+rline.substring(i, i+1);
    		}
    	}
System.out.println("Sentence without vowel ="+s);

//----program to remove vowel or cosonant from sentence----method 2----	
// using stream
  String ss=rline.chars().mapToObj(c -> (char) c).filter(x->!Pattern.matches("[aeiou]", String.valueOf(x)))
     .map(c->c.toString()).collect(Collectors.joining());;
     System.out.println("Sentence without vowel using stream ="+ss);
     
   //----program to remove vowel or cosonant from sentence----method 3----	
     
     rline.replaceAll("[BCDFGHJKLMNPQRSTVXZbcdfghjklmnpqrstvxz]", ""); 
  


	}
	 
	  
}
