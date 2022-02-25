
public class MultiplicationTable {
	
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%02dx%02d=%02d, ",i, j, i*j);
				if (j==9) {
					System.out.println("\n");
				}
			}
		}
	}
}
