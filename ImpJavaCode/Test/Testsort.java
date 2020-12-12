package Test;

import java.util.Arrays;

public class Testsort {

	public static void nthmax(int[] aa, int n) {

		for (int i = 0; i < aa.length; i++) {
			for (int j = i; j < aa.length; j++) {
				if (aa[i] > aa[j]) {
					int k = aa[i];
					aa[i] = aa[j];
					aa[j] = k;
				}
			}
		}

		for (int j : aa)
			System.out.println(j);

		System.out.println(aa[aa.length - 3]);

	}

	public static void main(String[] args) {

		int[] aa = { 2, 4, 5, 7, 1, 9,6,10 };
		nthmax(aa, 3);
		// TODO Auto-generated method stub
		
		int s=Arrays.stream(aa).sorted()//.limit(aa.length-1-3)
				.skip(aa.length-3).findFirst().getAsInt();
		
		System.out.println("Nth largest = "+s);
		Arrays.stream(aa).sorted().skip(4).peek(x->System.out.println("value are = "+x)).findFirst().getAsInt();
		Arrays.stream(aa).sorted().limit(4).peek(x->System.out.println("value are = "+x)).findFirst().getAsInt();
		Arrays.stream(aa).sorted().skip(4).forEach(x->System.out.println("value are = "+x));
		Arrays.stream(aa).sorted().limit(4).forEach(x->System.out.println("value are = "+x));

	}

}
