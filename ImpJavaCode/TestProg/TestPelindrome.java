package TestProg;

public class TestPelindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int peli= 123321,remainder=0,remain=0;int sum=0;
       while(peli>0){
    	   remainder=peli%10;
    	   sum=sum*10+remainder;
    	   remain=peli/10;
    	   peli=remain;
    	   //peli=peli/10;
    	   
       }
       System.out.println("new values "+sum);
       
       if(sum==peli)
    	   System.out.println("Is pelindrom = "+sum);
       
       
       String s="asdfdsa";
       boolean isPalindrome= true;
       for(int i=0;i<=s.length()/2;i++){
    	   if(s.charAt(i)!=s.charAt(s.length()-1-i)){
    		   isPalindrome=false;
    		   break;
    	   }
    	   
       }
       if(isPalindrome)
   		System.out.println("Ispalindrom"+isPalindrome);
   	else
   		System.out.println("Ispalindrom"+isPalindrome);	
	}

}
