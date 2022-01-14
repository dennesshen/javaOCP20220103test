package stydy.ocp.day4;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class ArrayStreamDemo2 {
	public static void main(String[] args) {
		int[] nums = {100, 80, 50, 70, 30};
		
		IntSummaryStatistics summaryStatistics = Arrays.stream(nums).summaryStatistics();
		System.out.printf("總分:%d\n", summaryStatistics.getSum());
		System.out.printf("平均:%f\n", summaryStatistics.getAverage());
		System.out.printf("最大值:%d\n", summaryStatistics.getMax());
		System.out.printf("最小值:%d\n", summaryStatistics.getMin());
		System.out.printf("個數:%d\n", summaryStatistics.getCount());
		
		Arrays.stream(nums).forEach(n -> System.out.println(n) );
		Arrays.stream(nums).forEach(System.out::println); //::方法參考


	}

}
