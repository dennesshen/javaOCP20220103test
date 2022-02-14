package stydy.ocp.day11;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class SetDemo3 {
	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>(); 
		set.add(100);
		set.add(null);
		set.add(90);
		set.add(80);
		
		Integer sum2 = set.stream().filter(p -> p instanceof Integer)
				 				   .mapToInt(Integer::intValue)
				 				   .sum();
		System.out.println(sum2);
		
	}

}
