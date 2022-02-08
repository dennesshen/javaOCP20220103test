package stydy.ocp.day5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class personTest {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				 	new Person("Antonio", 20, Gender.male),
			        new Person("Alina Smith", 33, Gender.female),
			        new Person("Helen White", 57, Gender.female),
			        new Person("Alex Boz", 14, Gender.male),
			        new Person("Jamie Goa", 99, Gender.male),
			        new Person("Anna Cook", 7, Gender.female),
			        new Person("Zelda Brown", 120, Gender.female)
		);
		
		//filter 使用
		List<Person> females = persons.stream()
									  .filter(p -> p.getGender().equals(Gender.female))
									  .collect(Collectors.toList());
		females.forEach(System.out::println);
		
		System.out.println("---------------------------------------------------------");
		//Match -> 1.allMatch 2.anyMatch 3.noneMatch
		System.out.println( persons.stream().allMatch(p -> p.getAge() > 8 ));
		System.out.println( persons.stream().anyMatch(p -> p.getAge() > 8 ));
		System.out.println( persons.stream().noneMatch(p -> p.getAge() > 121 ));

		System.out.println("---------------------------------------------------------");

		//Max and min
		persons.stream()
			   .max(Comparator.comparing(Person::getAge))
			   .ifPresent(System.out::println);
		
		Optional<Person> optPerson = persons.stream().min(Comparator.comparing(Person::getAge));
		System.out.println(optPerson.get().toString());

		//group
		//根據性別-1
		System.out.println("gender1---------------------------------------------------------");

		Map<Gender, List<Person>> groupByGender = persons.stream()
														 .collect(Collectors.groupingBy(Person::getGender));
		System.out.println(groupByGender);
		groupByGender.forEach(
				(gender , person ) -> { 
					System.out.println(gender);
					person.forEach(System.out::println);
				}
				);
		//根據性別-2
		System.out.println("gender2---------------------------------------------------------");

		Map<Gender, List<String>> groupByGender2 = persons.stream()
					.collect(Collectors.groupingBy(Person::getGender, Collectors.mapping(Person::getName, Collectors.toList())));
		
		groupByGender2.forEach(
				(gender , person ) -> { 
					System.out.println(gender);
					person.forEach(System.out::println);
				}
				);
				
		//根據年齡界限
		System.out.println("age---------------------------------------------------------");

		Map<String, List<Person>> groupByAge = persons.stream()
													  .collect(Collectors.groupingBy(Person::if18));
		groupByAge.forEach(
				( if18 , person ) -> { 
					System.out.println(if18);
					person.forEach(System.out::println);
				}
				);
		
		//根據性別及年齡雙重界線
		System.out.println("Bi---------------------------------------------------------");

		Map<Gender, Map<String, List<Person> > > groupByGenderAndAge = persons.stream()
				.collect(Collectors.groupingBy(Person::getGender, Collectors.groupingBy(Person::if18) ) );
		groupByGenderAndAge.forEach(
				(gender, map) ->{
					System.out.println(gender);
					map.forEach(
					(if18, person) -> {
						System.out.println(if18);
						person.forEach(System.out::println);
					}
					);
				}
				);
	}

}
