package stydy.ocp.day08_4;

import java.util.Random;

public class Multiton {
	private int num;
	private static Multiton[] instances = {new Multiton(123), new Multiton(456), new Multiton(789)};
	
	private Multiton(int num) {
		this.num = num;
	}
	
	public static Multiton getInstance() {
		return instances[new Random().nextInt(3)];
	}
	public int getNum() {
		return num;
	}
}
