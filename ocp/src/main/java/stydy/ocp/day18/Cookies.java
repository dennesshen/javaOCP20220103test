package stydy.ocp.day18;

public class  Cookies {
	
	private boolean empty = true;
	
	public synchronized void put(Integer num) {
		
		while(!empty) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		String threadName = Thread.currentThread().getName();
		System.out.printf("%s放了第%d個餅乾!\n", threadName, num);
		empty = false;
		notifyAll();
	}
	
	pubic synchronized void eat(Integer num) {
		while (empty) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		String threadName = Thread.currentThread().getName();
		System.out.printf("%s吃了第%d個餅乾!\n", threadName, num);
		empty = true;
		notifyAll();
	}

}
