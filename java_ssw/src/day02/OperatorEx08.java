package day02;

import java.util.Scanner;

public class OperatorEx08 {

	public static void main(String[] args) {
		/*
		 * 정수를 입력받아 입력받은 정수가 홀수인지 짝수인지 출력하는 코드를 작성하세요 예시 정수를 입력하세요 : 5 5는 홀수입니다.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();

		boolean a = (num % 2) == 0;
		//입력받은 정수가 2로 나누었을 때 나머지가 0이면 true
		String result = a ? "짝수" : "홀수";
		//true일때 "짝수" false일때 "홀수"를 입력받는다.
		System.out.println(num + "은" + result + "입니다.");

		sc.close();

	}

}
