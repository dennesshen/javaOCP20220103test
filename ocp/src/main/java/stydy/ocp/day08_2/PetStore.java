package stydy.ocp.day08_2;

import java.util.Arrays;

public class PetStore {
	public static void main(String[] args) {
		Dog[] dogs = {new Shiba(), new Chihuahua(), new EDog()};
		Arrays.stream(dogs).forEach(PetStore::print);
		
		AbstractDog[] dogs2 = {new Shiba(), new Chihuahua()};
		Arrays.stream(dogs2).forEach(PetStore::print);

	}
	
	public static void print(Dog dog) {
		System.out.println(dog.getClass().getSimpleName());
		dog.eat();
		dog.skill();
	}
}
