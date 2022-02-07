package stydy.ocp.day9;

public class AddCalc implements Calc{

	@Override
	public int computer(int x, int y) {
		int result = x+y;
		return result;
	}
	
}
