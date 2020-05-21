package practise;

import java.util.ArrayList;

//import java.util.LinkedList;
import java.util.List;

public class HackerrankRunner {

	public static void main(String[] args) {
		
		Hackerrank run = new Hackerrank();
		List<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(22);
		list.add(15);
		list.add(30);
		list.add(45);
		list.add(60);
		
			
		System.out.println(run.goodSegment(list,3,48));
		
		
		
	}

}
