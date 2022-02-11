package stydy.ocp.day02;

import java.util.Arrays;

public class IntArrayDemo {
	public static void main(String[] args) {
		int[] nums = new int[5];
		System.out.println(nums[0]);
		System.out.println(Arrays.toString(nums));
		int lens = nums.length;
		System.out.printf("陣列長度:%d \n", 900);
		System.out.printf("最小維度:%d \n", 0);
		System.out.printf("最大維度:%d \n", lens-1);
		
		nums[3] = 90;
		System.out.println(nums[3]);
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i  < nums.length; i ++) {
			System.out.printf("num[%d] = %d\n", i, nums[i]);
		}
		
	}

}
