package day03;

import java.util.Scanner;

public class IfEx07 {

	public static void main(String[] args) {
		/*
		 * 두 정수와 문자를 입력받아 산술연산자이면 산술연산 결과를 출력하는 코드를 작성하세요. 예시 두 정수와 문자를 입력하세요 (예: 1 + 2)
		 * : 1 / 2
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("두 정수를 입력해주세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("산술연산자를 입력해주세요.");
		char c = sc.next().charAt(0);

		if (c == '+') {
			System.out.println(a + " + " + b + " = " + (a + b));
		} else if (c == '-') {
			System.out.println(a + " - " + b + " = " + (a - b));
		} else if (c == '*') {
			System.out.println(a + " * " + b + " = " + (a * b));
		} else if (c == '/') {
			System.out.println(a + " / " + b + " = " + (double)(a / b));
		} else if (c == '%') {
			System.out.println(a + " % " + b + " = " + (a % b));
		} else {
			System.out.println("산술연산자가 아닙니다.");
		}

		sc.close();
	}

}
