
public class starTest2 {
	
	private static String pieceImage = "* ";//決定圖形要由哪一種樣式組成。
	
	public static void main(String[] args) {
		Integer middleRow = 4; // 決定最中間的那一行要多少顆星星 。
		targetImage(middleRow);
		
	}
	
	public static void targetImage(Integer middleRow) {
		for (int i = 1; i <= middleRow ; i++) {
			System.out.println(targetLine(i, middleRow));
		}
		for (int i = 1; i < middleRow; i++) {
			System.out.println(targetLine(middleRow-i, middleRow));
		}
	}
	
	public static String targetLine(Integer row, Integer middleRow) {
		String result = "";
		for (int i = 0; i < middleRow - row; i++) {
			result = result +" ";
		}
		for (int i = 0; i < row; i++) {
			result = result + pieceImage;
		}
		
		return result;
	}

}
