package stydy.ocp.day02;

public class IntArrayDemo4 {
	public static void main(String[] args) {
		Double[] stocks = {7.6, 3.9, 15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5};
		Double[] debts = {6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.9, 7.1, 7.2};
		System.out.println(MathUtils.getCOEofVar(stocks));
		System.out.println(MathUtils.getCOEofVar(debts));

	}
}
