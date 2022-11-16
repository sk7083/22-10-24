package day18;

import java.util.Scanner;
import java.util.regex.Pattern;



public class RegexEx02 {

	public static void main(String[] args) {
		//아이디 정규 표현식
		//5~20자의 영문 소문자, 숫자, 특수기호 _와 - 만 사용가능합니다.
		String regex = "^[a-z0-9_\\-]{5,20}$";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");
		String str = sc.next();
	
		
		boolean res = Pattern.matches(regex, str);

		if(res) {
			System.out.println("생성 완료");
		} else {
			System.out.println("실패!");
		}
	}

}
