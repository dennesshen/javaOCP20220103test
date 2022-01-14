package stydy.ocp.day3;


import java.util.Scanner;

public class CheckID {
	public static void main(String[] args) {
		System.out.println("請輸入");
		String id = new Scanner(System.in).next();
		if(checkID(id)) {
			System.out.println("有效");
		}else {
			System.out.println("無效");
		}
	}
	
	public static Integer[] idStringMapToIntegers(String id) {
		Integer[] result = new Integer[11]; 
		Integer[] idMapNumber = {10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 0, 21, 22, 35, 23, 24, 0, 0, 27, 28, 29, 32, 30, 0, 33};
		int c = id.charAt(0);
		result[0] = idMapNumber[c-65] / 10;
		result[1] = idMapNumber[c-65] % 10;
		for (int i = 1; i < id.length(); i++) {
			result[i+1] = Integer.parseInt(Character.toString(id.charAt(i)));
			
		}

		return result;
	}
	
	public static boolean checkID(String id) {
		boolean check = true;
		Integer[] checkNumberList = {1, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1};
		Integer[] idArray = idStringMapToIntegers(id);
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			sum += checkNumberList[i]*idArray[i];
		}
		if (sum % 10 != 0 ) {
			check = false;
		}
		return check;
	}
}
