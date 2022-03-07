package stydy.ocp.day17;

import java.util.Random;
import java.util.concurrent.Callable;

public class Lotto implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		Thread.sleep(1000);
		Integer result = new Random().nextInt(100);
		return result;
	}
	
}
