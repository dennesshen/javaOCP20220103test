package stydy.ocp.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeExam {

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("1", "B", 200));
		emps.add(new Employee("2", "B", 500));
		emps.add(new Employee("3", "A", 300));
		emps.add(new Employee("4", "A", 200));
		emps.add(new Employee("5", "C", 100));
		emps.add(new Employee("6", "C", 200));
		
		Map<String, Optional<Employee>> map1;
		//  map contain the employee with the highest salary for each neighborhood?
		// 要顯示每一組(根據neighborhood分組)的 salary 的最大值
		// 結果: Employee("2", "B", 500), Employee("3", "A", 300), Employee("6", "C", 200)
		map1 = emps.stream()
		          .collect(Collectors.groupingBy(Employee::getNeighborhood, 
		    		       Collectors.maxBy(Comparator.comparing(Employee::getSalary))  ));
		System.out.println(map1);
		System.out.println(emps.stream().collect(Collectors.groupingBy(Employee::getNeighborhood)));
		
		String[] arr = {"aa", "ccc", "sss"};
		List<String> list = Arrays.stream(arr).collect(Collectors.toList());
		System.out.println(list);
		
		Map<String, Integer> map2 = emps.stream().collect(()-> new HashMap<String, Integer>(), 
														  (map, p) -> map.put(p.getName(), p.getSalary()),
														  (map, n) -> map.putAll(n));
		System.out.println(map2);
	} 

}
