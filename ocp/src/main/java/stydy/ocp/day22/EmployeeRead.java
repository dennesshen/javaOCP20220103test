package stydy.ocp.day22;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmployeeRead {
	
	public static void main(String[] args) {
		String path = "src/main/java/stydy/ocp/day22/files/john.ser";
		try (FileInputStream fileInputStream = new FileInputStream(path);
			 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
			Employee employee = (Employee)objectInputStream.readObject();
			System.out.println(employee);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
