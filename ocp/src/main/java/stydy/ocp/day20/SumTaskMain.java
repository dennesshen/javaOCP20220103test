package stydy.ocp.day20;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class SumTaskMain {
	public static void main(String[] args) {
		int len = 1000000000;
		long[] array = new long[len];
		// 期望結果
		long expectedSum = 0;
		for(int i=0; i< array.length;i++) {
			array[i] = i + 1;
			expectedSum += array[i];
		}
		System.out.println("-------------------------------------------");
		// 取得內核數量
		int proc = Runtime.getRuntime().availableProcessors();
		System.out.printf("處理器內核數量: %d\n", proc);
		// ForkJoin task
		ForkJoinTask<Long> task = new SumTask(array, 0, array.length);
		// start time:
		long startTime = System.currentTimeMillis();
		// ForkJoin task 運行
		long result = ForkJoinPool.commonPool().invoke(task);
		// end time:
		long endTime = System.currentTimeMillis();
		System.out.printf("Fork/Join 結果: %d in %d ms.\n", 
				result, (endTime - startTime));
		
		long startTime2 = System.currentTimeMillis();
		// ForkJoin task 運行
		expectedSum = 0;
		for(int i=0; i< array.length;i++) {
			expectedSum += array[i];
		}
		// end time:
		long endTime2 = System.currentTimeMillis();
		System.out.printf("for迴圈結果: %d in %d ms.\n", 
				expectedSum, (endTime2 - startTime2));
	}
}
