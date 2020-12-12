package Test;

import java.util.Arrays;
import java.util.function.Predicate;

public class TestPrime {

	public static boolean isPrime(int n) {

		boolean t = true;

		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				t = false;
		}
		return t;
	}

	public static boolean isPalingdrome(String n) {

		boolean t = true;
		//System.out.println("n = " + n);
		int l=n.length();
		for(int i=0;i<l/2;i++){
			if(n.charAt(i)!=n.charAt(l-1-i))
				t=false;
		}
		/*---2nd method--------------
		StringBuilder sb = new StringBuilder(n).reverse();
		System.out.println("sb = " + n);
		if (sb.toString().equals(n))
			t = true;
        */
		return t;
	}

	public static void main(String[] args) {

		int[] aa = { 2, 5, 6, 7, 9, 11 };

		String[] ss ={ "abcdcba","aa","fdsffsdf","dfdfdf"};
		Arrays.asList(ss).stream().filter(s->TestPrime.isPalingdrome(s)).forEach(System.out::println);
	//	if(isPalingdrome(ss))
	//		System.out.println("Palingdrome = " + ss);
		
		
		for (int k : aa) {
			if (isPrime(k))
				System.out.println("Prime number = " + k);
		}

		Arrays.stream(aa).filter(x -> !TestPrime.isPrime(x)).forEach(System.out::println);

	}

}
