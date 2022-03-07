package stydy.ocp.day17;

public class Account {
	private int balance;
	public Account(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money)  {
		String name = Thread.currentThread().getName();
		int currentBalance = getBalance();
		System.out.println(name +"開始提款,提款金額為" + money + ",帳戶餘額:"+ currentBalance);
		
		if (currentBalance >= money) {
			balance = currentBalance - money;
			System.out.printf("%s 提款 $%d 成功, 帳戶餘額$%d\n", name, money, getBalance());
		}else {
			System.out.printf("%s 提款 $%d 失敗\n", name, money);
		}
		System.out.printf("%s 提款工作結束,帳戶餘額:$%d\n", name, getBalance());
	}

}
