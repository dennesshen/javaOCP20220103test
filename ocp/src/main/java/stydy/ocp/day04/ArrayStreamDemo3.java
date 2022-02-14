package stydy.ocp.day04;

import java.util.Arrays;

public class ArrayStreamDemo3 {
	public static void main(String[] args) {
		int[] nums = {100, 80, 50, 70, 30};
		
		Double passAvg = Arrays.stream(nums).filter(n -> n>=60).average().getAsDouble();
		Double failAvg = Arrays.stream(nums).filter(n -> n<60).average().getAsDouble();
		
		System.out.printf("及格平均:%.1f\n", passAvg);
		System.out.printf("不及格平均:%.1f\n", failAvg);

	}

}
