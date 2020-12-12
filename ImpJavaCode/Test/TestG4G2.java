package Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class TestG4G2 {

	

	public static int isSum(int n[],int ss) {
		
		int calc=n[0];
		int substrLength=0;
		Map<Integer,Integer> submap= new HashMap<>();
		
		for(int i=0;i<n.length;i++){
			
			
			calc=calc+n[i];
			if(calc%ss!=0)
				substrLength=i;
				calc=calc+n[i];
				
			
		}
		
		
		for(int i=0;i<substrLength;i++){
			System.out.println(n[i]);
		}
		return substrLength>0?substrLength:-1;
	}

	public static void main(String[] args) {
		
		
	//	int[]aa={2,4,5,6,7,4};
		int[]aa={2,5,6,7,4,9,3,1,8};
		int d=11;
		
		//System.out.println("Check on array = "+isSubStr(aa,d));
	}

}
