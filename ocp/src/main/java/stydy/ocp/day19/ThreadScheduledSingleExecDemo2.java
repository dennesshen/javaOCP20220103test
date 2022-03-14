package stydy.ocp.day19;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadScheduledSingleExecDemo2 {

	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		System.out.println(Thread.currentThread().getName() + new Date());
		//service.scheduleWithFixedDelay(new Lotto(), 0, 1, TimeUnit.SECONDS);
		service.scheduleAtFixedRate(new Lotto(), 0, 3, TimeUnit.SECONDS);

	}

}
