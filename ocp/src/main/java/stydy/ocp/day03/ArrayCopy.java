package stydy.ocp.day03;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] num1 = {100, 90, 80};
		System.out.println(Arrays.toString(num1));
		
		int[] num2 = Arrays.copyOf(num1, 10);
		System.out.println(Arrays.toString(num2));
		
		int[] num3 = new int[10];
		System.arraycopy(num1, 1, num3, 7, 2);
		System.out.println(Arrays.toString(num3));
		
		int[] num4 = num1.clone();
		System.out.println(Arrays.toString(num4));

	}

}
