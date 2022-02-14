package stydy.ocp.day07;

public class Son extends Father{
	public Son() {
		this("100");
		System.out.println("C");
	}
	public Son(String str) {
		super();
		System.out.println("D");
	}
}
