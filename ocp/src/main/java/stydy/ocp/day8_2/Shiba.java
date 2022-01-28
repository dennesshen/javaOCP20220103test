package stydy.ocp.day8_2;

public class Shiba implements Dog{

	@Override
	public void eat() {
		System.out.println("吃狗飼料");
	}

	@Override
	public void skill() {
		System.out.println("等主人");
	}

}
