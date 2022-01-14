package stydy.ocp.day4;

import java.util.Arrays;

public class ArrayStreamDemo4 {
	public static void main(String[] args) {
		String[] names = {"John", "Jo", "Helen", "Vincent", "Anita"};
		
		double avg = Arrays.stream(names).parallel().mapToInt(n -> n.length()).peek(System.out::println).average().getAsDouble();
		System.out.println(avg);
	}

}
