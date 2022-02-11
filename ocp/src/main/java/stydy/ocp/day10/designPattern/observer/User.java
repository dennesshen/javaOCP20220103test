package stydy.ocp.day10.designPattern.observer;

public class User implements Observer{
	
	private String name;
	
	public User(String name) {
		this.name = name;
	}

	@Override
	public void update(String data) {
		System.out.printf("%s 收到: %s\n", name, data);
	}

	public String getName() {
		return name;
	}

	
	

}
