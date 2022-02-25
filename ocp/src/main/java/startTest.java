
public class startTest {
	
	private static String pieceImage = "*";//決定圖形要由哪一種樣式組成。
	
	public static void main(String[] args) {
		Integer targetLineNumber = 4; 
		String plusImage = "**";
		String targetSpace = " ";
		String  space = " ";
		for (int i = 0; i < targetLineNumber; i++) {
			pieceImage = "*";
			targetSpace = "";
			for (int j = 0; j < i; j++) {
				pieceImage = plusImage + pieceImage;
			}
			for (int j = 0; j < targetLineNumber - i -1; j++) {
				targetSpace = targetSpace + space;
			}
			System.out.println(targetSpace + pieceImage);
			
		}
		
		
	}
	

}
