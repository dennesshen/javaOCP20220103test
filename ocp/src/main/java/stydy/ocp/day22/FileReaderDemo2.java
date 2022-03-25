package stydy.ocp.day22;

import java.io.FileReader;

public class FileReaderDemo2 {
	public static void main(String[] args) {
		String filePath = "src/main/java/stydy/ocp/day22/files/data.txt";
		
		
		try (FileReader fileReader = new FileReader(filePath)){
			
			char[] buffer = new char[1];
			while (fileReader.read(buffer) != -1) {
				System.out.print(buffer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
