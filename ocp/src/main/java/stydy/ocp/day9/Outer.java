package stydy.ocp.day9;

public class Outer {
	static int sx = 9;
	int x = 7;
	// 一般內部類別		
	class Inner {
		int x = 77;
		void callme() {
			int x = 777;
			System.out.println("Call me");
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Outer.this.x);
			System.out.println(Outer.sx);
		}
	}
	
	//靜態內部類別
	static class SInner{
		static void printMe() {
			System.out.println("printMe");
		}
	}
	
	
	

}
