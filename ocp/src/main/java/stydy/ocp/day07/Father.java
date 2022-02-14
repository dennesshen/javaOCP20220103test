package stydy.ocp.day07;

public class Father {
	public Father() {
		this("100");
		System.out.println("A");
	}
	public Father(String str) {
		System.out.println("B");
	}
}
