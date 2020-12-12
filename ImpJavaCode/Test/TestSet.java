package Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String>  obj1= new HashSet<String>();
        obj1.add("Alive");
        obj1.add("is");
        obj1.add("Awesome");
        obj1.add("tte");
        obj1.add("ooe");
        System.out.println(obj1);    
        
        Set<String>  obj2= new TreeSet<String>();
        obj2.add("Alive");
        obj2.add("is");
        obj2.add("Awesome");
        obj2.add("tte");
        obj2.add("ooe");
        System.out.println(obj2);    
        
        
        Map<String, Integer> ages = new HashMap<>();
        ages.put("John", 25);
        ages.put("Freddy", 24);
        ages.put("Samuel", 30);
         
        ages.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));
    List<Integer> ll=    IntStream.of(5, 13, 4, 21, 13, 27, 2, 59, 59).distinct().peek(System.out::println).boxed().collect(Collectors.toList());
       // IntStream.of(5, 13, 4, 21, 13, 27, 2, 59, 59).forEach(x->System.out.println(x+" count ="+Collections::frequency()));
   // List<Integer> ll1=    IntStream.of(5, 13, 4, 21, 13, 27, 2, 59, 59).distinct().peek(System.out::println).boxed().m .collect(toList());
    
    System.out.println(ll);
        
        

	}

}
