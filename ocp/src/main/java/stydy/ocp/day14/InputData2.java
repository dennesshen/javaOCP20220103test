package stydy.ocp.day14;

import java.util.Scanner;

public class InputData2 {
	public static void main(String[] args) {
		int[] data = {10, 2, 5, 0};
		int x = 10;
		System.out.println("請輸入");
		Scanner scanner = new Scanner(System.in);
		if(!scanner.hasNextInt()) {
			System.out.println("未輸入數字請從新輸入");
			main(args);
			return;
		}
		int index = scanner.nextInt();
		int result = x/data[index];
		System.out.println(result);
	}

}
