package day03;

import java.util.Scanner;

public class SwitchEx04 {

	public static void main(String[] args) {
		/*
		 * 월을 입력받아 해당하는 월의 마지막 일을 출력하는 코드를 작성하세요. 
		 * 31일 : 1 3 5 7 8 10 12 
		 * 30일 : 4 6 9 11
		 * 28일 : 2
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력해주세요 (1~ 12)");

		int a = sc.nextInt();

		switch (a) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println(a + "월은 31일까지 있습니다.");
		break;
		case 4, 6, 9, 11:
			System.out.println(a + "월은 30일까지 있습니다.");
		break;
		case 2:
			System.out.println(a + "월은 28일까지 있습니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}

		sc.close();

	}

}
