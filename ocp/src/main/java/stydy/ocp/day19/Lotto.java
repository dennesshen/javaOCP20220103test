package stydy.ocp.day19;

import java.util.Date;
import java.util.Random;

public class Lotto implements Runnable{
	
	private static Integer count = 1;

	@Override
	public void run() {
		Random random = new Random();
		System.out.println(Thread.currentThread().getName() +" Start " + new Date());
		try {
			Thread.sleep(random.nextInt(5000));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		int n = new Random().nextInt(100);
		
		System.out.println(Thread.currentThread().getName() + " Thread 執行"+"第"+count+"個樂透號碼"+n);
		System.out.println(Thread.currentThread().getName() + " End " +new Date());
		count++;
	}

}
