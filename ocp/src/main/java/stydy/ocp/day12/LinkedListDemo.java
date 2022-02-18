package stydy.ocp.day12;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		List<String> strList = new LinkedList<>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		System.out.println(strList);
		strList.remove("A");
		System.out.println(strList);
		
		List<Integer> intList =new LinkedList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		System.out.println(intList);
		intList.remove(Integer.valueOf(1));
		System.out.println(intList);
	}
}
