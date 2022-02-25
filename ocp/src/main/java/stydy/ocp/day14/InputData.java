package stydy.ocp.day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputData {
	public static void main(String[] args) {
		int[] data = {10, 2, 5, 0};
		int x = 10;
		System.out.println("請輸入");
		Scanner scanner = new Scanner(System.in);
		try {
			int index = scanner.nextInt();
			int result = x/data[index];
			System.out.println(result);
		} catch (ArithmeticException e1) {
			System.out.println("數學錯誤" + e1);
			System.out.println("錯誤內容" + e1.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("陣列錯誤" + e2);
			System.out.println("錯誤內容" + e2.getMessage());
		}
		catch (InputMismatchException e3) {
			System.out.println("輸入錯誤" + e3);
			System.out.println("錯誤內容" + e3.getMessage());
		}
		catch (Exception e4) {
			System.out.println("其他錯誤" + e4);
			System.out.println("錯誤內容" + e4.getMessage());
		}
	}

}
