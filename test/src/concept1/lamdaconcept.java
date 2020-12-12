package concept1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class lamdaconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer,Integer> func=(x)->x+x;
		
		Function<String,Integer> func1=(x)->{String s="amar"+x;
		return s.length();};
		
		int i=func.apply(5);
		int s1=func1.apply("Amarjeet");
		System.out.println("value ="+i);
		System.out.println("value ="+s1);
		List<String> langList =Arrays.asList("java","python","javaScript");
		langList.replaceAll(ele->ele+"-Amar");
		System.out.println("updated list ="+langList);
		//---pradicate with nagate---
		Predicate<String>pfunc=x->x.startsWith("java");
		
		List<String> lList=langList.stream().filter(x->x.startsWith("java")).collect(Collectors.toList());
		System.out.println("updated list= "+lList);
		
		langList.forEach(x->System.out.println("X= "+x));
		langList.forEach(System.out::println);
	}

}
