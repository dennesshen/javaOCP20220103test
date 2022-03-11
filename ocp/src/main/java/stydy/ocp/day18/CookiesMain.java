package stydy.ocp.day18;

public class CookiesMain {

	public static void main(String[] args) {
		Cookies cookies = new Cookies();
		Thread thread1 = new Thread(new Dog(cookies),"小白狗");
		Thread thread2 = new Thread(new Master(cookies),"主人");
		thread1.start();
		thread2.start();
	}

}
