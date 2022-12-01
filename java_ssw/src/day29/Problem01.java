package day29;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 아래 코드를 실행했을 때 결과와 그렇게 나오는 이유를 설명하세요.
		 * 두 결과가 모두 true가 되려면 코드를 어떻게 수정해야 하는지?*/
		/* 결과 true / false
		 * 이유 : "abc"는 리터럴 문자열이다.
		 * 		이미 사용된 리터럴 문자열을 이용하는 경우, 새로 선언하는 것이
		 * 		아니라 기존에 선언된 리터럴 문자열의 주소를 알려줌.(공유됨)
		 * 		Scanner를 이용하여 입력받은 문자열은 리터럴 문자열이 아니기 때문에
		 * 		입력한 문자열이 앞에 사용중인 리터럴 문자열이더라도 새로 할당하여 주소를 넘겨줌
		 * 		그래서 두 번째 출력은 공유하는게 아니기 때문에 false가 됨
		 * 		올바르게 동작하려거든 equals 사용
		 * 		str1.equals(str2)
		 * */
		String str1 = "abc";
		//기존 str1의 값인 "abc"는 리터럴문자이며, str2에서 동일하게
		//입력햇을 경우 추가적으로 "abc"라는 리터럴 문자를 만드는게 아닌
		//주소를 공유하기에 둘은 같은 문자로서 결과는 true다.
		String str2 = "abc";
		String str3 = sc.next();	//abc를 입력햇다고 가정
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		sc.close();
	}

}
