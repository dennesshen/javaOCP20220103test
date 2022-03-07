package stydy.ocp.day17;

public class Withdraw implements Runnable{
	private Account account;
	private Integer money;
	
	public Withdraw(Account account, Integer money) {
		this.account = account;
		this.money = money;
	}
	
	@Override
	public void run() {
			account.withdraw(money);
	}

}
