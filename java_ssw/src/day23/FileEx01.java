package day23;

import java.io.File;
import java.io.IOException;

public class FileEx01 {
	public static void main(String[] args) {
		/*절대 경로 예시) 위치 지정 시 한번에 그 위치로 이동함 
		 * C:\ProgramData\.user2\gitkraken\app-8.10.1
		  상대 경로 예시) 원하는 위치로 이동할때, 한 파일 한 파일씩 이동하며 진행
		*/
		//상대 경로로 생성한 경우
		//File f = new File("test.txt");
		//절대 경로로 생성한 경우
		File f = new File("C:/Users/user2/Downloads/test.txt");
		try {
			if (f.createNewFile()) {
				System.out.println("파일 생성");
			} else {
				System.out.println("생성 실패");
			}
		} catch (IOException e) {
			System.out.println("IOException 발생");
		}
	}
}
