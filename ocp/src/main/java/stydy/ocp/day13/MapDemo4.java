package stydy.ocp.day13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import stydy.ocp.day05.Person;

public class MapDemo4 {

	public static void main(String[] args) {
		List<Fruit> fruits = Arrays.asList(
				new Fruit("apple",  10, 10), // 一箱水果
				new Fruit("banana", 10, 15),
				new Fruit("papaya", 15, 15),
				new Fruit("orange", 10, 20),
				new Fruit("melon",  40, 20),
				new Fruit("apple",  15, 10),
				new Fruit("apple",  20, 10),
				new Fruit("banana", 25, 15),
				new Fruit("orange", 30, 20));
	
		Map<String, Long> result = fruits.stream()
										 .collect(Collectors.groupingBy(Fruit::getName, Collectors.counting()));
										 
		System.out.println(result);
		
		Map<String, Integer> result2 = fruits.stream()
		 .collect(Collectors.groupingBy(Fruit::getName, Collectors.summingInt(Fruit::getQty)));
		 
		System.out.println(result2);
		
		Map<Integer, Set<String>> result3 = fruits.stream()
		 .collect(Collectors.groupingBy(Fruit::getPrice, Collectors.mapping(Fruit::getName, Collectors.toSet())));
		result.entrySet().stream().sorted(Entry.comparingByKey());
		System.out.println(result3);
		
		Map<String, Integer> result4 = fruits.stream()
				 .collect(Collectors.groupingBy(Fruit::getName, Collectors.summingInt(f -> f.getQty()*f.getPrice())));
				 
				System.out.println(result4);
	}

}
