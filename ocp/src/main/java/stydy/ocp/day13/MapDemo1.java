package stydy.ocp.day13;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;



public class MapDemo1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("A", 60);
		map.put("B", 58);
		map.put("C", 72);
		map.put("D", 80);
		map.put("E", 23);
		System.out.println(map);
		
		String result = map.entrySet().stream()
									  .filter(e -> e.getValue()>=60)
									  .map(Entry::getKey)
									  .collect(Collectors.joining(","));
		System.out.println("合格科目有:"+ result);
				
		
		
		// Map > stream -> filter -> Map part I
		Map<String, Integer> passMap = map.entrySet()
				.stream()
				.filter(x -> x.getValue() >= 60)
				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
		System.out.println(passMap);
		
		// Map > stream -> filter -> Map part II
		Map<String, Integer> passMap2 = map.entrySet()
				.stream()
				.filter(x -> x.getValue() >= 60)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(passMap2);
	}

}
