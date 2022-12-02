package day30;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {
	private static ArrayList<Board> list = new ArrayList<Board>();
	private static ArrayList<Comment> commentList = new ArrayList<Comment>();
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
			updateBoardList();
			break;
		case 3:
			deletBoardList();
			break;
		case 4:
			printBoardList();
			break;
		case 5:
			printBoard();
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
			int num = inputBoardNum();
			
			Board board = inputBoard(num);
			if(list.contains(board)) {
				System.out.println("이미 등록된 게시글 번호입니다.");
			}
			list.add(board);
	}
	
	/*inputBoardNum : scanner를 통해 번호를 입력받아 알려주는 메소드
	 * return : 입력받은 게시글 번호*/
	
	public static int inputBoardNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	/* inputBoard : 게시글 번호가 주어지면 제목, 내용, 작성자 입력하여
	 * 				게시글 객체를 반환하는 메소드
	 * parameter : 게시글 번호
	 * return : 게시글 객체
	 * */
	
	public static Board inputBoard(int num) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("제목 입력 : ");
		String title = sc.nextLine();
		System.out.println("내용 입력 : ");
		String content = sc.nextLine();
		System.out.println("작성자 : ");
		String writer = sc.nextLine();
		return new Board(num, title, content, writer);
	}
	
	/* updateBoard : 게시글 리스트에 주어진 게시글을 수정하는 메소드
	 * */
	
	public static boolean updateBoard(ArrayList<Board> list, Board board) {
		Scanner sc = new Scanner(System.in);
		if (board == null || list.size() == 0)
			return false;
		int index = list.indexOf(board);
		if(index == -1)
			return false;
		list.set(index, board);
		return true;
		
		
	}
	
	/* updateBoardList : 게시글 정보를 입력받아 수정하는 메소드
	 * 
	 * */
	public static void updateBoardList() {
		int num = inputBoardNum();
		Board board = inputBoard(num);
		if(updateBoard(list, board)) {
			System.out.println("게시글 수정 완료");
		} else {
			System.out.println("게시글 수정 실패");
		}
		System.out.println(list);
	}
	
	/* deleteBoard : 게시글 리스트에 주어진 게시글을 삭제하는 메소드
	 * parameter : boardList 게시글 리스트
	 * parameter : num 삭제할 게시글 번호
	 * return : 삭제 여부 true / false
	 * */
	
	public static boolean deleteBoard(ArrayList<Board> list, int num) {
		Board board = new Board(num);
		return list.remove(board);
	}
	
	/* deletBoardList : 게시글 번호를 입력받아 삭제하는 메소드
	 * */
	
	public static void deletBoardList() {
		int num = inputBoardNum();
		if(deleteBoard(list, num)) {
			System.out.println("게시글 삭제");
		} else {
			System.out.println("게시글 삭제 실패");
		}
	}
	
	/* printBoardList : 게시글 전체를 출력하는 메소드
	 * 
	 * */
	public static void printBoardList() {
		//forEach 리스트 내부에 값들을 하나씩 빼옴.
		//b로 값을 넣어준 뒤 출력
		list.forEach(b->System.out.println(b));
	}
	
	/* printSubmenu : 게시글 확인에서 필요한 서브 메뉴를 출력
	 * */
	public static void printSubmenu() {
		System.out.println("1. 댓글 등록");
		System.out.println("2. 댓글 확인");
		System.out.println("3. 이전");
		System.out.println("메뉴 선택 : ");
	}
	
	/* runPrintSubmenu : 선택한 서브 메뉴를 실행하는 메소드
	 *                   우선은 서브메뉴를 선택하면 선택한 서브메뉴를
	 *                   콘솔에 출력하는 기능으로 일단 구현
	 * @param submenu 선택한 서브 메뉴
	 * @param boardNum 선택한 게시글 번호
	 * 
	 * */
	
	public static void runPrintSubmenu(int submenu, int boardNum) {
		Scanner sc = new Scanner(System.in);
		int subMenu = sc.nextInt();
		
		switch(subMenu) {
		case 1:
			insertCommentList(boardNum);
			break;
		case 2:
			
			break;
		case 3:
			System.out.println("3. 이전");
			break;
		default :
			System.out.println("잘못된 메뉴입니다.");
		}
		
	}
	
	/* printBoard : 게시글 번호를 입력받아 입력받은 게시글을 출력하고
	 * 				서브 메뉴를 출력하고, 서브 메뉴를 선택하면
	 * 				선택한 서브 메뉴를 실행하는 메소드
	 * */
	
	public static void printBoard() {
		Scanner sc = new Scanner(System.in);
		int num = inputBoardNum();
		Board board = new Board(num);
		int index = list.indexOf(board);
		if (index == -1) {
			System.out.println("등록되지 않았거나 삭제된 게시글입니다.");
			return;
		}
		board = list.get(index);
		board.print();
		int submenu = -1;
		do {
			printSubmenu();
			submenu = sc.nextInt();
			sc.nextLine();
			runPrintSubmenu(submenu, num);
		} while (submenu != 3);
	}
	
	/* insertComment : 댓글을 댓글 리스트에 추가하는 메소드
	 * @param commentList 댓글 리스트
	 * @param comment 댓글
	 * @return 댓글 추가 여부
	 * */
	
	public static boolean insertComment(ArrayList<Comment> commentList, Comment comment) {
		int index = commentList.indexOf(comment);
		if(index != -1) {
			System.out.println("이미 등록된 댓글 번호입니다.");
			return false;
		}
		commentList.add(comment);
		System.out.println("댓글 등록이 완료되었습니다.");
		return true;
	}
	
	/* insertCommentList : 댓글 정보를 입력받아 댓글을 추가하는 메소드
	 * @param boardNum 선택한 게시글 번호
	 * */
	public static void insertCommentList(int boardNum) {
		Scanner sc = new Scanner(System.in);
		int num = inputBoardNum();
		System.out.println("작성자 : ");
		String writer = sc.nextLine();
		System.out.println("내용 : ");
		String content = sc.nextLine();
		
		Comment comment = new Comment(num, content, writer, boardNum);
		if(insertComment(commentList, comment)) {
			System.out.println("댓글 등록 완료");
		} else {
			System.out.println("이미 등록된 댓글 번호입니다.");
		}
	}
	
	/* printCommentList : 선택한 게시글에 있는 댓글들을 확인하는 메소드
	 * @param boardNum 게시글 번호
	 * */
	
	public static void printCommentList(int boardNum) {
		if(commentList.size() == 0) {
			System.out.println("등록된 댓글이 없습니다.");
			return;
		}
		int count = 0;
		commentList.forEach(c->{
			if(c.getCommentNum() == boardNum) {
				System.out.println(c);
			}
		});
	}
	
	
	
}
