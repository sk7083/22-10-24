package day27;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class Ex01_Client {

	public static void main(String[] args) {
		Socket socket = null;
		String ip = "192.168.20.34";
		try {
			socket = new Socket("localhost", 5001);
			System.out.println("[연결 시도 중]");
			socket.connect(new InetSocketAddress(ip, 5001));
			//socket.connect(ip, 5001);
			System.out.println("[연결 성공]");
			send(socket, null);
			recieve(socket);
		}catch (Exception e) {
			System.out.println("[연결 실패]");
		}
		
	}
	public static void recieve(Socket socket) {
		Thread t = new Thread(() -> {
			InputStream is = null;
			try {
				byte [] bytes = new byte[1024];
				is = socket.getInputStream();
				while (true) {
					// bytes에서 읽어온 것을 readCount 길이만큼 저장(int인 이유)
					int readCount = is.read(bytes);
					// readCount 개수만큼 반환하는데 인코딩은 UTF-8
					if (readCount == -1)
						break;
					String str = new String(bytes, 0, readCount, "UTF-8");
					int index = str.indexOf(",");
					if(index == -1)
						continue;
					String name = str.substring(0, index);
					String message = str.substring(index+1);
					System.out.println(name + ">"+ message);
				}
				is.close();
			} catch (Exception e) {

			} finally {

				try {
					if (socket != null && !socket.isClosed()) 
						socket.close();
					System.out.println("[클라이언트 종료]");
				} catch (Exception e2) {
					System.out.println("클라이언트 소켓 닫기 실패");
					
				}
			}
		});
	}

	public static void send(Socket socket, String name) {
		Scanner scan = new Scanner(System.in);
		Thread t = new Thread(() -> {
			try {
				OutputStream os = socket.getOutputStream();
				while (true) {
					String str = scan.nextLine();
					if (str.equals("exit")) {
						break;
					}
					str = name + ","+str;
					byte[] bytes = str.getBytes("UTF-8");
					os.write(bytes);
					os.flush();
				}
				
			} catch (Exception e) {

			} finally {
				try {
					if(socket != null && socket.isClosed())
						socket.close();
				} catch(Exception e) {
					
				}
			}
		});
		t.start();
	}
}


