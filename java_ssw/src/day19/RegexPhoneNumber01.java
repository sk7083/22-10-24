package day19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPhoneNumber01 {

	public static void main(String[] args) {
		/* 전화번호 정규표현식을 작성하여 입력받은 번호가 전화번호가 맞는지 출력하는 코드를
		 * 작성하세요.
		 * 규칙 1
		 * 010-1234-5678 [o]
		 * 01012345678 [x]
		 * 011-1234-5678 [x]
		 * 
		 * [풀이]
		 * 010-[0-9]{4}-[0-9]{4}
		 * 010-\d{4}-\d{4}
		 * 010(-\d{4}){2}
		 * */
		
			String regex = "010-[0-9]{4}-[0-9]{4}";
			
			Scanner sc = new Scanner(System.in);
			System.out.println("번호를 입력하세요 : ");
			String str = sc.next();
		
			
			boolean res = Pattern.matches(regex, str);

			if(res) {
				System.out.println("생성 완료");
			} else {
				System.out.println("실패!");
			}
		}
	}


