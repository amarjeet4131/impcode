package test;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello");

//String jpath= "{"per_page":3,"total":12,"data":[{"last_name":"Bluth","id":1,"avatar":"https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg","first_name":"George","email":"george.bluth@reqres.in"},{"last_name":"Weaver","id":2,"avatar":"https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg","first_name":"Janet","email":"janet.weaver@reqres.in"},{"last_name":"Wong","id":3,"avatar":"https://s3.amazonaws.com/uifaces/faces/twitter/olegpogodaev/128.jpg","first_name":"Emma","email":"emma.wong@reqres.in"}],"page":1,"total_pages":4}";
//for(String s : jpath.split("/")) 
	System.out.println("Amarjeet Singh"+"-->"+" I Love Coding"+"  consistency"); 
	int[] arrayOfInts = {1, 1, 1, 2, 2, 3, 4, 4, 6, 6, 5, 5, 5, 5};
    Map<Integer, Long> collect = Arrays.stream(arrayOfInts)
            .boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    collect.forEach((integer, aa) -> System.out.println(integer + "->" + aa));

//List<String> strings = List.of("a", "bb", "cc", "ddd"); 
//Map<Integer, List<String>> result = strings.stream() 
//  .collect(groupingBy(String::length)); 
//System.out.println(result); // {1=[a], 2=[bb, cc], 3=[ddd]}
    LocalTime specificTime = LocalTime.of(12,20,25,40);
    System.out.println("Specific Time of Day="+specificTime);

	

}
}