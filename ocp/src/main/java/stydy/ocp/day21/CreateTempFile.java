package stydy.ocp.day21;

import java.io.File;
import java.io.IOException;

public class CreateTempFile {
	public static void main(String[] args) {
		String filesPath = "src/main/java/stydy/ocp/day21/files";
		String fileName = "data1.txt";
		
		File file = new File(filesPath);
		try {
			for (int i = 0; i < 10; i++) {
				File tempFile = File.createTempFile("temp", ".txt", file);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
