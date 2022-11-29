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
		Scanner sc = new Scanner(System.in);
		int menu;
		int subMenu;
		ArrayList<Member> memberList = new ArrayList<Member>();
		do {
			mainMenuPrint();
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				// 로그인 정보 입력				
				if (MemberManager.memberLogin(memberList)) {
					subMenuPrint();
					subMenu = sc.nextInt();
					switch (subMenu) {
					case 1:
						System.out.println("1. 게시글 등록");
						break;
					case 2:
						System.out.println("2. 게시글 수정");
						break;
					case 3:
						System.out.println("3. 게시글 삭제");
						break;
					default:
					}
				}
				break;
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
	}

	public static void subMenuPrint() {
		System.out.print(" 1. 게시글 등록  |"+" 2. 게시글 수정  |"+" 3. 게시글 삭제"+"\n");
		System.out.println("메뉴를 선택해주세요 : ");
	}
}
