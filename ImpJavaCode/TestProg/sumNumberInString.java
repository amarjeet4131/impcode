package TestProg;

import java.util.HashMap;

public class sumNumberInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "My1Name25is6Amar78";
		int sum=0;
		String s=str.replaceAll("[a-zA-Z]", "");
		System.out.println("original Strnig ="+str);
		System.out.println("new Strnig ="+s);
		for(Character c:s.toCharArray())
			sum=sum+Character.getNumericValue(c);
		System.out.println("Sum of integer in string = "+sum);
	int sum1=str.chars().filter(Character::isDigit).boxed().mapToInt(Character::getNumericValue).reduce((p,r)->p+r).getAsInt();
	int sum2=str.chars().filter(Character::isDigit).mapToObj(Character::getNumericValue).reduce((p,r)->p+r).get();
	System.out.println("Sum1 of integer in string = "+sum2);
	}

}
