package day03;

import java.util.Scanner;

public class IfEx06 {

	public static void main(String[] args) {
		/*
		 * Scanner를 입력받아 +, -, /, *, %면 산술연산자라고 출력하고 아니면 산술연산자가 아닙니다라고 출력하는 코드를 작성
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("+, -, *, /, % 중 하나를 선택해주세요.");

		//char num = sc.next().charAt(0);

		/* 첫번째 방법
		 * 
		if (num == '+') {
			System.out.println("입력받은 문자는 + 입니다.");
		} else if (num == '-') {
			System.out.println("입력받은 문자는 - 입니다.");
		} else if (num == '*') {
			System.out.println("입력받은 문자는 * 입니다.");
		} else if (num == '/') {
			System.out.println("입력받은 문자는 / 입니다.");
		} else if (num == '%') {
			System.out.println("입력받은 문자는 % 입니다.");
		} else {
			System.out.println("산술연산자가 아닙니다.");
		}
		*/
		
//=====================================================
		
		/* 두번째 방법
		 * 
		if (num == '+' || num == '-' || num == '/' || num == '*' || num == '%') {
			System.out.println("입력받은 문자는 산술연산자입니다.");
		} else {
			System.out.println("입력받은 문자는 산술연산자가 아닙니다.");
		}
		*/
		
//=====================================================
		sc.close();

	}

}
