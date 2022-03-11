package stydy.ocp.day18;


public class Master implements Runnable{
	
	private Cookies cookies;
	
	public Master(Cookies cookies) {
		this.cookies = cookies;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			cookies.put(i+1);
		}
	}

}
