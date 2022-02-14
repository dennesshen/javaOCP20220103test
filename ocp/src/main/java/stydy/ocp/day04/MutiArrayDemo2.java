package stydy.ocp.day04;

import java.util.Arrays;

public class MutiArrayDemo2 {

	public static void main(String[] args) {
		int[][] scores = {
				{100, 90, 80},
				{70, 60}
		};
		
		int sum = Arrays.stream(scores).flatMapToInt(s -> Arrays.stream(s)).sum();
		System.out.println(sum);
	}

}
