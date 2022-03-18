package stydy.ocp.day20;

public class Fibonacci1 {
	public long fib(int n) {
		return n < 2 ?  n : fib(n-1) + fib(n-2); 
	}
}
