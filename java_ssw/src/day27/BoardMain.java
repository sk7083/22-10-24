package day27;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		
		/* 게시글 관리 프로그램
		 * - 회원가입
		 * 	- 처음 가입한 회원이 관리자, 그 외 회원은 일반 회원
		 * - 로그인
		 * - 게시글 등록/수정/삭제 => 회원만 가능
		 * - 카테고리 관리 (공지, 자유 게시판)
		 * - 카테고리 추가/수정/삭제 (관리자만 가능)
		 * */
		
		/* - 기능1
		 * 	- 회원 관리
		 * 		- 로그인
		 * 		- 회원가입
		 * 	- 게시글 관리
		 * 		- 게시글 등록 (회원만)
		 * 		- 게시글 수정 (회원 + 작성자 본인)
		 * 		- 게시글 삭제 (회원 + 작성자 본인)
		 * 		- 게시글 목록
		 *         - 게시글 검색 (검색 번호는 게시글 번호로)
		 *         - 게시글 확인 
		 *      - 카테고리 관리(회원 + 관리자만)
		 *         - 카테고리 추가
		 *         - 카테고리 수정
		 *         - 카테고리 삭제
		 * */
		int menu;
		String subMenu;
		Scanner sc = new Scanner(System.in);
		ArrayList<Member> memberList = new ArrayList<Member>();
		ArrayList<Manager> categoryList = new ArrayList<Manager>();
		do {
			mainMenuPrint();
			menu = sc.nextInt();
			switch (menu) {
			case 0 :
				System.out.println(memberList);
				break;
			case 1:
				// 로그인 정보 입력	
				if(MemberManager.gradeCheck(memberList)) {
					//관리자 1
					subMenu1();
				} else {
					//회원 0
					subMenu2();
				}

					while(true) {

						sc.nextLine();
						subMenu = sc.nextLine();
						managerRunMenu(subMenu, memberList, categoryList);
					}
				
			case 2:
				// 회원 가입
				MemberManager.membership(memberList);
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		} while(menu != 3);
	}


	private static void mainMenuPrint() {
		System.out.println("==========[게시글 관리 프로그램]=========="+"\n");
		System.out.print(" 1. 로그인  |"+" 2. 회원가입  |"+" 3. 프로그램 종료");
		System.out.println(" | 0. 회원 명단");
	}
	public static void subMenu1() {
		//관리자용
		System.out.println("==========[게시글 관리 프로그램]==========" + "\n");
		System.out.println("로그인되었습니다." + "\n");
		System.out.println(" 1. 게시글 등록 | 2. 게시글 수정 | 3. 게시글 삭제 | 0. 뒤로가기");
		System.out.println("\n" + "[관리자 로그인 완료] - 관리자용 추가 메뉴" + "\n");
		System.out.println("[+] 카테고리 추가 | [-] 카테고리 수정 | [*] 카테고리 삭제");
		System.out.println("\n" + "메뉴를 선택해주세요 : ");
	}

	public static void subMenu2() {
		//회원용
		System.out.println("==========[게시글 관리 프로그램]==========" + "\n");
		System.out.println("로그인되었습니다." + "\n");
		System.out.println(" 1. 게시글 등록 | 2. 게시글 수정 | 3. 게시글 삭제 | 0. 뒤로가기");
		System.out.println("\n" + "메뉴를 선택해주세요 : ");
	}
	
	public static void managerRunMenu(String subMenu, ArrayList<Member> memberList, ArrayList<Manager> categoryList) {
		switch (subMenu) {
		case "0":
			break;
		case "1":
			break;
		case "2":
			break;
		case "3":
			break;
		case "+":
			Manager.addCategory(categoryList);
			break;
		case "-":
			Manager.modifyCategory(categoryList);
			break;
		case "*":
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}

}
