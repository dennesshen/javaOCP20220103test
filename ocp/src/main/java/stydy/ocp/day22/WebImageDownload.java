package stydy.ocp.day22;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class WebImageDownload {
	public static void main(String[] args) {
		String sourcePath = "https://img.strategy.style/2022/03/1646292285-3be433a179f12483196c5d9b9da1d9dc-840x525.jpg";
		String dataPath = "src/main/java/stydy/ocp/day22/files/su27.jpg";
		try (InputStream inputStream = getImage(sourcePath);
			 FileOutputStream fileOutputStream = new FileOutputStream(dataPath);){
			byte[] buffer = new byte[1];
			while (inputStream.read(buffer) != -1) {
				System.out.print(buffer[0]);
				System.out.print("\n");
				fileOutputStream.write(buffer[0]);
			}
			System.out.print("\n");
			System.out.println("寫入成功");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static InputStream getImage(String sourcePath) throws IOException {
		URL url = new URL(sourcePath);
		return url.openStream();
	}
}
