package stydy.ocp.day22;

import java.io.FileWriter;
import java.util.Date;

public class FileWriterDemo3 {
	public static void main(String[] args) {
		String filePath = "src/main/java/stydy/ocp/day22/files/data2.txt";
		
		try (FileWriter fileWriter = new FileWriter(filePath, true)) {
			String data1 = "現在時間:" + new Date().toString();
			String data2 = "\n";
			String data3 = "Hello Java" + new Date().toString() + "\n";
			fileWriter.write(data1);
			fileWriter.write(data3);
			System.out.println("寫入成功");
		} catch (Exception e) {
		}
	}
}
