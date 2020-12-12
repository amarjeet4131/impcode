package Test;
import java.util.Arrays;
import java.util.List;

public class TTT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;
		int b=20;
		
		a=a+b;//a=30 (10+20)    
		b=a-b;//b=10 (30-20)    
		a=a-b;//a=20 (30-10)    
		System.out.println(a);
		System.out.println(b);
		
		List<String> ll= Arrays.asList("amar","jeet","kunmar","Singh");
		ll.stream().filter(s->s.length()>4).peek(System.out::println).count();
		
		int c = 5;
		int d = 0;
		
		try{
			int f=c/d;
		}catch(Exception e){
			System.out.println("exception details "+e.getMessage());//+" == "+e.printStackTrace());
			
		}
		
	
		

	}

}
