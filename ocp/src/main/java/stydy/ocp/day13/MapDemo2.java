package stydy.ocp.day13;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("國文", 100);
		map.put("數學", 90);
		map.put("英文", 100);
		map.put("數學", 80);// key值存在時會覆蓋
		map.putIfAbsent("英文", 95);// KEY值存在時不存入
		System.out.println(map);
		
		Set<String> Keys = map.keySet();
		Collection<Integer> values = map.values();
		Set<Entry<String, Integer>> entries = map.entrySet();

		System.out.println(Keys);
		System.out.println(values);
		System.out.println(entries);
		
		//輪巡 透過Key值取得value
		for(String key : Keys) {
			System.out.println(key + "=" + map.get(key));
		}
		
		//輪巡 透過EntrySet值取得value
		
		for(Entry<String, Integer> entry : entries ) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		////輪巡 透過java8值取得value
		
		map.entrySet().stream().forEach(System.out::println);
		
		
	}

}
