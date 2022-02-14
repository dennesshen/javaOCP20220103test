package stydy.ocp.day08_4;

import java.util.Random;

public class SingleTon {
	private Integer num;
	private static SingleTon instance = new SingleTon();
	
	private SingleTon() {
		this.num = new Random().nextInt(1000);
	}
	
	public static SingleTon getInstance() {
		return instance;
	}
	
	public Integer getNum() {
		return num;
	}

}
