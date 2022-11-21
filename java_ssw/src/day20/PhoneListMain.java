package day20;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

import javax.management.RuntimeErrorException;



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
		
		//반복
			//메뉴 출력
		
			//메뉴 선택
		
		
		
		
		
		
		
		
		
		
		
		ArrayList<PhoneBook> list = new ArrayList<PhoneBook>();
		int menu = 0;
		do {
			//메뉴 출력 (메소드)
			printMenu();
			try {
			//메뉴 선택
			menu = sc.nextInt();
			System.out.println("===========================");
			runMenu(menu, list);
			}catch(RuntimeException e) {
				System.out.println(e.getMessage());
				System.out.println("===========================");
			}
			
			
		}while(menu != 5);
	}
	private static void runMenu(int menu, ArrayList<PhoneBook> list) {
		switch (menu) {
		//1. 번호 추가
		case 1:
			if (insertPhoneBook(list)) {
				System.out.println("전화번호를 추가했습니다.");
			} else {
				System.out.println("전화번호를 추가하지 못했습니다.");
				System.out.println("===========================");
			}

			break;
		case 2:
			//전화번호 수정
			if(updatePhoneBook(list)) {
				System.out.println("전화번호를 수정했습니다.");
				System.out.println("===========================");
			} else {
				System.out.println("전화번호를 수정하지 못했습니다.");
				System.out.println("===========================");
			}

			
	
			//성 또는 이름으로 검색해도 출력

			break;
		case 3:
			//전화번호 삭제
			if(deletePhoneBook(list)) {
				System.out.println("전화번호를 삭제했습니다.");
				System.out.println("===========================");
			} else {
				System.out.println("전화번호를 삭제하지 못했습니다.");
				System.out.println("===========================");
			}
				
			break;
		case 4:
			//전화번호 조회
			if(printSearchNumber(list)) {
				System.out.println("전화번호를 조회합니다.");
			} else {
				System.out.println("전화번호를 조회하지 못했습니다.");
			}
			

			break;
		case 5:
			//프로그램 종료
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
		}
	}
	private static boolean updatePhoneBook(ArrayList<PhoneBook> list) {
		//이름을 입력
		sc.nextLine(); //공백처리
		//이름을 입력
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();

		//이름이 포함된 전화번호부를 검색하여 출력(번호와 함께)
		ArrayList<Integer> indexs = searchPhoneBook(list, p->p.getName().contains(name));
		//확인된 번지에 있는 번호들을 출력(번호와 함께)
		printIndexsNumber(list, indexs);
		//조회할 전화번호부를 선택
		System.out.println("번호 입력 : ");
		int selectIndex = sc.nextInt() -1;
		if(selectIndex < 0 || selectIndex > indexs.size())
			throw new RuntimeException("잘못 선택했습니다.");

		//서브 메뉴 출력
		printSubMenu();
		int subMenu = sc.nextInt();
			//서브 메뉴 실행
		int index = indexs.get(selectIndex);
		runSubMenu(subMenu, list.get(selectIndex));
			

		return true;
	}
	private static boolean runSubMenu(int subMenu, PhoneBook pb) {
		if(pb == null) {
			return false;
		}
		switch (subMenu) {
		case 1:
			//1. 이름, 직장 수정
			sc.nextLine();	//공백처리 (메뉴 입력 후 남은 엔터)
			System.out.println("성명 : ");
			String name = sc.nextLine();
			System.out.println("직장 : ");
			String company = sc.nextLine();
			
			pb.update(name, company);
			break;
		case 2:
			//2. 기존 전화번호 수정
			
			//기존 전화번호들을 출력
			pb.printPhoneNumbers();
			//수정할 전화번호를 선택
			System.out.println("번호 입력 : ");
			int index = sc.nextInt();
			//이름, 번호를 입력
			sc.nextLine();
			System.out.println("이름 : ");
			String pName = sc.nextLine();
			System.out.println("번호 : ");
			String number = sc.nextLine();
			//선택한 전화번호, 이름, 번호를 수정

			pb.getPnList().get(index).update(pName,number);
			break;
		case 3:
			//3. 새 전화번호 추가
			
			//이름 번호를 입력
			sc.nextLine();
			ArrayList<PhoneNumber> pnList = inputPhoneNumbers();
			//새 전화번호를 추가
			pb.getPnList().addAll(pnList);
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			System.out.println("===========================");
			return false;
		}
		return true;
	}
	private static void printSubMenu() {
		System.out.println("========수정 메뉴========");
		System.out.println("1. 이름, 직장 수정");
		System.out.println("2. 기존 전화번호 수정");
		System.out.println("3. 새 전화번호 등록");
		System.out.println("===========================");
		System.out.println("메뉴 선택 : ");
		
	}
	private static void printIndexsNumber(ArrayList<PhoneBook> list, ArrayList<Integer> indexs) {
		if(indexs == null || indexs.size() == 0 || list == null || list.size() == 0) {
			System.out.println("검색 결과가 없습니다.");
			System.out.println("===========================");
			throw new RuntimeException("검색 결과가 없습니다.");
		}
		for(int i=0; i<indexs.size(); i++) {
			int index = indexs.get(i);
			System.out.println(i+1+". "+list.get(index));
		}
		System.out.println("===========================");
	}
	
	
	private static boolean printSearchNumber(ArrayList<PhoneBook> list) {
		sc.nextLine(); //공백처리
		//이름을 입력
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		//이름이 포함된 전화번호부를 검색하여 번지를 확인
		ArrayList<Integer> indexs = searchPhoneBook(list, p->p.getName().contains(name));
		//확인된 번지에 있는 번호들을 출력(번호와 함께)
		printIndexsNumber(list, indexs);
		//조회할 전화번호부를 선택
		System.out.println("번호 입력 : ");
		int selectIndex = sc.nextInt() -1;
		if(selectIndex < 0 || selectIndex > indexs.size()) {
			return false;
		}
		//전화 번호를 조회
		list.get(selectIndex).print();

		return true;
	}

	
	private static boolean deletePhoneBook(ArrayList<PhoneBook> list) {
		sc.nextLine(); //공백처리
		//이름을 입력
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		//이름이 포함된 전화번호부를 검색하여 번지를 확인
		ArrayList<Integer> indexs = searchPhoneBook(list, p->p.getName().contains(name));
		//확인된 번지에 있는 번호들을 출력(번호와 함께)
		printIndexsNumber(list, indexs);
		
		//삭제할 전화번호부를 선택
		int selectIndex = sc.nextInt() -1;
		if(selectIndex < 0 || selectIndex > indexs.size()) {
			return false;
		}
		//전화 번호를 삭제
		int deleteIndex = indexs.get(selectIndex);
		return list.remove(deleteIndex) != null;
		//삭제가 되면 true을 리턴, 삭제가 안되면 null이 리턴
	}
	private static ArrayList<Integer> searchPhoneBook(ArrayList<PhoneBook> list,
			Predicate<PhoneBook> p) {
		ArrayList<Integer> indexs = new ArrayList<Integer>();
		
		for(int i=0; i<list.size(); i++) {
			if(p.test(list.get(i))) {
				indexs.add(i);
			}
		}
		return indexs;
	}
	private static ArrayList<PhoneNumber> inputPhoneNumbers() {
		ArrayList<PhoneNumber> pnList = new ArrayList<PhoneNumber>();
		do {
			
			//추가 전화번호 입력하는지 물어봄
			
			//입력받은 이름, 번호를 이용하여 PhoneNumber 객체를 만들고,
			PhoneNumber pn = inputPhoneNumber();
			//만들어진 PhoneNumber 객체를 PhoneNumber 리스트에 추가
			pnList.add(pn);
			
			System.out.println("더 입력하시겠습니까? (y/n) : ");
		} while (sc.nextLine().charAt(0) != 'n');
		return pnList;
	}
	
	private static PhoneNumber inputPhoneNumber() {
		//전화번호를 입력(이름 : 번호) => phoneNumber
		System.out.print("이름(집, 직장 등) : ");
		String pName = sc.nextLine();
		
		System.out.println("번호(예 : 010-1234-5678) : ");
		String number = sc.nextLine();
		return new PhoneNumber(pName, number);
	}
	
	private static boolean insertPhoneBook(ArrayList<PhoneBook> list) {
		//성명, 직장 입력
		sc.nextLine();	//공백처리 (메뉴 입력 후 남은 엔터)
		System.out.println("성명 : ");
		String name = sc.nextLine();
		System.out.println("직장 : ");
		String company = sc.nextLine();
		//반복
		
		ArrayList<PhoneNumber> pnList;
		try {
			//전화번호들을 입력
			pnList = inputPhoneNumbers();
		}
		catch (RuntimeException e) {
			return false;
		}
		//이름, 직장, 전화번호들(PhoneNumber 리스트)을 이용하여 PhoneBook 객체를 생성
		PhoneBook pb = new PhoneBook(name, company, pnList);
		
		//list에 PhoneBook 객체를 추가
		list.add(pb);
		System.out.println(list);
		return true;
	}
	public static void printMenu() {
		System.out.println("============메뉴============");
		System.out.println("1. 전화번호 추가");
		System.out.println("2. 전화번호 수정");
		System.out.println("3. 전화번호 삭제");
		System.out.println("4. 전화번호 조회");
		System.out.println("5. 종료");
	}
}
