package day20;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneListMain {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/* 전화번호를 관리하는 프로그램을 작성하세요.
		 * 1. 전화번호 추가(성, 이름, 직장, 전화번호들(이름 : 번호))
		 * //전화번호부 추가 => PhoneBook 개체를 생성
		 * 2. 전화번호 수정
		 *  - 이름으로 검색(성+이름) => 성이든 이름이든 검색해서 떠야함
		 *  - 검색된 사람들 중에서 선택
		 *  - 성, 이름을 수정할건지,
		 *    기존 등록된 전화번호를 수정할건지,
		 *    새 전화번호를 등록할건지를 선택하여 동작(추가 등록)
		 * 3. 전화번호 삭제
		 *  - 이름으로 검색(성+이름)
		 *  - 검색된 사람들 중에서 선택
		 *  - 선택된 사람의 연락처를 삭제
		 * 4. 전화번호 조회
		 *  - 이름으로 검색
		 *  - 검색된 사람들 중에서 선택
		 *  - 선택된 사람의 연락처를 출력
		 * 5. 종료
		 * */
		ArrayList<PhoneList> list = new ArrayList<PhoneList>();
		int menu = 0;
		do {
			System.out.println("메뉴");
			System.out.println("1. 전화번호 추가");
			System.out.println("2. 전화번호 수정");
			System.out.println("3. 전화번호 삭제");
			System.out.println("4. 전화번호 조회");
			System.out.println("5. 종료");
			menu = sc.nextInt();
			String lastName, name, job, addName;
			int phone, addPhone;
			
			switch (menu) {
			case 1:
				System.out.println("전화번호를 추가합니다.");
				//전화번호 추가
				//1. 전화번호 추가(성, 이름, 직장, 전화번호들(이름 : 번호))
				System.out.println("성 입력 :");
				lastName = sc.next();
				System.out.println("이름 입력 :");
				name = sc.next();
				System.out.println("직장 입력 :");
				job = sc.next();
				System.out.println("전화번호 입력 :");
				phone = sc.nextInt();
				//전화번호를 더 입력할건지 물어봄
				System.out.println("전화번호를 추가 입력하시겠습니까?(y/n) :");
				String question = sc.next();
				//반복
				if(question.equals("y")) {
					//전화번호를 입력(이름(집,회사,직장,휴대전화 등) : 번호) => PhoneNumber class
					System.out.println("이름 입력 : ");
					addName = sc.next();
					System.out.println("전화번호 입력 :");
					addPhone = sc.nextInt();
					
					//추가로 입력하지 않을 때
				} else if (question == "n") {
					
				} else {
					System.out.println("잘못된 입력입니다.");
				}

					
					PhoneList phonelist = new PhoneList(lastName, name, job, phone);
					
					list.add(phonelist);
					System.out.println("전화번호를 추가하였습니다.");
					System.out.println(list);
				break;
			case 2:
				//전화번호 수정
				System.out.println("전화번호를 수정합니다.");
				//이름을 입력
				System.out.println("이름 입력 : ");
				name = sc.next();
				//이름이 포함된 전화번호부를 검색하여 출력(번호와 함께)
				lastName = sc.next();
				//수정할 전화번호부를 선택
				
				//서브 메뉴 출력
				
					//서브 메뉴 실행
					//1. 이름, 직장 수정
						//이름 직장 입력
				
						//이름 직장을 수정 
					//2. 기존 전화번호 수정
						//기존 전화번호들을 출력
				
						//수정할 전화번호를 선택
				
						//이름, 번호를 입력
				
						//선택한 전화번호, 이름, 번호를 수정
					//3. 새 전화번호 추가
						//이름 번호를 입력
				
						//새 전화번호를 추가
				
		
				//성 또는 이름으로 검색해도 출력
				System.out.println("수정하실 성 입력 : ");
				System.out.println("수정하실 이름 입력 : ");
				System.out.println("수정하실 전화번호 입력 : ");
				break;
			case 3:
				//전화번호 삭제
					//이름을 입력
				
					//이름이 포함된 전하번호를 검색하여 출력(번호와 함께)
				
					//삭제할 전화번호부를 선택
					
					//전화 번호를 삭제
				break;
			case 4:
				//전화번호 조회
				//이름을 입력
				
				//이름이 포함된 전하번호를 검색하여 출력(번호와 함께)
			
				//조회할 전화번호부를 선택
				
				//전화 번호를 조회
				break;
			case 5:
				//프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
			}
			
		}while(menu != 5);
	}

}
