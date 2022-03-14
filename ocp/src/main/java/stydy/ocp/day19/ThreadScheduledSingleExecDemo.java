package stydy.ocp.day19;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadScheduledSingleExecDemo {

	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		System.out.println(Thread.currentThread().getName() + new Date());
		service.schedule(new Lotto(), 5, TimeUnit.SECONDS);
		
		service.shutdown();
	}

}
