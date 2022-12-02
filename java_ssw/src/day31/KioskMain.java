package day31;

import java.util.ArrayList;
import java.util.Scanner;

public class KioskMain {

	/* 제품을 관리하는 프로그램을 작성하세요.
	 *  - 구매 가격, 판매 가격은 변동이 없음.
	 *  기능
	 *  - 제품 등록 (분류, 제품명, 수량, 구매 가격, 판매 가격)
	 *  - 제품 수정
	 *  - 제품 삭제
	 *  - 제품 구매(관리자가 구매, 입고)
	 *  - 제품 판매
	 *  - 매출액 확인
	 *   - 년별
	 *     - 제품별
	 *     - 전체
	 *   - 월별
	 *     - 제품별
	 *     - 전체
	 *   - 일별
	 *     - 제품별
	 *     - 전체
	 *
	 * 예시)
	 * 
	 * 분류 : 식품
	 * 제품명 : 진라면
	 * 수량 : 0
	 * 구매 가격 : 400원
	 * 판매 가격 : 500원
	 * 
	 * 진라면 100개 구매 => 진라면 수량 100개
	 * 진라면 10개 판매(날짜) => 진라면 수량 90개
	 *
	 *
	 * */
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<ProductManager> proList = new ArrayList<ProductManager>();
		int menu = 0;
		
		do {
			//메뉴 출력
			printMenu();
			menu = sc.nextInt();
			selectMenu(menu);
		} while(menu != 3);
	}
	//메뉴 출력
	public static void printMenu() {
		System.out.println("============[제품 관리 프로그램]============");
		System.out.println("1. 제품 관리 |  2. 매출액 관리 |  3. 종료");
		System.out.println("메뉴 선택 : ");
	}
	//선택에 따른 메뉴 실행
	public static void selectMenu(int menu) {
		
		switch (menu) {
		case 1:
			//제품 관리
			productMenu();
			int subMenu1 = sc.nextInt();
			productRunMenu(subMenu1);
			break;
		case 2:
			//매출액 관리
			SellMenu();
			int subMenu2 = sc.nextInt();
			sellRunMenu(subMenu2);
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}
	//제품 관리 메뉴 출력
	public static void productMenu() {
		System.out.println("============[제품 관리 메뉴]============");
		System.out.println("1. 제품 등록 |  2. 제품 수정 |  3. 제품 삭제 ");
		System.out.println("4. 제품 구매 |  5. 제품 판매 |  6. 이전 화면 ");
		System.out.println("메뉴 선택 : ");
	}
	//제품 관리에서 선택에 따른 기능 실행할 곳
	public static void productRunMenu(int subMenu1) {
		//실제적으로 기능들이 작동하는 장소
		switch (subMenu1) {
		case 1:
			//제품 등록
			break;
		case 2:
			//제품 수정
			break;
		case 3:
			//제품 삭제
			break;
		case 4:
			//제품 구매
			break;
		case 5:
			//제품 판매
			break;
		case 6:
			//이전 화면
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}
	//매출액 메뉴 출력
	public static void SellMenu() {
		System.out.println("============[매출액 관리 메뉴]===========");
		System.out.println("1. 년도별 확인 |  2. 월 별 확인 |  3. 일 별 확인 ");
		System.out.println("메뉴 선택 : ");
	}
	//매출액 서브 메뉴 출력
	public static void SubMenu() {
		System.out.println("=========[상세 메뉴]========");
		System.out.println("1. 제품별 확인 |  2. 전체 확인 ");
		System.out.println("메뉴 선택 : ");
	}
	
	//매출액 관리에서 선택에 따른 기능 실행할 곳
	public static void sellRunMenu(int subMenu2) {
		//실제적으로 기능들이 작동하는 장소
		switch (subMenu2) {
		case 1:
			//년도별 확인
			SubMenu();
			break;
		case 2:
			//월 별 확인
			SubMenu();
			break;
		case 3:
			//일 별 확인
			SubMenu();
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}
}

