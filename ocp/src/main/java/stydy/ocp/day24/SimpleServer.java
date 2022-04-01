package stydy.ocp.day24;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SimpleServer {
	
	public static void main(String[] args) throws Exception {
		//建立ServerSocket
		int port = 5001;
		ServerSocket server = new ServerSocket(port);
		String serverIP = InetAddress.getLocalHost().getHostAddress();
		System.out.println(serverIP);
		//建立server
		Socket socket = server.accept();
		System.out.printf("Client端已連入，%s , %d\n", socket.getInetAddress(), socket.getPort());
		
		//建立 Input/output Stream 取得連進來的Client 端資料
		ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			//讀取Client端message
			String message = (String)objectInputStream.readObject();
			if (message.equalsIgnoreCase("exit")) {
				System.out.println("通訊結束");
				break;
			}
			System.out.print("client端訊息:");
			System.out.println(message);
			//回應Client端
			System.out.print("回應Client端訊息:");
			objectOutputStream.writeObject(scanner.next());
		}
		
		//關閉Socket
		System.out.println("Socket連線關閉");
		socket.close();
	}

}
