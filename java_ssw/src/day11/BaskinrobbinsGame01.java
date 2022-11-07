package day11;

import java.util.Scanner;

public class BaskinrobbinsGame01 {

	public static void main(String[] args) {

		int result = 0;

		while (true) {

			System.out.println("=============메뉴=============");
			System.out.print("1. 플레이 | ");
			System.out.print("2. 기록확인 | ");
			System.out.println("3. 종료");
			System.out.println("=============================");
			System.out.println("메뉴를 선택해주세요 : ");

			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();

			if (number == 1) {
				result = game(1, 3, 10);
			} else if (number == 2) {
				recordGame(result);
			} else if (number == 3) {
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}

		}

	}

//================================================================================
	static int winCnt = 0;
	static int lossCnt = 0;

	public static int game(int min, int max, int lastNum) {

		System.out.println("게임을 시작합니다.");
		int num = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			int r = (int) (Math.random() * (max - min + 1) + min);
			System.out.print("com의 숫자 : ");
			for (int i = 0; i < r; i++) { // 1 ~ 3번 반복
				num++;
				System.out.print(num + " ");

				if (num == lastNum) {
					System.out.println();
					System.out.println("마지막 번호인 " + lastNum + " 를 외쳤습니다.");
					System.out.println("유저 승리!");
					winCnt++;
					return 1;
				}
			}
			System.out.println();

			System.out.print("몇 번을 입력하시겠습니까? (최대 3번) : ");
			System.out.println();
			int me = 0;
			while (true) {
				me = sc.nextInt();
				if (0 >= me || me > 3) {
					System.out.println("잘못된 범위 입력입니다!!");
					System.out.print("몇 번을 입력하시겠습니까? (최대 3번) : ");
				} else {
					break;
				}
			}
			System.out.println();
			System.out.print("유저 숫자 : ");
			for (int i = 0; i < me; i++) {
				num++;
				System.out.print(num + " ");

				if (num == lastNum) {
					System.out.println();
					System.out.println("마지막 번호인 " + lastNum + " 를 외쳤습니다.");
					System.out.println("com 승리!");
					lossCnt++;
					return 0;
				}
			}

			System.out.println();
		}
	}

//================================================================================
	public static void recordGame(int result) {
		System.out.println("=============승패=============");
		System.out.println("유저 승리 수 : " + winCnt + "  | " + "패배 : " + lossCnt);
		System.out.println("com 승리 수 : " + lossCnt + " | " + "패배 : " + winCnt);

	}

}
