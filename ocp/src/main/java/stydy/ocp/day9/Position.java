package stydy.ocp.day9;

public enum Position {
	工讀生, 員工, 經理, 副總, 總經理;
	private Position() {
		System.out.println("建構 position");
	}
}
