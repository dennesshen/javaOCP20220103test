package stydy.ocp.day24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class WebServer {
	public static void main(String[] args) throws Exception {
		WebServer webServer = new WebServer();
		webServer.start();
		
	}
	
	public void start() throws Exception {
		ServerSocket server;
		System.out.println("WebSserver 啟動");
		server = new ServerSocket(80);
		while (true) {
			//建立連接
			Socket socket = server.accept();
			System.out.println("瀏覽器連線成功");
			
			//接收輸入配置

			InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
			BufferedReader in = new BufferedReader(inputStreamReader);
			System.out.println("test1");

			//製造輸出配置
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream(), "big5");
			BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
			PrintWriter out = new PrintWriter(bufferedWriter, true);
			System.out.println("test2");
			
			//接收輸入
			System.out.println("瀏覽器傳來的資料 : " + in.readLine());
			
			//回應給web端
			//HTTP 文件結構(4 part)
			//Part1 :init line
			out.println("HTTP/1.1 200 ok");
			
			//part2 : header info
			out.println("Content-Type: text/html");
			out.println("Server: GjunWebServer"+ new Date().getTime());
			
			//part3 : blank
			out.println();
			//part4 : Body(回應給瀏覽器的HTML內容)
			out.println("<H1>"+ new Date() + "</H1>");
			out.close();
			System.out.println("test3");
		}
		
	}
}
