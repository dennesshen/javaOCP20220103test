package stydy.ocp.day2;

public class MathUtils<T> {
	
	public static int getSum( int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
	
	public static double getAverage(int[] nums) {
		Double avg = (double)getSum(nums) / nums.length;
		return avg;
	}
	
	public static double getSD(int[] nums) {
		Double sqareOfDiff = 0.0; 
		for (int i = 0; i < nums.length; i++) {
			sqareOfDiff += Math.pow(nums[i]- getAverage(nums), 2);
		}
		Double SD = Math.sqrt(sqareOfDiff/nums.length);
		
		return SD;
	}
	
	
	public static double getDSum(double[] nums) {
		double sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
	
	public static double getDAverage(double[] nums) {
		Double avg = getDSum(nums) / nums.length;
		return avg;
	}
	
	public static double getDoubleSD(double[] nums) {
		Double sqareOfDiff = 0.0; 
		for (int i = 0; i < nums.length; i++) {
			sqareOfDiff += Math.pow(nums[i]- getDAverage(nums), 2);
		}
		Double SD = Math.sqrt(sqareOfDiff/nums.length);
		
		return SD;
	}
	
	public static double getCOEofVar(double[] nums) {
		double coeOfVar = 0.0;
		coeOfVar = getDoubleSD(nums) / getDAverage(nums);
		return coeOfVar;
	}

}
