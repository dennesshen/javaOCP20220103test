package stydy.ocp.day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TaskMain {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newCachedThreadPool();
		
		service.submit(new Task());
		service.submit(new Task());
		service.submit(new LongTask());
		service.submit(new Task());
		service.submit(new LongTask());
		
		service.shutdown();
		
		while (!service.awaitTermination(1, TimeUnit.SECONDS)) {
			System.out.println("監控中，尚未關閉");
		}
		System.out.println("已關閉");
		
	}
}
