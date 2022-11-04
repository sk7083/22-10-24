package testhooom;

import java.util.Scanner;

public class SSWUpDownGameManager {
	public static void main(String[] args) {
		/*
		 * UpDown게임을 구현하세요.
		 * 
		 * 1. 플레이 2. 기록확인 3. 종료
		 */
//===========================================================
		// 반복

		// 메뉴 출력

		// 메뉴 선택

		// 메뉴에 따른 기능 실행

		// 플레이
		// 랜덤 수 생성

		// 반복
		// 사용자 입력

		// UP DOWN 판별
		// 기존 기록보다 좋으면 기록을 추가

		// 기록확인
		// 기록된 순위를 출력

		// 종료
//=====================메인문================================
		Scanner sc = new Scanner(System.in);
		int size;
		int min = 1;
		int max = 10;
		int com;
		int cnt = 0;
		// 반복

		// 메뉴 출력
		System.out.println("=====메뉴=====");
		System.out.println("1. 게임 시작");
		System.out.println("2. 기록 확인");
		System.out.println("3. 종료");
		System.out.println("메뉴를 선택하세요 : ");
		// 메뉴 선택
		int menu = sc.nextInt();
		// 메뉴에 따른 기능 실행
		switch (menu) {

		case 1:// 플레이
			System.out.println("게임을 시작합니다.");
			// 랜덤 수 생성
			int r = (int) (Math.random() * (max - min + 1) + min);
			com = r;
			// 반복
			for (int i = 0; i > 0; i++) {
			
				while (true) {
					boolean check = false;
					// 사용자 입력
					int userNum = sc.nextInt();
					// 사용자가 입력을 할때마다 카운터를 셈
					cnt++;
					// UP DOWN 판별
					if (userNum == com) {
						System.out.println("정답입니다.");
						check = true;
					} else if (userNum < com) {
						System.out.println("DOWN");
					} else if (userNum > com) {
						System.out.println("UP");
					}

					if (check) {
						break;
					}
				}
			}

			// 기존 기록보다 좋으면 기록을 추가
			break;
		case 2:
			System.out.println("기록을 확인합니다.");
			break;
		case 3:
			System.out.println("게임을 종료합니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}

		// 기록확인
		// 기록된 순위를 출력

		// 종료

		sc.close();
	}
}
