package stydy.ocp.day11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {

		Set set1 = new HashSet(); 
		set1.add("國文");
		set1.add(100);
		set1.add("英文");
		set1.add(90);
		set1.add("數學");
		set1.add(91);
		System.out.println(set1);
		Iterator iter = set1.iterator();
		
		Integer sum1 = 0;
		while(iter.hasNext()) {
			Object object = iter.next();
			System.out.printf("%s %s\n", object, 
					object==null?null:object.getClass());
			if (object  == null) {
				continue;
			}
			if (object.getClass() == Integer.class ) {
				sum1 += (Integer)object;
			}
		}
		System.out.println(sum1);
		
		Integer sum2 = set1.stream().filter(p -> p instanceof Integer)
					 .mapToInt(p -> (Integer)p).sum();
		System.out.println(sum2);
		
	}

}
