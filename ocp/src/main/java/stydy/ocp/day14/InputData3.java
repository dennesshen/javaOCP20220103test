package stydy.ocp.day14;

import java.util.Scanner;

public class InputData3 {
	public static void main(String[] args) {
		int[] data = {10, 2, 5, 0};
		int x = 10;
		System.out.println("請輸入");
		Scanner scanner = new Scanner(System.in);
		Boolean isNumber = scanner.next().chars().allMatch(Character::isDigit);
		if (!isNumber) {
			System.out.println("錯誤");
		}
		int index = scanner.nextInt();
		int result = x/data[index];
		System.out.println(result);
	}

}
