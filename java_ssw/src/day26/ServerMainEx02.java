package day26;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMainEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//서버는 모두 UTF-8 할 것이기에 변수를 하나 만들어줌
		final String encode = "UTF-8";
		/*Server*/
		
		//서버 하나 당 클라이언트 한개만 연결 가능
		//다중 연결을 하기 위해선 쓰레드 사용이 필요.
		
		//실행 시엔 반드시 서버를 먼저 실행 후 Client을 실행해야 동작함.
		//실행중인 서버를 끄지 않고, 다시 한번 실행할 경우엔 에러 발생(이미 사용중인 포트에 접근하는 행위)
		//해결하기 위해선 포트 번호를 바꾸거나, 백그라운드로 포트 번호를 닫아줘야함
		//백그라운드 사용법 : 명령 프롬프트(cmd) 실행 후 - netstat -ano 검색
		//로컬 주소가 일치하는 (현재는 5001) TCP의 PID 번호를 찾는다.
		//이후엔 작업관리자의 세부정보에서 동일한 PID 찾은 후 삭제하면 재 사용 가능
		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket();
			//포트에 연결하기 위한 바인드 사용 (연결하기 위해서 새로 객체 생성 후 서버 번호(5001) 할당)
			serverSocket.bind(new InetSocketAddress(5001));
			//서버에 연결되기 까지 계속 대기하게끔 while(true) 사용
			while(true) {
				System.out.println("[연결 대기 중]");
				//연결 허용이 되었을 경우 소켓 객체을 생성함
				Socket socket = serverSocket.accept();
				//연결 되엇을 경우 Address(주소)값을 확인하기 위해 => 연결 되었는지 확인용
				InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println("[연결 수락] " + isa.getAddress());
				//@@파일을 읽어내는 예제
				InputStream is = socket.getInputStream();
				
				//[1024]는 byte 최대 크기
				byte []bytes = new byte[1024];
				//InputStream으로 읽어온걸 bytes로 변환하여 byte 크기만큼 넣어줌.
				int readCount = is.read(bytes);
				//(배열명, 시작 번지, readCount까지, UTF-8로 인코딩(encode))
				String str = new String(bytes, 0, readCount, encode);
				System.out.println(str);
				
//================콘솔에서 문자열을 입력받아========================
				//클라이언트로 전송하는 방법
				
				//소켓을 통해 입력을 받음
				OutputStream os = socket.getOutputStream();
				System.out.println("답변 : ");
				//str 과 bytes는 이미 변수 선언했기에 재사용
				str = sc.nextLine();
				//입력받은 str을 byte타입으로 변환(str -> byte bytes)
				bytes = str.getBytes(encode);
				//bytes을 씀.
				os.write(bytes);
				os.flush();
				System.out.println("[전송 완료]");
				is.close();
				os.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
