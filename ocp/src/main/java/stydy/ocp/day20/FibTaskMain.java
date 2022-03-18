package stydy.ocp.day20;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class FibTaskMain {
	public static void main(String[] args) {
				
		// ForkJoin task
		ForkJoinTask<Long> task = new FibonacciTask(45);
		// start time:
		long startTime = System.currentTimeMillis();
		// ForkJoin task 運行
		long result = ForkJoinPool.commonPool().invoke(task);
		// end time:
		long endTime = System.currentTimeMillis();
		System.out.printf("Fork/Join 結果: %d in %d ms.\n", 
				result, (endTime - startTime));
		
		
	}
}
