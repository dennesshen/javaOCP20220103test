package stydy.ocp.day8_4;

public class SingleTonTest {
	public static void main(String[] args) {
		NonSingleTon s1 = new NonSingleTon();
		NonSingleTon s2 = new NonSingleTon();
		SingleTon s3 = SingleTon.getInstance();
		SingleTon s4 = SingleTon.getInstance();
		System.out.println(s1.getNum());
		System.out.println(s2.getNum());
		System.out.println(s3.getNum());
		System.out.println(s4.getNum());
		
		
	}
}
