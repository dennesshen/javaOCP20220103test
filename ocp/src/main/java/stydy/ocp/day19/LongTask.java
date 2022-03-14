package stydy.ocp.day19;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class LongTask implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"執行長任務開始");
		try {
			TimeUnit.SECONDS.sleep(new Random().nextInt(10)+1);
		} catch (Exception e) {
		}
	
		System.out.println(Thread.currentThread().getName()+"執行長任務結束");
	}
}
