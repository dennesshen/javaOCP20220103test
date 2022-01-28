package stydy.ocp.day8_4;

import java.util.Random;

public class NonSingleTon {
	private int num;
	
	public NonSingleTon() {
		this.num = new Random().nextInt(1000);
	}

	public int getNum() {
		return num;
	}
	
}
