package stydy.ocp.day20;

import java.util.concurrent.RecursiveTask;

public class FibonacciTask extends RecursiveTask<Long>{
	final static int THRESHOLD = 29;
	
	private int num;
	
	public FibonacciTask(int num) {
		this.num = num;
	}
	 
	@Override
	protected Long compute() {
		if (num <= THRESHOLD) {
			return new Fibonacci1().fib(num);
		}
		FibonacciTask f1 = new FibonacciTask(num-1);
		FibonacciTask f2 = new FibonacciTask(num-2);
		invokeAll(f1, f2);
		long result = f1.join() + f2.join();
		return result;
	}
}
