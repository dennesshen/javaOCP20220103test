package stydy.ocp.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StackDemo {
	public static void main(String[] args) {
		List<Integer> score = Arrays.asList(10, 8, 7, 6, 5, 9, 9, 4, 8, 7);
		System.out.println(score);
		Collections.sort(score);
		
		//轉為可變動list
		List<Integer> list = new ArrayList<Integer>(score);
		list.remove(0);
		list.remove(0);
		list.remove(list.size()-1);
		list.remove(list.size()-1);
		System.out.println(list);
		Double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println(avg);
		
		
	}

}
