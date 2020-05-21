package practise;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Hackerrank {
	
	 /* * Complete the 'goodSegment' function below. * * 
	The function is expected to return an INTEGER. * 
	The function accepts following parameters: *  1. INTEGER_ARRAY badNumbers *  2. INTEGER lower *  3
	. INTEGER upper */ 
	public int goodSegment(List<Integer> badNumbers, int lower, int upper) 
	
	{ 
		@SuppressWarnings("rawtypes")
		ArrayList<ArrayList> list = new ArrayList<>(); 
		int max=0; 
	
		Collections.sort(badNumbers); 
		int j=0; 
		int i=lower;
		while(i<=upper)
		{
			ArrayList<Integer> list1 = new ArrayList<>();
			for(int d=i;d<=badNumbers.get(j);d++) 
			{
				
			if(!(badNumbers.get(j).equals(d))) 
			 { 
				list1.add(d); 
		     } 
		
			else 
			 { 
				list.add(list1);
				
			 }
			
		    
			}
			
			i=badNumbers.get(j)+1;
			j++; 
		  } 
		
		
		for(int s=0;s<list.size();s++) 
		{ 
			int size = list.get(s).size(); 
			// System.out.println(size); 
		if(size>max) 
		{ 
			max=size;  
		} 
		}
		System.out.println(list);
		return max; 
		
	} 
	
} 
		
