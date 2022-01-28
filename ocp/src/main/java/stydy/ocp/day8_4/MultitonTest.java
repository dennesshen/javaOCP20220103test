package stydy.ocp.day8_4;

import java.util.Arrays;

public class MultitonTest {
	public static void main(String[] args) {
		Multiton[] multitons = {
				Multiton.getInstance(),
				Multiton.getInstance(),
				Multiton.getInstance(),
				Multiton.getInstance(),
				Multiton.getInstance(),
				Multiton.getInstance()
		};
		Arrays.stream(multitons).forEach(m -> System.out.println(m.getNum()));
		
	}
}
