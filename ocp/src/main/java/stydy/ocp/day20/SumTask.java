package stydy.ocp.day20;

import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Long>{
	
	final static int THRESHOLD = 3;
	
	long[] array;
	
	int start, end;
	
	public SumTask() {
	}
	
	public SumTask(long[] array, int start, int end) {
		super();
		this.array = array;
		this.start = start;
		this.end = end;
	}



	@Override
	protected Long compute() {
		if (end - start <=3) {
			long sum = 0;
			for(int i = start; i <end; i++) {
				sum += array[i];
			}
			return sum;
		}
		int middle = (start + end) / 2;
		SumTask sumTask1 = new SumTask(this.array, start, middle);
		SumTask sumTask2 = new SumTask(this.array, middle, end);
		invokeAll(sumTask1, sumTask2);
		long result = sumTask1.join() + sumTask2.join();
		return result;
	}
	
	

}
