package stydy.ocp.day09;

public class BallEqualsTeat {
	public static void main(String[] args) {
		Ball b1 = new Ball("red", 100);
		Ball b2 = new Ball("red", 100);
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		
	}
}
