package stydy.ocp.day17;

public class Worker extends Thread{
	@Override
	public void run() {
		System.out.println("工人準備送瓦斯");
		for (int i = 1; i < 15; i++) {
			try {
				Thread.sleep(1000);
				System.out.print(i+"秒鐘");
			} catch (Exception e) {
			}
		}
		System.out.println("工人送到");

	}
}
