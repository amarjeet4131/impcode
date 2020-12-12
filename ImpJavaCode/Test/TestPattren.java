package Test;

import java.util.Arrays;
import java.util.function.Predicate;

public class TestPattren {

	

	public static void main(String[] args) {
		
		int k=15;
		
	/*	for(int h=0;h<=i;h++){
			for(int j=0;j<=i-h;j++){
				
				System.out.print(h);
			}
			System.out.println();
			
				for(int j=0;j<=h;j++){
				
				System.out.print(" ");
			}
			
		} */
		
		for(int i=0;i<=k;i++){
			for(int j=0;j<=k;j++){
				if(j>=i)
					System.out.print(i);
				else
					System.out.print(" ");
			}
			System.out.println();
			}
		
		
	}

}
