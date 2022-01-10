package stydy.ocp.day1;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] scores = {100, 90, 80};
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[0]+scores[1]+scores[2]);
		System.out.println(scores.length);
		System.out.println(Arrays.toString(scores));
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		for(int s : scores) {
			System.out.println(s);
		}
		
	
	}

}
