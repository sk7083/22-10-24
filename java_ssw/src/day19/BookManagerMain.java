package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagerMain {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/* 도서 관리 프로그램을 작성하세요.
		 * 도서 정보 : 도서명, 저자(여러명, 엮은이, 옮긴이 다 포함), 가격, 출판사, 분류, ISBN
		 * 
		 * 기능
		 * - 도서 추가
		 *  - 도서 정렬은 ISBN순으로
		 * - 도서 조회
		 *  - 도서명으로 조회
		 *  - 저자로 조회
		 *  - 출판사로 조회
		 *  - 분류로 조회
		 */
		

		ArrayList<Object> list = new ArrayList<>();
		int menu;

		do {
			System.out.println("===============메뉴===============");
			System.out.print(" 1. 도서 추가  |");
			System.out.print(" 2. 도서 조회  |");
			System.out.println(" 3. 종료");
			System.out.println();
			System.out.println("메뉴를 선택하세요 : ");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("도서를 추가합니다.");
				System.out.println("도서명 : ");
				String bookName = sc.next();
				System.out.println("저자 : ");
				String writer = sc.next();
				System.out.println("출판사 : ");
				String company = sc.next();
				System.out.println("분류 : ");
				String sort = sc.next();
			
				list.add(bookName);
				list.add(writer);
				list.add(company);
				list.add(sort);
				

				System.out.println(list.toString());
				break;
			case 2:
				System.out.println("검색할 도서 정보를 입력하세요.");
				System.out.println("도서명 : ");
				String bookName1 = sc.nextLine();
				System.out.println("저자 : ");
				String writer1 = sc.next();
				System.out.println("출판사 : ");
				String company1 = sc.next();

				
				
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
			
		} while (menu != 3);
	}

}
