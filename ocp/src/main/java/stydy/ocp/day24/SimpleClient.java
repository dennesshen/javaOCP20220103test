package stydy.ocp.day24;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SimpleClient {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入 ServerSocket IP");
		String ip = sc.next();
		System.out.println("請輸入 ServerSocket Port");
		int port = sc.nextInt();
		Socket socket = new Socket(ip, port);
		System.out.println("與server 端建立連線成功");
		
		//建立 Input/output Stream 取得連進來的Client 端資料
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
		ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			//傳訊息給Server端
			System.out.println("輸入要給予server端訊息:");
			String message = sc.next();
			objectOutputStream.writeObject(message);
			
			if (message.equalsIgnoreCase("exit")) {
				System.out.println("通訊結束");
				break;
			}
			//接收Server端回應
			System.out.println("Server端回應:");
			System.out.println((String)objectInputStream.readObject());
		}
		
		socket.close();
	}
}
