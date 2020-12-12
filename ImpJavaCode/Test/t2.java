package Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class t2 {

	public static void main(String[] args) {

		List<String> aList = Arrays.asList("Amaar", "jeet", "tt", "YY", "JJ", "GG");
		System.out.println("Before = " + aList);
		Collections.shuffle(aList);
		System.out.println("After = " + aList);
		// List<String> blist=
		Collections.swap(aList, 1, 3);// unmodifiableList(aList);
		System.out.println("Before = " + aList);
		System.out.println("Count " + Collections.frequency(aList, "tt"));
		// System.out.println("Count "+Collections.max(aList, comp));

		// find max or min
		Comparator<String> c = new Comparator<String>() 
        { 
            public int compare(String  u1, String u2) 
            { 
                return u1.length()-u2.length();
            } 
        }; 
        
       
        System.out.println("Max " + Collections.max(aList, c)) ; 
        System.out.println("min " + Collections.min(aList, c)) ; 

		String s1 = "Amar";
		String s2 = new String("Amar");

		System.out.println(s1 == s2 + "---" + s1.equals(s2));
		System.out.println(s1.equals(s2));

		int[] arr = new int[] { 1, 3, 4, 5, 6 };

		// 2 has to be inserted
		int pos = Arrays.binarySearch(arr, 3);
		System.out.print("Element has to be inserted at: " + ~pos);
		// swaping without third
		int a = 10;
		int b = 20;
		a ^= b;
		b ^= a;
		a ^= b;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// No. of digits in N = Math.floor(Math.log10(N)) + 1;
		int k = 67667731;

		System.out.println("Number of digit in given number= " + (Math.floor(Math.log10(k)) + 1));
		// binary search

		char charArr[] = { 'g', 'p', 'q', 'c', 'i' };
		int intArr[] = { 10, 20, 15, 22, 35 };
		Arrays.sort(charArr);
		Arrays.sort(intArr);
		
		System.out.println("after sort = " +Arrays.toString(charArr));
		char charKey = 'g';
		int intKey = 22;
		System.out.println(charKey + " found at index = " + Arrays.binarySearch(charArr, charKey));
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));

	}

}
