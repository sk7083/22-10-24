package day11;

import java.awt.Container;
import java.util.Scanner;

import day04.ContinueEx01;

public class BaskinrobbinsGame {
	public static void main(String[] args) {
		/*
		 * 베스킨라빈스 게임 규칙) user와 com가 1 ~ 3개의 숫자를 번갈아가면서 불러서 31을 외치면 패배
		 */
		

		System.out.println("=====메뉴=====");
		System.out.println("1. 플레이");
		System.out.println("2. 기록확인");
		System.out.println("3. 종료");
		System.out.println("=============");
		System.out.println("메뉴를 선택해주세요 : ");
		// 메뉴 선택
		menu = SelectMenu();
		// 선택의 따른 기능
		runMenu(menu, min, max);
		// 1. 플레이
		// 컴퓨터가 랜덤으로 1 ~ 3개의 숫자를 부름 (ex : 1 2 3 혹은 1 2)
		// 사용자가 몇개의 숫자를 부를 지 입력(컴퓨터가 3까지 입력한 상태에서 유저가 2를 입력 시 4 5 가 출력)

		// 2. 기록 확인
		// 유저의 승리 수
		// 컴퓨터의 승리 수
		// 3. 종료
	}
	static int menu;
	static int max = 3;
	static int min = 1;
	// 선택에 따른 기능 실현
	private static void runMenu(int menu, int min, int max) {
			
			Scanner sc = new Scanner(System.in);
			int userWin = 0;
			int comWin = 0;
			
			
			switch (menu) {
			
			case 1 :
				

				System.out.println("게임을 시작합니다.");
				//1. 플레이

				//컴퓨터가 랜덤으로 1 ~ 3개의 숫자를 부름 (ex : 1 2 3 혹은 1 2)
				int lastNum = 10;
				int myNum = 0;
				int comNum = 0;
				boolean result = true;
				boolean stop = true;
				boolean Additional = false;
				
				
				while (result) {
					int r = (int) (Math.random() * (max - min + 1) + min);
					System.out.print("com 숫자 : ");
					for(int i = myNum; i<myNum + r; i++) {
						comNum = i+1;
						System.out.print(comNum + " ");
						if(comNum == lastNum) {
							stop = false;
							System.out.println();
							System.out.println("유저 우승!");
							userWin++;
							additionalGames();
							break;
							
						}
					}
					System.out.println();
					
				
					
					
					if(Additional) {
						char check = sc.next().charAt(0);
						if(check == 'y') {
							System.out.println("게임을 시작합니다.");
							result = true;
							myNum = 0;
							comNum = 0;
							stop = true;
							Additional = false;
							continue;
						} else {
							System.out.println("게임을 종료합니다.");
							break;
						}
					}
					 
					
					//컴터와 승부를 해서 끝날 경우
		
					
					System.out.println("몇번 입력하시겠습니까? : (최대 3번)");
					int a = sc.nextInt();
					for(int j =0; j<a; j++) {
						myNum = sc.nextInt();
						System.out.print(myNum + " ");
						if(myNum == lastNum) {
							stop = false;
							System.out.println();
							System.out.println("com 우승!");
							comWin++;
							additionalGames();
							break;
						}
					}
					System.out.println();

				}
				break;

			case 2 :
				//2. 기록 확인
				System.out.println("기록을 확인합니다.");
				//유저의 승리 수
				System.out.println("유저 승리 수 : " + userWin);
				//컴퓨터의 승리 수
				System.out.println("com 승리 수 : " + comWin);
				break;
			case 3 :
				System.out.println("게임을 종료합니다.");
				//3. 종료
				break;
			default :
				System.out.println("잘못된 입력입니다.");
				sc.close();
			}
			
		}

	private static void additionalGames() {

		Scanner sc = new Scanner(System.in);
		System.out.println("게임을 더 하시겠습니까? (y/n)");
		char c = sc.next().charAt(0);
		if(c == 'y') {
			runMenu(menu, min, max);
		} else if (c == 'n') {
			System.out.println("메뉴로 돌아갑니다.");
			printMenu();
			SelectMenu();
		}
		sc.close();

		
		
	}

	// 메뉴를 선택하는 메소드
	private static int SelectMenu() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}


		


}
