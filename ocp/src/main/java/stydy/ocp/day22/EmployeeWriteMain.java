
package stydy.ocp.day22;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeWriteMain {
	public static void main(String[] args) {
		Employee employee = new Employee("John");
		System.out.println(employee);
		String path = "src/main/java/stydy/ocp/day22/files/john.ser";
		try(FileOutputStream fileOutputStream = new FileOutputStream(path);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
			objectOutputStream.writeObject(employee);
		} catch (Exception e) {
		}
		
	}
}
