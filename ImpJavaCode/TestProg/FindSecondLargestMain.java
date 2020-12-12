package TestProg;

import java.util.Arrays;

public class FindSecondLargestMain {
	public static void main(String args[])
	{
		int[] arr1={7,5,6,1,4,2};
	//	int secondHighest=findSecondLargestNumberInTheArray(arr1);
	
		int secondHighest = Integer.MIN_VALUE;
		System.out.println("Second largest element in the array : "+ secondHighest);
		//System.out.println("Second largest element in the array : "+ highest);
		int l=arr1.length-2;
		
	;
		int k=	Arrays.stream(arr1).sorted().skip(2).findFirst().getAsInt();
		//forEach(x->System.out.println("value = "+x));
		System.out.println(k);
	
		
	}

	
}