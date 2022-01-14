package stydy.ocp.day4;

import java.util.Arrays;

public class MutiArrayDemo3 {

	public static void main(String[] args) {
		int[][][] scores = {
				{ {100, 90, 80}, {70, 60}, {50} },
				{ {40, 30}, {20} },
				{ {10, 5} }
		};
		
		int sum1 = Arrays.stream(scores)
				.flatMapToInt(n1 -> Arrays.stream(n1).flatMapToInt(n2 -> Arrays.stream(n2)))
				.sum();
		
		int sum2 = Arrays.stream(scores)
					.flatMap(n1 -> Arrays.stream(n1))
					.flatMapToInt(n2 -> Arrays.stream(n2)).sum();
		System.out.println(sum1);
		
	}

}
