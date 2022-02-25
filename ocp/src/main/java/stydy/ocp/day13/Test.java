package stydy.ocp.day13;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<String, Integer> testMap = new HashMap<String, Integer>();
		testMap.put("B", 10);
		testMap.put("A", 10);
		testMap.put("C", 10);
		System.out.println(testMap);
	}

}
