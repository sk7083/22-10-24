package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamEx01 {
	public static void main(String[] args) {
		//파일을 만들수는 있으나, 폴더가 없을 경우엔 에러 발생
		//지금같은 경우엔 자바파일에 test.txt 파일이 생성
		FileOutputStream fos = null;
		FileInputStream fis = null;
				
		try {
			fos = new FileOutputStream("test.txt");
			//파일명.write() 파일에 입력한 () 값 입력
			//byte가 맞지 않을 경우 원하는 값이 제대로 나오지 못함
			char ch = '\u0000';
			for(int i =0; i<200; i++) {
				//System.out.println(ch);
				fos.write(ch);
				++ch;
			}
			fis = new FileInputStream("test.txt");
			int num;
			for(int i = 0; i<200; i++) {
				num = fis.read();
				System.out.print((char)num);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다.");
		} catch (IOException e) {

		} finally {
			try {
				// 마지막엔 반드시 close 해야하며, main문이 중간에 끝날 수도 잇기에
				// 어떤 상황에서도 동작하는 finally에다가 써줘야함.
				// 그리고 마지막 try문으로 에러 처리까지 해줘야함
				fos.close();
				fis.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		
		
	}
}
