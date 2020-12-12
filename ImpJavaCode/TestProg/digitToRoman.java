package TestProg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class digitToRoman {

	public static void main(String[] args) {
		
	//	List<String>Rlist= new ArrayList<>();
		String[] roman={"I","V","X","L","C","M"};
		Map<Integer,String>numtoRoman =new HashMap<>();
		numtoRoman.put(1, "I");
		numtoRoman.put(2, "II");
		numtoRoman.put(3, "III");
		numtoRoman.put(4, "IV");
		numtoRoman.put(5, "V");
		numtoRoman.put(6, "VI");
		numtoRoman.put(7, "VII");
		numtoRoman.put(8, "VIII");
		numtoRoman.put(9, "IX");
		numtoRoman.put(10, "X");
	
		int num=45;
		List<Integer>nList= new ArrayList<>();
		
		while(num>0){
			nList.add(num%10);
			num=num/10;
			
		}
		String s="";
		String s10="";
		String s100="";
		for(int i=0;i<nList.size();i++){
			if(i==0)
			s=s+numtoRoman.get(nList.get(i));
			if(i==1){
				if(nList.get(i)>=1 && nList.get(i)<=3||nList.get(i)>=6 && nList.get(i)<=8){
					for(int j=0;j<nList.get(i);j++)
						s10=s10+numtoRoman.get(10);
					if(nList.get(i)>=6)
						s10=roman[3]+s10;
				}
				if(nList.get(i)==4)
					s10=numtoRoman.get(10)+roman[3];
				if(nList.get(i)==5)
					s10=roman[3];
				
			}
			if(i==2){
				if(nList.get(i)>=1 && nList.get(i)<=3||nList.get(i)>=6 && nList.get(i)<=8){
					for(int j=0;j<=nList.get(i);j++)
						s10=s10+numtoRoman.get(10);
					if(nList.get(i)>=6)
						s10=roman[1]+s10;
				}
				if(nList.get(i)==4)
					s10=numtoRoman.get(10)+roman[1];
				if(nList.get(i)==5)
					s10=roman[1];
				
			}
		}
			
		
	System.out.println(s10+s);	
}
}
