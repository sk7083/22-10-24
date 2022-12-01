package day30;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {
	private static ArrayList<Board> list = new ArrayList<Board>();	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		/* 기능
		 *   - 게시글 등록
		 *   - 게시글 수정
		 *   - 게시글 삭제
		 *   - 게시글 목록
		 *   - 게시글 확인
		 *     - 댓글 등록
		 *     - 댓글 확인
		 *     - 이전
		 *   - 프로그램 종료
		 * 
		 * 
		 * */
			
		int menu = 0;
		do {
			printMenu();
			menu = sc.nextInt();
			runMenu(menu, list);
			
		} while(menu != 6);

	}
	/* 메뉴를 출력하는 메소드
	 * */
	public static void printMenu() {
		System.out.println("==============[게시글 메뉴]==============");
		System.out.print("1. 게시글 등록 |");
		System.out.print(" 2. 게시글 수정 |");
		System.out.println(" 3. 게시글 삭제");
		System.out.print("4. 게시글 목록 |");
		System.out.print(" 5. 게시글 확인 |");
		System.out.print(" 6. 프로그램 종료"+"\n"+"메뉴 선택 : ");
	}
	
	/* 메뉴가 주어지면 주어진 메뉴에 맞는 기능을 출력하는 메소드*/
	public static void runMenu(int menu, ArrayList<Board> list) {
		switch (menu) {
		case 1:
			insertBoard();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		default:
		}
	}
	/* insertBoard
	 * 게시글 정보를 입력받아 게시글을 출력하는 메소드
	 * 메소드 구현에 필요한 필드를 추가해도 됨
	 * 필드에 리스트를 만들 경우 일일히 매개변수에 넘겨받지 않아도됨
	 * */
	public static void insertBoard() {
			Scanner sc = new Scanner(System.in);
			System.out.println("게시글 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			System.out.println("제목 : ");
			String title = sc.nextLine();
			System.out.println("작성자 : ");
			String writer = sc.nextLine();
			System.out.println("내용 : ");
			String content = sc.nextLine();
			
			Board board = new Board(num, title, content, writer);
			if(list.contains(board)) {
				System.out.println("이미 등록된 게시글 번호입니다.");
			}
			list.add(board);
			System.out.println(list);
	}
	
	public static ArrayList<Board> modifyBoard(){
		for(int i =0; i<list.size(); i++) {
		
		}
		
		return null;
	}
	
	
	
	
}
