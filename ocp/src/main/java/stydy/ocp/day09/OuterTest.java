package stydy.ocp.day09;

import stydy.ocp.day09.Outer.SInner;

public class OuterTest {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.callme();
		SInner.printMe();
	}
}
