package stydy.ocp.day05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(Integer.valueOf(100));
		nums.add(80);
		nums.add(90);
		System.out.println(nums);
		
		List<Integer> order_nums =  nums.stream()
										.sorted()
										.collect(Collectors.toList());
		System.out.println(order_nums);
		
		List<Integer> reverseOrder_nums =  nums.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(reverseOrder_nums);
		
	}

}
