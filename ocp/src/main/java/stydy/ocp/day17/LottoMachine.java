package stydy.ocp.day17;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


public class LottoMachine {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println("取得樂透數字");
		FutureTask<Integer> task = new FutureTask<Integer>(new Lotto());
		new Thread(task).start();
		while (!task.isDone()) {
			System.out.println("還沒開獎");
			Thread.sleep(100);;
		}
		System.out.println(task.get());
	}
}
