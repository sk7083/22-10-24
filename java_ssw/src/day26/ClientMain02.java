package day26;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Client*/
		Socket socket = null;
		//소켓은 선언과 동시에 포트 번호를 입력해야함, 서버와 포트번호 일치해야함
		try {
			socket = new Socket();
			//connect을 통해 Address 5001에 연결
			socket.connect(new InetSocketAddress(5001));
			System.out.println("[연결 완료]");
			//@@파일을 내보내는 예제
			//소켓을 통해 연결 (출력하기 위해 OutputStream 사용) / OutputStream 연결
			OutputStream os = socket.getOutputStream();
			System.out.println("문자를 입력 : ");
			String str = sc.nextLine();
			//문자열을 내보내기 위해선 byte[] 로 변환 후 보내야함(UTF-8로 사용하기 위해 변환)
			//전송 str.getBytes
			byte[] bytes = str.getBytes("UTF-8");
			//byte로 써주는 역할
			os.write(bytes);
			//flush 밀어주는 역할
			os.flush();
			//사용 후엔 닫아줘야함
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
