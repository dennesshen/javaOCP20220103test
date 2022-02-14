package stydy.ocp.day07;

public class CalcDemo {
	public int add(int x, int y) {
		System.out.println("A");
		return x + y;
	}
	public int add(int x, int y, int z) {
		System.out.println("B");
		return x + y + z;
	}
//	public int add(int[] nums) {
//		System.out.println("c");
//		int sum = 0;
//		for (int i = 0; i < nums.length; i++) {
//			sum += nums[i];
//		}
//		return sum;
//	}
	public int add(int... nums) {
		System.out.println("D");
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		CalcDemo calcDemo = new CalcDemo();
		System.out.println(calcDemo.add(10, 20));
		System.out.println(calcDemo.add(10, 20, 30));
		int[] nums1 = {10, 20 ,30};
		System.out.println(calcDemo.add(nums1));
		System.out.println(calcDemo.add(10, 20, 30, 40));
	}

}
