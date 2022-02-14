package stydy.ocp.day04;

import java.util.Arrays;

public class ArrayStreamDemo {
	public static void main(String[] args) {
		int[] nums = {100, 80, 50, 70, 30};
		
		int sum = Arrays.stream(nums).sum();
		System.out.printf("總分:%d\n", sum);
		System.out.printf("平均:%f\n", Arrays.stream(nums).average().getAsDouble());
		System.out.printf("最大值:%d\n", Arrays.stream(nums).max().getAsInt());
		System.out.printf("最小值:%d\n", Arrays.stream(nums).min().getAsInt());
		System.out.printf("個數:%d\n", Arrays.stream(nums).count());

	}

}
