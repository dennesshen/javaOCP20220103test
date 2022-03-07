package stydy.ocp.day17;

public class Father extends Thread{
	
	public static void main(String[] args) {
		new Father().start();
	}

	public void run() {
		System.out.println("爸爸下班回家");
		System.out.println("爸爸準備洗澡");
		System.out.println("爸爸發現沒瓦斯");
		System.out.println("爸爸請瓦斯工人送瓦斯");
		Worker worker = new Worker();
		worker.start();
		
		try {
			worker.join(10000);
		} catch (Exception e) {
		}
		
		if (worker.isAlive()) {
			System.out.println("爸爸開始洗冷水澡");
		}else {
			System.out.println("爸爸開始洗熱水澡");
		}
	}
	
}
