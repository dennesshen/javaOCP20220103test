package stydy.ocp.day13;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;


public class MapDemo3 {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "apple", "banana", "orange", "orange", "apple", "papaya", "watermelon");
		
		Map<String, Long> result = fruits.stream().collect(groupingBy(e->e, counting()));
		result.entrySet().stream().sorted(Entry.comparingByValue()).forEach(System.out::println);;
	}

}
