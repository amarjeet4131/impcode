package TestProg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class digitToWord {

	public static void main(String[] args) {

		int dd = 245;
		// int len=Integer.toString(dd).length();
		// String wordVlaue[]= new String [len];
		List<String> wlist = new ArrayList<>();
		int remainder = 0;
		String Inword = "";
		Map<Integer, String> d2w = new HashMap<>();
		d2w.put(0, "Zero");
		d2w.put(1, "One");
		d2w.put(2, "Two");
		d2w.put(3, "Three");
		d2w.put(4, "Four");
		d2w.put(5, "Five");
		d2w.put(6, "Six");
		d2w.put(7, "Seven");
		d2w.put(8, "Eight");
		d2w.put(9, "Nine");
		

		while (dd > 0) {
			remainder = dd % 10;
			if (d2w.containsKey(remainder))
				// Inword=Inword+" "+d2w.get(remainder);
				wlist.add(d2w.get(remainder));
			dd = dd / 10;

		}

		System.out.println("wordList= " + wlist);
		int wlen = wlist.size();
		
		switch (wlist.get(1)) {

		case "Zero":
			wlist.set(1, "");
			break;
		case "Two":
			wlist.set(1, "Twenty");
			break;
		case "Three":
			wlist.set(1, "Thirty");
			break;
		case "Four":
			wlist.set(1, "Fourty");
			break;
		case "Five":
			wlist.set(1, "Fifty");
			break;
		case "Six":
			wlist.set(1, "Sixty");
			break;
		case "Seven":
			wlist.set(1, "Seventy");
			break;
		case "Eight":
			wlist.set(1, "Eighty");
			break;
		case "Nine":
			wlist.set(1, "Ninety");
			break;
		case "One": {
			switch (wlist.get(0)) {

			case "Zero": {
				wlist.set(1, "Ten");
				wlist.set(0, "");
				break;
			}
			case "Two": {
				wlist.set(1, "Twelve");
				wlist.set(0, "");
				break;
			}
			case "Three": {
				wlist.set(1, "Thirteen");
				wlist.set(0, "");
				break;
			}
			case "Four": {
				wlist.set(1, "fourteen");
				wlist.set(0, "");
				break;
			}	
			case "Five":{
				wlist.set(1, "fifteen");
				wlist.set(0, "");
				break;
			}	
			case "Six":{
				wlist.set(1, "sixteen");
				wlist.set(0, "");
				break;
			}	
			case "Seven":{
				wlist.set(1, "Seventeen");
				wlist.set(0, "");
				break;
			}	
			case "Eight":{
				wlist.set(1, "Eighteen");
				wlist.set(0, "");
				break;
			}	
			case "Nine":{
				wlist.set(1, "Nineteen");
				wlist.set(0, "");
				break;
			}	
			case "One":{
				wlist.set(1, "Eleven");
				wlist.set(0, "");
				break;
			}	
			}
			;
			
			

		}

		}
		for (int i = 0; i < wlen; i++) {
			System.out.println("Inword= " + wlist.get(i));
		}

		// TODO Auto-generated method stub
		System.out.println(wlist.get(2)+" hundread "+wlist.get(1)+" "+wlist.get(0));

	}

}
