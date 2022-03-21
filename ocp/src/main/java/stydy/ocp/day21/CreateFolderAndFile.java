package stydy.ocp.day21;

import java.io.File;
import java.io.IOException;

public class CreateFolderAndFile {
	public static void main(String[] args) {
		String basePath = "src/main/java/stydy/ocp/day21";
		String folderName = "files";
		String fileName = "data1.txt";
		File path = new File(basePath + File.separator + folderName);
		if (!path.exists()) {
			path.mkdir();
		}
		
		File file = new File(path.getPath() + File.separator + fileName);
		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("建立檔案成功");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println(fileName + "檔案已存在");
		}
	}
}
