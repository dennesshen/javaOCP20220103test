package stydy.ocp.day21;

import java.util.Arrays;

public class ParallelDemo {
	public static void main(String[] args) {
		int[] nums = {3, 6, 7 , 2};
		Arrays.parallelSort(nums);
		System.out.println("排序後"+ Arrays.toString(nums));
	}


}
