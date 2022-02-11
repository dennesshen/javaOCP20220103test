package stydy.ocp.day01;

public class ArrayDemo3 {

	public static void main(String[] args) {
		int[] p1 = {10, 20};
		int[] p2 = {30, 50};
		Double square = Math.pow(p1[0]-p2[0],2)+Math.pow(p1[1]-p2[1], 2);
		Double distant = Math.sqrt(square);
		System.out.printf("%.2f",distant);
		
	}

}
