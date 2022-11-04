package day10;

import java.util.Scanner;

import day08.MethodBaseballGameEx01;

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
		int menu;
		Record [] records = new Record [5];	//5등까지만 저장할 것이기에 크기는 5
			//메뉴를 출력
		do {
			printMenu(				//메뉴를 불러옴
					"---------",
					"메뉴",
					"1. 플레이",
					"2. 기록확인",
					"3. 종료",
					"---------",
					"메뉴 선택 : "
					);
			//메뉴 선택
			menu = selectMenu();	//selectMenu메뉴를 불러옴
			//선택한 메뉴에 따른 기능 실행
			runMenu(menu, records);	//메뉴가 주어지면 메뉴에 맞게 실행
		} while(menu != 3); 
			/*
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
	}
	
//=================== 기 능 (메소드) ==========================

	  /* 메뉴를 출력하는 메소드로, 마지막 메뉴는 엔터를 안침
	   * @param strs 콘솔에 출력할 메뉴들
	   */
		public static void printMenu(String ... strs) {
			for(int i = 0; i< strs.length; i++) {
				/*
				System.out.print(strs[i]);
				if (i != strs.length - 1) {
					//마지막이 아닐 경우 
					System.out.println();
				} */
				System.out.print(strs[i] + (i!= strs.length-1?"\n": ""));
				//위 주석을 이 한줄로 조건 선택 연산자로 구현 가능
			}
		}


//=========================================================================	
		private static int selectMenu() {
			Scanner sc = new Scanner(System.in);
			return sc.nextInt();
		}

//=========================================================================	
		/*주어진 메뉴에 맞는 기능을 실행하는 메소드
		 * @param menu 실행할 메뉴 번호
		 */
		
		private static void runMenu(int menu, Record[] records) {
			switch(menu) {
			case 1 :

				//1. 플레이
				 //컴퓨터가 랜덤으로 숫자 생성
				 int []com = MethodBaseballGameEx01.createRandomArray(1, 9, 3);
				 MethodBaseballGameEx01.printArray(com);
				 BaseballGame bg = new BaseballGame(com);
				 
				 int tryCount = 0;
				 do {
					 	//사용자가 숫자 입력(반복)
					 	int []user = MethodBaseballGameEx01.scanArray(new Scanner(System.in), 3);
					 	bg.setUser(user);
					 	
					 	//결과 출력
					 	bg.printResult();
					 	tryCount++;
				 } while(bg.getStrike() != 3);
			 		//[new] 횟수를 기록 (최대 5등까지) /
			 		// 5등 기준으로 횟수가 동일한 경우 먼저 플레이한 사용자 기록을 유지
				 //기록된 최대 회수를 찾음(꼴지 횟수)
				 int maxRecordCount = getMaxRecordCount(records);
				 //기록된 수를 찾음(꼴찌 순위를 찾음)
				 int maxrecordRank = getMaxRecordRank(records);
				 //기록된 최대 횟수가 내 횟수보다 크거나(꼴지보다 기록이 좋은 경우) 기록된 수가 5보다 작으면(5등 이내) 기록
				 if (maxRecordCount > tryCount || maxrecordRank < 5){
					 addRecord(records, tryCount);
				 }
				 break;
			case 2 :
					//2. 기록확인
					//등록된 5위까지의 기록을 확인
				printRecords(records);
				break;
			case 3 :
					//3. 종료
				break;
			default :
			}
		}
		private static void printRecords(Record[] records) {
			for(int i = 0; i<records.length; i++) {
				System.out.print(i+1+"위 ");
				if(records[i] != null) {
					records[i].print();
					
				} else {
					System.out.println();
				}
			}
	
}

		private static void addRecord(Record[] records, int tryCount) {
			Scanner scan = new Scanner(System.in);
			System.out.print("이름을 입력(예 : JIK) : ");
			String name = scan.next();
			Record r = new Record(tryCount, name);
			int index = 0;
			for(Record record : records) {
				if(record != null && record.getCount() <= tryCount) {
					index++;
				}
			}
			//뒤에서부터 순위를 땡겨옴 
			for(int i = records.length-1; i>index; i--) {
				records[i] = records[i-1];
			}
			records[index] = r;
}

		private static int getMaxRecordRank(Record[] records) {
			int rank = 0;
			for(Record record : records) {
				if(record != null) {	//누군가 기록이 없을 경우엔 null
					rank++;
				}
			}
			return 0;
		}

		/*메뉴를 콘솔에서 입력받아 돌려주는 메소드
		 * @param 입력받은 메소드
		 */
		private static int getMaxRecordCount(Record[] records) {
			int count = 99999;
			for(Record record : records) {
				if(record != null) {
					record.getCount();
				}
			}
			return count;
		}
		
		
}





