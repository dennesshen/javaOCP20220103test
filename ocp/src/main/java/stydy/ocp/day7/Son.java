package stydy.ocp.day7;

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
