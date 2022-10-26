package day03;

import java.util.Scanner;

public class IfEx01 {

	public static void main(String[] args) {
		
		//정수 num가 0과 같으면 0이라고 출력
		
		//정수 num가 0보다 작으면 음수라고 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println(num + "은 양수");
		}
		
		if (num == 0) {
			System.out.println(num);
		}
		
		if (num < 0) {
			System.out.println(num + "은 음수");
		}
		
		sc.close();
		
		//정수 num가 0과 같으면 0이라고 출력
		
		//정수 num가 0보다 작으면 음수라고 출력

	}
}
