package stydy.ocp.day22;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

public class CopyData {
	public static void main(String[] args) {
		String readerFilePath = "src/main/java/stydy/ocp/day22/files/data.txt";
		String writerFilePath = "src/main/java/stydy/ocp/day22/files/data_backup.txt";
		
		
		try (FileReader fileReader = new FileReader(readerFilePath)
				; FileWriter fileWriter = new FileWriter(writerFilePath, true)) {
			char[] buffer = new char[1];
			while (fileReader.read(buffer) != -1) {
				System.out.print(buffer[0]);
				fileWriter.write(buffer[0]);			
			}
			System.out.println("寫入成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
