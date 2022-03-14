package stydy.ocp.day19;

public class Task implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"執行普通任務");
	}
}
