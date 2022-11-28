package day26;

import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Ex04_ClientMain {

	public static void main(String[] args) {
		
		/*
		 * 서버에 연결을 요청하고, 연결이 되면 exit를 입력하기 전까지 
		 * 문자열을 서버에 전송함
		 */
		/* Client */
		Socket socket = null;
		// 소켓은 선언과 동시에 포트 번호를 입력해야함, 서버와 포트번호 일치해야함
		try {
			
			socket = new Socket();
			// connect을 통해 Address 5002에 연결
			socket.connect(new InetSocketAddress("192.168.10.6",5001));
			System.out.println("[연결 완료]");
			Client c = new Client(socket);
			c.send();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void send(Socket socket) {
		Scanner sc = new Scanner(System.in);
		try {
		OutputStream os = socket.getOutputStream();
		
		//반복할 구간
		while(true) {
		System.out.println("메세지 입력 : ");
		String str = sc.nextLine();	
		byte[] bytes = str.getBytes("UTF-8");
		//소켓에 잇는 OutputStream을 가져옴
		//break로 나가게 하지 않으면 os.close(); 오류남
		if(str.equals("exit")) {
			break;
		}
		bytes = str.getBytes();
		//byte타입 bytes을 보냄
		os.write(bytes);
		os.flush();
		}
		
		os.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
