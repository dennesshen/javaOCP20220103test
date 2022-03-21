package stydy.ocp.day21;

import java.io.File;

public class CheckDirOrFile {
	public static void main(String[] args) {
		File basePath = new File("src/main/java/stydy/ocp/day21");
		for (String path : basePath.list()) {
			System.out.println(path);
			File fullPath = new File(basePath.getPath() + File.separator + path);
			System.out.printf("%s 是%s \n", path, fullPath.isFile()? "檔案" : "目錄");
		}
	}
}
