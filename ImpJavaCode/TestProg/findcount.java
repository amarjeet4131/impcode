package TestProg;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class findcount {

	public static void main(String[] args) {
		
		int array[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
		Map<Integer,Integer>hmap= new HashMap<>();
		int count=1;
		for(int i=0;i<array.length;i++){
			if(hmap.containsKey(array[i])){
				hmap.put(array[i], hmap.get(array[i])+1);	
			}
				
			else
				hmap.put(array[i], count);
				
		}

		for(Entry<Integer, Integer> ee :hmap.entrySet()){
			
			if(ee.getValue()%2!=0)
				System.out.println(ee.getKey()+"=="+ee.getValue());
			
		}
// TODO Auto-generated method stub

	}

}
