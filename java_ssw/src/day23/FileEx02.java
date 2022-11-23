package day23;

import java.io.File;
import java.io.IOException;

public class FileEx02 {
	public static void main(String[] args) {
		//파일명.mkdir 주의
		//상위 폴더가 없는 경우 false 발생
		//이미 같은 이름의 폴더가 존재하는 경우 false 발생
		File f = new File("D:/test");
	
			//폴더 생성 시 파일명.mkdir 사용
			if (f.mkdir()) {
				System.out.println("폴더 생성");
			} else {
				System.out.println("폴더 생성 실패");
			}
//===========================================================
			
		//파일명.mkdirs
		//경로상에 모든 폴더를 한번에 생성.
		
		//주의
		//이미 같은 이름의 폴더가 존재하는 경우 false 발생
		File e = new File("D:/test2/test");
	
			//경로상 모든 폴더 생성 시 파일명.mkdirs 사용
			if (e.mkdirs()) {
				System.out.println("폴더들 생성");
			} else {
				System.out.println("폴더들 생성 실패");
			}
//===========================================================
		//생성한 파일이 폴더일 경우 폴더 명을 알려줌
		if(f.isDirectory())
			System.out.println("폴더 명 : " + f.getName());
		//생성한 파일이 파일일 경우 파일 명을 알려줌
		if(f.isFile())
			System.out.println("파일 명 : " + f.getName());
//===========================================================
		
		//삭제할 파일명.delete
		//삭제할 파일명의 파일을 삭제하는 기능
		if(f.delete()) {
			System.out.println("폴더가 삭제되었습니다.");
		} else {
			System.out.println("없는 폴더입니다.");
		}
	}
}
