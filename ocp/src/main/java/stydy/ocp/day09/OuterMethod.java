package stydy.ocp.day09;

public class OuterMethod {
	
	public void bar(int y) {
		int x = 10;
		class Inner{
			void callme() {
				System.out.println("Call me");
				System.out.println(x);
				System.out.println(y);
			}
		}
		
		Inner in = new Inner(); 
		in.callme();
	}
	
	public void bar2(int y) {
		int x = 10;
		class Inner{
			void callme() {
				System.out.println("Call me");
				System.out.println(x);
				System.out.println(y);
			}
		}
		
		Inner in = new Inner(); 
		in.callme();
	}
	
}
