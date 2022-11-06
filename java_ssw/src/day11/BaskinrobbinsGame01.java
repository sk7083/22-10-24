package day11;

import java.util.Scanner;

public class BaskinrobbinsGame01 {

	public static void main(String[] args) {

		int winCnt = 0;
		int lossCnt = 0;
		int result = 0;

		while (true) {

			System.out.println("=====메뉴=====");
			System.out.println("1. 플레이");
			System.out.println("2. 기록확인");
			System.out.println("3. 종료");
			System.out.println("=============");
			System.out.println("메뉴를 선택해주세요 : ");

			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();

			game(1,3,10);

		}
	}
//=======================================================
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
					System.out.println("유저 승리!");
					return 1;
				}
			}
			System.out.println();

			System.out.print("몇 번을 입력하시겠습니까? (최대 3번) : ");
			System.out.println();
			int me = sc.nextInt();
			System.out.println();
			System.out.print("유저 숫자 : ");
			for (int i = 0; i < me; i++) {
					num++;
					System.out.print(num + " ");
					
				if (me == lastNum) {
					System.out.println("com 승리!");
					return 0;
				}	
			}

			System.out.println();
		}
	}
//=====================================================================
	public static void reGame() {
		System.out.println("");
	}

}
