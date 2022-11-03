package day09;

import java.util.Scanner;

public class BaseballManager {

	public static void main(String[] args) {
		/* 숫자 야구 게임을 플레이 한 후, 기록을 저장하는 프로그램을 작성하세요.
		 * 메뉴
		 * 1. 플레이
		 * 2. 기록확인
		 * 3. 종료
		 * 
		 * 메뉴 선택 : 2
		 * 1. 홍길동 2회
		 * 2. 임꺽정 3회
		 * 3. 이몽룡 3회
		 * 4. 춘향이 4회
		 */
		int min = 1, max = 9, size = 3;
		int []com = createRandomArray(min, max, size);
		printArray(com);
		
		
		int menu;
		int cnt = 0;
		
		do {
			//메뉴를 출력
			printMenu();
			//메뉴 선택 (입력)
			menu = selectMenu();
			
			//선택한 메뉴에 맞는 기능 실행
		//	cnt = runMenu(menu, list,cnt);
			
		} while (menu != 3);
		
	}
		
/* 교수 풀이
 * 
 *메뉴 출력
 *
 *메뉴 선책
 *
 *선택한 메뉴에 따른 기능 실행
 *	1. 플레이
 *		//컴퓨터가 랜덤으로 숫자 생성
 *
 *		//사용자가 숫자 입력(반복)
 *
 *		//판별(반복)
 *
 *		//3s 종료
 *
 *		//[new] 횟수를 기록 (최대 5등까지) /
 *		// 5등 기준으로 횟수가 동일한 경우 먼저 플레이한 사용자 기록을 유지
 *
 *	2. 기록확인
 *
 *		//등록된 5위까지의 기록을 확인
 *
 *	3. 종료
 * 
 */
	
//=================== 기 능 (메소드) ==========================

	  
	//메뉴 출력
		public static void printMenu() {
			System.out.println("==========메인 메뉴==========");
			System.out.println("1. Play Game");
			System.out.println("2. 기록 확인");
			System.out.println("3. 게임 종료");
			System.out.println("==========================");
			System.out.println("메뉴를 선택해주세요 : ");
		}
	//메뉴 선택
		public static int selectMenu() {
			Scanner sc = new Scanner(System.in);
			return sc.nextInt();
		}
//=========================================================================	
		
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		/*
		//선택한 메뉴에 따른 기능 실행
		public static int runMenu(int menu, com[], int cnt) {


			Scanner sc = new Scanner(System.in);
			switch (menu) {
			case 1:
				// 1. 플레이
				// 컴퓨터가 랜덤으로 숫자 생성
				

				// 사용자가 숫자 입력(반복)

				// 판별(반복)

				// 3s 종료

				// [new] 횟수를 기록 (최대 5등까지) /
				// 5등 기준으로 횟수가 동일한 경우 먼저 플레이한 사용자 기록을 유지
			case 2:
				// 2. 기록확인

				// 등록된 5위까지의 기록을 확인
			case 3:
				// 3. 종료
				System.out.println("게임을 종료합니다.");
			default:
				System.out.println("해당 키는 존재하지 않습니다.");
			}
		}
		*/
//=========================================================================	
		/* 기능 		: 정수 값이 배열에 존재하고 있는지를 판단하는 메소드
		 * 매개변수	: int []arr, int num
		 * 리턴타입	: boolean
		 * 메소드명	: contains
		 * */	
		public static boolean contains(int [] arr, int num) {
			if(arr == null || arr.length == 0) {
				//배열 arr가 null이거나 또는 배열 arr의 [크기]가 0일 경
				System.out.println("arr[]의 값이 null이거나 arr.length가 0입니다.");
				return false;	//false 값을 리턴하겠다. (메소드 종료)
			}
			for(int tmp : arr) {	//배열 arr의 값들을 정수 tmp에 값을 내보냄
				if(num == tmp) {	//만약 num의 값이 tmp와 같다면
					System.out.println(num+" 값이 arr[]안에 존재합니다.");
					return true;	//true을 리턴하겠다. (메소드 종료)
				}
			}
			System.out.println(num+" 값이 arr[]안에 존재하지 않습니다.");
			return false;
		}
//========================================================================	
		//최소값과 최대값 사이에 랜덤한 수를 생성하는 메소드

		public static int random(int min, int max) {
			if (min > max) { // 순서가 바뀌엇을 경우에도 제대로 처리 가능하게하는 코드
				int tmp = min; // min ~ max 가 아닌 max ~ min인 경우
				min = max;
				max = tmp;
			}
			return (int) (Math.random() * (max - min + 1) + min);

		}
//========================================================================
		public static int countArray(int[] arr1, int[] arr2) {
			if (arr1 == null || arr2 == null) {
				//배열 arr1이 null이거나 또는 배열 arr2가 null일 경우
				return 0;		//값을 0으로 리턴하겠다. (메소드 종료)
			}
			int count = 0;
			for (int tmp : arr1) {
				if (contains(arr2, tmp)) {
					count++;
				}
			}
			return count;
		}
//=========================================================================
		public static int[] createRandomArray(int min, int max, int size) {
			if (max - min + 1 <= size) {
				return null; // 예외처리용 코드
			}
			int arr[] = new int[size];	//arr[]는 size(직접 입력)의 크기를 가진 배열.
			// => i는 0부터; i가 배열의 크기보다 작을 때까지; 증감식이 없으므로 무한 루프
			for (int i = 0; i < arr.length;) {
				// 랜덤한 수를 배열 i번지에 저장
				// => 랜덤한 수를 r에 저장
				int r = random(min, max);
				// 배열에 r이 없으면 [배열 i번지에 r을 저장한 후, i를 1증가]
				if (!contains(arr, r)) { // contains메소드 부정
					arr[i] = r; // 배열에 r 값을 넣겟다.
					i++;
				}

			}
			return arr;
		}
//=========================================================================	
		/* 기능 		: 배열의 값을 출력하는 메소드
		 * 매개변수	: int arr[]
		 * 리턴타입	: 없음 => void
		 * 메소드명	: printArray
		 * */

		public static void printArray(int arr[]) {
			if (arr == null) {		// 배열 arr가 null일 경우
				return;				// 값을 리턴하겠다. (메소드 종료)
			}

			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

		}
//=========================================================================	
	}

/* 1. 메뉴창
 * 
 * 	1) 플레이
 * 	2) 기록확인
 * 	3) 종료
 * 
 * 2. 메뉴 선택을 통한 메뉴 이동
 * 
 * 	1) 플레이
 * 		게임하는 장소로 이동
 * 	2) 기록확인
 * 		기록을 보관한 장소로 이동
 * 	3) 종료
 * 		게임 종료
 * 
 * 3. 게임 종료
 */






