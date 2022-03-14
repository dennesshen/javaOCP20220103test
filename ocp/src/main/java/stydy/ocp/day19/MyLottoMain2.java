package stydy.ocp.day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MyLottoMain2 {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(100);
		
		exec.submit(new Lotto());
		exec.submit(new Lotto());
		exec.submit(new Lotto());
		exec.submit(new Lotto());
		exec.submit(new Lotto());
		exec.submit(new Lotto());
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		exec.submit(new Lotto());
		exec.submit(new Lotto());
		exec.submit(new Lotto());
		exec.submit(new Lotto());
		exec.submit(new Lotto());
		System.out.println(((ThreadPoolExecutor)exec).getLargestPoolSize());
		exec.shutdown();

	}
}
