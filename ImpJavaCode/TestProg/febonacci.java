package TestProg;

public class febonacci {
	public static void main(String[] args) {
		
		int num1=0;int num2=1;int k=0;int sum=0;
		while(k<10){
			sum=num2+num1;
			num1=num2;
			num2=sum;
			System.out.println("Sum = "+sum);
			k++;}
	}

}
