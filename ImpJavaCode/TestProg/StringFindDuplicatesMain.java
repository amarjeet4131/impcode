package TestProg;
import java.util.HashMap;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
 
public class StringFindDuplicatesMain {
 
 public static void main(String[] args) {
  String str = "java2blog.com ";
  HashMap<Character,Integer> charCountMap = new HashMap<>();
  for (int i = 0; i < str.length(); i++) {
   char c = str.charAt(i);
 
   if (charCountMap.containsKey(c)) {
    charCountMap.put(c, charCountMap.get(c) + 1);
   } else {
    charCountMap.put(c, 1);
   }
 
  }
  for (Character c : charCountMap.keySet()) {
   if (charCountMap.get(c) > 1)
    System.out.println("duplicate character : " + c + " ====== " + " count : " + charCountMap.get(c));
 
  }
  
  String str11="rwer2434";
  String s1="rwer2434";
 CharSequence ss1= s1.subSequence(0, 3);
String s4=  s1.substring(0, 3);
  System.out.println(s1.subSequence(0, 3));
  System.out.println(s1.substring(0, 3));

 str11.chars().filter(c->!Character.isDigit(c)).mapToObj(c->(char)c).forEach(System.out::print);
 
 str11.replaceAll("[a-zA-Z]", "");
 System.out.println("only digit ="+ str11.replaceAll("[a-zA-Z]", ""));
 System.out.println("only digit ="+ str11.replaceAll("[^a-zA-Z]", ""));
 StringBuilder sb=new StringBuilder();
 String s5="fgfgdfg";
 s5.chars().mapToObj(c -> (char) c).distinct().forEach(System.out::print);
//String k=s5.chars().mapToObj(c ->String.valueOf((char)c)).distinct().reduce((s,r)->s+r);//forEach(System.out::print);
//System.out.println("k= "+k);

  }
}
  //Character.isDigit(str11.charAt(0))]]
		  