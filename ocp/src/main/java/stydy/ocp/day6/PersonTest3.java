package stydy.ocp.day6;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PersonTest3 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Student s1 = new Student("Vincent", 18, 100);
		Student s2 = new Student("Helen", 19, 75);
		Student s3 = new Student("Bobo", 18, 80);
		Teacher t1 = new Teacher("Anita", 30, 70000);
		Teacher t2 = new Teacher("Jane", 28, 65000);
		
		ArrayList<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(s1);
		persons.add(s2);
		persons.add(s3);
		persons.add(t1);
		persons.add(t2);
		
		//排除異常資料的filter 
		Predicate<Person> notNullFilter = p -> (p.getName() != null && p.getAge() != null );
		//請問平均年齡
		double avgOfAge = persons.stream().filter(notNullFilter)
										  .mapToInt( p -> p.getAge())
										  .average()
										  .getAsDouble();
		System.out.println(avgOfAge);
		
//		System.out.println(s1.getClass().toString());
//		System.out.println(s1.getClass().getName());
//		System.out.println(s1.getClass().getSimpleName());
		
		//請問平均分數
		double avgOfScore = persons.stream().filter(notNullFilter)
										    .filter(p -> p.getClass().getSimpleName().equals("Student"))
										    .map(p -> (Student)p )
										    .mapToInt(p -> p.getScore()).average().getAsDouble();
		System.out.println(avgOfScore);
		
		//請問平均薪資
		double avgOfSalary = persons.stream().filter(notNullFilter)
											 .filter(p -> p.getClass().getSimpleName().equals("Teacher"))
											 .map(p -> (Teacher)p)
											 .mapToInt(p ->  p.getSalary())
											 .peek(System.out::println)
											 .average().getAsDouble();
		System.out.printf("平均薪資為%.1f\n", avgOfSalary);
		// 請問姓名總字數 = ?
		
		int count = persons.stream().filter(notNullFilter)
									.map(p -> p.getName())
									.mapToInt(String::length)
									.sum();
		System.out.println(count);
		
	}
}
