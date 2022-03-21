package stydy.ocp.day21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciJava8 {
	public static void main(String[] args) {
		List<Long> fib 
		= Stream.iterate(new long[] {0, 1}, n -> new long[]{n[1], n[0]+n[1]})
				.limit(10)
				.peek(n -> Arrays.toString(n))
				.map(n-> n[0])
				.collect(Collectors.toList());
		System.out.println(fib);
		
	}
}
