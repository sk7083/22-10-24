package day15;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import day13.Score;

public class ListEx01 {

	public static void main(String[] args) {
		
		/*
		 * 리스트를 이용하여 다음 기능을 갖는 오늘의 할일 프로그램을 출력하는 코드
		 * -----------
		 * 메뉴
		 * 1. 할일 추가
		 * 2. 할일 확인
		 * 3. 할일 삭제
		 * 4. 종료
		 * 메뉴 선택 : 1
		 * -----------
		 * 할일 입력 : 저녁
		 * -----------
		 * 메뉴
		 * 1. 할일 추가
		 * 2. 할일 확인
		 * 3. 할일 삭제
		 * 4. 종료
		 * 메뉴 선택 : 2
		 * -----------
		 * 1. 오후 수업 참여
		 * 2. 저녁
		 * -----------
		 * 메뉴 선택 : 3
		 * 1. 오후 수업 참여
		 * 2. 저녁
		 * 삭제할 할일 번호 선택 : 1
		 * 1번 할일이 삭제되었습니다.
		 * 메뉴
		 * 1. 할일 추가
		 * 2. 할일 확인
		 * 3. 할일 삭제
		 * 4. 종료
		 * 메뉴 선택 : 4
		 * 종료
		 */
	

		
	
		ArrayList<String> todoList = new ArrayList<String>();
		int menu = -1;
		Scanner scan = new Scanner(System.in);
		do {
			// 메뉴 출력
			printMenu();
			try {
				// 메뉴 선택
				menu = scan.nextInt();
				// 선택한 메뉴 실행
				runMenu(todoList, menu);
			}catch(InputMismatchException e) {
				System.out.println("-------------");
				System.out.println("예외발생 : 정수를 입력하세요.");
				System.out.println("-------------");
				scan.nextLine();
			} 
			catch (Exception e) {
				System.out.println("-------------");
				System.out.println(e.getMessage());
				System.out.println("-------------");

			}
		} while (menu != 4);

	}

	private static void runMenu(ArrayList<String> todoList, int menu) throws Exception {
		Scanner scan = new Scanner(System.in);
		switch(menu) {
		case 1:
			//할일을 입력(공백 포함해서 입력)
			System.out.println("할 일 입력 :");
			String todo = scan.nextLine();
			//리스트에 입력된 할일을 추가
			todoList.add(todo);
			break;
		case 2:
			for(int i=0; i<todoList.size(); i++) {
				System.out.println(i + 1 + ". "+ todoList.get(i));
			}
			break;
		case 3:
			System.out.println("삭제할 할 일 번호를 선택하세요.");
			for(int i=0; i<todoList.size(); i++) {
			System.out.println(i + 1 + ". "+ todoList.get(i));
			}
			int remov = scan.nextInt();
			if(remov == 0 || remov >todoList.size()) {
				System.out.println("잘못된 번호 입력입니다!");
			} else {
			todoList.remove(remov-1);
			System.out.println(remov + "번을 삭제하셨습니다.");
			break;
			}
		case 4:
			System.out.println("프로그램 종료");
			break;
		default:
			throw new Exception("예외 발생 : 잘못된 메뉴입니다.");
		}
		
	}

	private static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 할 일 추가");
		System.out.println("2. 할 일 확인");
		System.out.println("3. 할 일 삭제");
		System.out.println("3. 종료");
		System.out.println("메뉴 선택 : ");
		
		
	}
	


}


