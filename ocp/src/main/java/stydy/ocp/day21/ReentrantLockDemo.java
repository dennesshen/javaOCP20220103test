package stydy.ocp.day21;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
	public static void main(String[] args) {
		new Thread(new Lotto("Vincent")).start();
		new Thread(new Lotto("Anita")).start();

	}

}

class Lotto implements Runnable{
	private String username;
	private static final ReentrantLock lock = new ReentrantLock();
	
	public Lotto(String username) {
		this.username = username;
	}
	
	@Override
	public void run() {
		try {
			lock.lock();
			for(int i = 0; i<5; i++) {
				System.out.printf("%s 得到第 %d 組號碼: %d\n", username, i+1, new Random().nextInt(100));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
}
