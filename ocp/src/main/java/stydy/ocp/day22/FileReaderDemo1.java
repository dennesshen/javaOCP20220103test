package stydy.ocp.day22;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
	public static void main(String[] args) {
		String filePath = "src/main/java/stydy/ocp/day22/files/data.txt";
		
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader(filePath);
			char[] buffer = new char[1];
			while (fileReader.read(buffer) != -1) {
				System.out.print(buffer);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (fileReader !=null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
