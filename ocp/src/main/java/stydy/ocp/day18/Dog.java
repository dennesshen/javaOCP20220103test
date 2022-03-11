package stydy.ocp.day18;


public class Dog implements Runnable{
	
	private Cookies cookies;
	
	public Dog(Cookies cookies) {
		this.cookies = cookies;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			cookies.eat(i+1);
		}
	}

}
