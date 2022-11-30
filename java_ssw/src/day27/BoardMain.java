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
				if (MemberManager.memberLogin(memberList)) {
					memberSubMenuPrint(memberList);
					sc.nextLine();
					subMenu = sc.nextLine();			
					switch (subMenu) {
					case "1":
						System.out.println("1. 게시글 추가");
						break;
					case "2":
						System.out.println("2. 게시글 수정");
						break;
					case "3":
						System.out.println("3. 게시글 삭제");
						break;
					case "0":
						//뒤로가기
						continue;
						//여기서부턴 관리자 권한
					case "+":
						Manager.addCategory(categoryList);
						break;
					case "-":
						Manager.modifyCategory(categoryList);
						break;
					case "*":
						//카테고리 삭제
						break;
					default:
						System.out.println("잘못된 입력입니다.");
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
		System.out.println(" | 0. 회원 명단");
	}

	public static void memberSubMenuPrint(ArrayList<Member> memberList) {
		System.out.println(" 1. 게시글 등록 | 2. 게시글 수정 | 3. 게시글 삭제 | 0. 뒤로가기");
		for(Member tmp : memberList) {
			//관리자일 경우에만
			if(tmp.getGrade() == 0 && tmp.getName().equals(memberList.get(0))) {
				System.out.println("\n"+"[관리자 메뉴]"+"\n");
				System.out.println("[+] 카테고리 추가 | [-] 카테고리 수정 | [*] 카테고리 삭제");
			}
		}
		
		System.out.println("\n"+"메뉴를 선택해주세요 : ");
	}
}
