package day20;

import java.util.ArrayList;
import java.util.Scanner;

import lombok.Builder.Default;

public class BookManagerMain {
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
		
		//반복
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		ArrayList<Book> list = new ArrayList<Book>();
		do {
			//메뉴를 출력
			System.out.println("========메뉴========");
			System.out.println("1. 도서 추가");
			System.out.println("2. 도서 조회");
			System.out.println("3. 종료");
			System.out.println("===================");
			System.out.println("메뉴 선택 : ");
			//메뉴를 선택
			menu = scan.nextInt();
			System.out.println("===================");
			String title, author, publisher, genre, isbn;
			int price;
			//선택한 메뉴에 따른 기능 실행
			switch(menu) {
			//선택 메뉴가 1번이면 도서 추가
			//도서명, 저자(여러명, 엮은이, 옮긴이 다 포함), 가격, 출판사, 분류, ISBN
			
			case 1:
				//추가할 도서 정보를 입력
				scan.nextLine();	//엔터 처리
				System.out.print("도서 명 : ");
				title = scan.nextLine();
				System.out.print("저자 : ");
				author = scan.nextLine();
				System.out.print("가격 : ");
				price = scan.nextInt();
				scan.nextLine();	//엔터 처리
				System.out.print("출판사 : ");
				publisher = scan.nextLine();
				System.out.print("장르 : ");
				genre = scan.nextLine();
				System.out.print("ISBN : ");
				isbn = scan.next();
				System.out.println("===================");
				//도서 목록에 새 도서를 추가
				//위에서 입력받은 도서 정보를 이용하여 도서 객체를 생성
				Book book = new Book(title, author, publisher, genre, isbn, price);
				//생성된 도서 객체를 리스트에 추가
				//ISBN 중복 체크해서 중복되면 건너뜀	//중복체크 확인하기위해 book클래스에서 이퀄즈,해쉬코드 추가
				//중복 : 리스트에 book객체가 포함되었다.
				if(list.contains(book)) {	//
					System.out.println("이미 등록된 ISBN 번호입니다.");
					System.out.println("===================");
					continue;
				}
				//중복되지 않으면 추가
				list.add(book);
				System.out.println("도서 추가가 완료됐습니다.");
				System.out.println("===================");
				
				break;
			case 2:
				//선택 메뉴가 2번이면 도서 조회
				/*- 도서 조회
				 *  - 도서명으로 조회
				 *  - 저자로 조회
				 *  - 출판사로 조회
				 *  - 분류로 조회
				 *  */
				//서브 메뉴 출력
				System.out.println("======조회 메뉴=======");
				System.out.println("1. 도서명");
				System.out.println("2. 저자");
				System.out.println("3. 출판사");
				System.out.println("4. 장르");
				System.out.println("5. 취소");
				System.out.println("===================");
				System.out.println("조회 방법 선택 : ");
				//서브 메뉴 선택
				int subMenu = scan.nextInt();
				System.out.println("===================");
				//선택한 서브 메뉴 실행
				int count = 0;
				switch(subMenu) {
				//서브 메뉴가 1이면 도서명으로 조회
				case 1 :
					System.out.println("도서명 : ");
					scan.nextLine();
					title = scan.nextLine();
					System.out.println("===================");
					for(Book tmp : list) {
						//향상된 for문을 통해 list에 들어간 값을 불러옴
						if(tmp.getTitle().contains(title.trim())) {
							//이후 if문을 통해 Title을 contains로 비교 (trim은 공백 제거용)한다.
							System.out.println(tmp);
							//비교했을 때 값이 존재하면 tmp값을 출력
							System.out.println("===================");
							count++;
							//비교했을 때 값이 존재하면 카운터값을 +1
						}
					}
					if(count == 0) {
						System.out.println("검색 결과가 없습니다.");
						System.out.println("===================");
					}
					break;
				//서브 메뉴가 2이면 저자 조회
				case 2 :
					System.out.println("저자 : ");
					scan.nextLine();
					author = scan.nextLine();
					System.out.println("===================");
					for(Book tmp : list) {
						//향상된 for문을 통해 list에 들어간 값을 불러옴
						if(tmp.getAuthor().contains(author.trim())) {
							//이후 if문을 통해 Title을 contains로 비교 (trim은 공백 제거용)한다.
							System.out.println(tmp);
							//비교했을 때 값이 존재하면 tmp값을 출력
							System.out.println("===================");
							count++;
							//비교했을 때 값이 존재하면 카운터값을 +1
						}
					}
					if(count == 0) {
						//만약 카운터가 0이면 => 비교햇을 때 값이 없단 뜻
						//고로 겹치는 값이 없으므로 결국, 검색 결과는 없음.
						System.out.println("검색 결과가 없습니다.");
						System.out.println("===================");
					}
					break;
				//서브 메뉴가 3이면 출판사 조회
				case 3 :
					System.out.println("출판사 : ");
					scan.nextLine();
					publisher = scan.nextLine();
					System.out.println("===================");
					for(Book tmp : list) {
						//향상된 for문을 통해 list에 들어간 값을 불러옴
						if(tmp.getPublisher().contains(publisher.trim())) {
							//이후 if문을 통해 Title을 contains로 비교 (trim은 공백 제거용)한다.
							System.out.println(tmp);
							//비교했을 때 값이 존재하면 tmp값을 출력
							System.out.println("===================");
							count++;
							//비교했을 때 값이 존재하면 카운터값을 +1
						}
					}
					if(count == 0) {
						//만약 카운터가 0이면 => 비교햇을 때 값이 없단 뜻
						//고로 겹치는 값이 없으므로 결국, 검색 결과는 없음.
						System.out.println("검색 결과가 없습니다.");
						System.out.println("===================");
					}
					break;
				//서브 메뉴가 4이면 장르 조회
				case 4 :
					System.out.println("장르 : ");
					scan.nextLine();
					genre = scan.nextLine();
					System.out.println("===================");
					for(Book tmp : list) {
						//향상된 for문을 통해 list에 들어간 값을 불러옴
						if(tmp.getGenre().contains(genre.trim())) {
							//이후 if문을 통해 Title을 contains로 비교 (trim은 공백 제거용)한다.
							System.out.println(tmp);
							//비교했을 때 값이 존재하면 tmp값을 출력
							System.out.println("===================");
							count++;
							//비교했을 때 값이 존재하면 카운터값을 +1
						}
					}
					if(count == 0) {
						//만약 카운터가 0이면 => 비교햇을 때 값이 없단 뜻
						//고로 겹치는 값이 없으므로 결국, 검색 결과는 없음.
						System.out.println("검색 결과가 없습니다.");
						System.out.println("===================");
					}
					break;
				// 서브 메뉴가 5이면 조회 취소
				case 5:
					System.out.println("조회를 취소했습니다.");
					System.out.println("===================");
					break;
				// 잘못된 서브메뉴이면 잘못됐다고 출력
				default:
					System.out.println("잘못된 메뉴입니");
					System.out.println("===================");
				}
				break;
			//선택 메뉴가 3번이면 프로그램 종료 출력
			case 3:
				System.out.println("프로그램을 종료합니다.");
				System.out.println("===================");
				break;
			default :
				System.out.println("잘못된 메뉴입니다.");
				System.out.println("===================");
			//선택 메뉴가 1, 2, 3이 아니면 잘못된 메뉴라고 출력
			}
		}while(menu != 3);
		scan.close();
	}
}
