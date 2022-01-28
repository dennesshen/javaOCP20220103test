package stydy.ocp.day8_3;

public class Fighter extends Airplane implements Weapon{

	@Override
	void speed() {
		System.out.println("戰鬥機時速 1500/H km");
	}

	@Override
	public void shoot() {
		System.out.println("戰鬥機發射精靈彈");		
	}

}
