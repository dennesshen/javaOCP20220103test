package stydy.ocp.day13;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeExam2 {

	public static void main(String[] args) {
		Map<Employee, Integer> emps = new TreeMap<>();
		emps.put(new Employee("A", "Aa", 100), 101);
		emps.put(new Employee("B", "Bb", 200), 102);
		emps.put(new Employee("C", "Cc", 300), 103);
		emps.put(new Employee("Cc", "C", 300), 103);
		System.out.println(emps);
		
	}

}
