package stydy.ocp.day2;

public class MathUtils{
	
	public static <T> Double getSum( T[] nums) {
		Double sum = 0.0;
		if (nums.getClass().equals(Integer[].class)) {
			int middle = 0;
			for (int i = 0; i < nums.length; i++) {
				middle += (int)nums[i];
			}
			sum = (double)middle;
		}else if (nums.getClass().equals(Double[].class)) {
			for (int i = 0; i < nums.length; i++) {
				sum += (double)nums[i];
			}
		} 
		
		return sum;
	}
	
	public static <T> double getAverage(T[] nums) {
		Double avg = getSum(nums) / nums.length;
		return avg;
	}
	
	
	public static <T> double getSD(T[] nums) {
		Double sqareOfDiff = 0.0; 
		for (int i = 0; i < nums.length; i++) {
			sqareOfDiff += Math.pow((double)nums[i]- getAverage(nums), 2);
		}
		Double SD = Math.sqrt(sqareOfDiff/nums.length);
		
		return SD;
	}
	
	public static <T> double getCOEofVar(T[] nums) {
		double coeOfVar = 0.0;
		coeOfVar = getSD(nums) / getAverage(nums);
		return coeOfVar;
	}

}
