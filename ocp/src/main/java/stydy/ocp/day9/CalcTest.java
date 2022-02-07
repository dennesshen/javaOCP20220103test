package stydy.ocp.day9;

public class CalcTest {
	public static void main(String[] args) {
		
		Calc calc1 = new AddCalc();
		System.out.println(calc1.computer(1, 2));
		
		Calc calc2 = new Calc() {
			@Override
			public int computer(int x, int y) {
				return x*y;
			}
		};
		
		System.out.println(calc2.computer(2, 3));
		
		//java 8 Lamda -> 只適用於 單一方法
		Calc calc3 = (int x, int y ) -> x+y ;
		System.out.println(calc3.computer(3, 4));
		
		Calc calc4 = (x, y) -> x+y;
		System.out.println(calc4.computer(5, 6));	
	}

}
