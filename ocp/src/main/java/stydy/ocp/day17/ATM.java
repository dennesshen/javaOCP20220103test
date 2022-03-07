package stydy.ocp.day17;

public class ATM {

	public static void main(String[] args) {
		Account account = new Account(10000);
		Thread thread1 = new Thread(new Withdraw(account, 5000), "小明");
		Thread thread2 = new Thread(new Withdraw(account, 4000), "小華");
		Thread thread3 = new Thread(new Withdraw(account, 3000), "小英");
		thread1.start();
		thread2.start();
		thread3.start();
		StringBuffer sb = new StringBuffer();
	}

}
