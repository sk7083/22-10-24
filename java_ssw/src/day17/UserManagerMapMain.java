package day17;

import java.util.HashMap;
import java.util.Scanner;



public class UserManagerMapMain {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int menu = 0;
		HashMap<String, Member> map = new HashMap<String, Member>();
		do {
			System.out.println("-----메뉴-----");
			System.out.println("1. 회원 추가");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 종료");
			System.out.println("----------");
			System.out.println("메뉴 선택 : ");
			
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				if (addMember(map)) { // addMember이 리턴값이 boolean이기에 if문 사용하여 가능
					System.out.println("회원 정보가 추가됐습니다.");
				} else {
					System.out.println("이미 가입된 아이디입니다.");
				}
				break;
			case 2:
				if (!searchMember(map)) {
					System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
				}

				break;
			case 3:
				if (update(map)) {
					System.out.println("회원 정보를 수정했습니다.");
				} else {
					System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
				}
				break;
			case 4:
				if(deleteTmp(map)) {
					System.out.println("회원 정보를 삭제했습니다.");
				} else {
					System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu != 5);

	}
	public static boolean addMember(HashMap<String, Member> map) {
		if(map == null) {
			throw new RuntimeException("예외발생 : Map이 null입니다.");
		}
		System.out.println("회원 정보를 입력하세요.");
		System.out.print("아이디 : ");
		String id = scan.next();
		System.out.print("비번 : ");
		String pw = scan.next();
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("주민번호 : ");
		String residentNumber = scan.next();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		
		//map에 있는지 확인
		Member addTmp = map.get(id);	//map에 key값(id)을 가져옴
		//있으면 건너뜀
		if(addTmp != null) {	//null이 아님 즉 동일한 아이디가 존재
			//위에 if(map.get(id) != null 이렇게 써도 가능
			System.out.println("이미 추가된 아이디입니다.");
			return false;
		}
		//없으면 추가	//map은 put을 이용하여 추가. 현재 ()안에 id는 key이며 나머지는 value값
		map.put(id, new Member(pw, name, residentNumber, age));
		return true;
	}
	
	public static boolean searchMember(HashMap<String, Member> map) {
		//아이디 입력
		System.out.println("검색할 회원 정보를 입력하세요.");
		System.out.println("아이디 : ");
		String id = scan.next();
		//비번 입력
		System.out.println("비번 : ");
		String pw = scan.next();
		//아이디를 입력하여 회원정보를 가져옴
		Member searchTmp = map.get(id);
		//일치하는 회원 정보가 없으면 건너뜀
		if(searchTmp == null) {
			return false;
		}
		//가져온 회원 정보에서 비번이 같은지 확인하여 다르면 건너뜀
		if(!searchTmp.getPw().equals(pw)) {
			return false;
		}
		System.out.println(id + " : " + searchTmp);
		return true;
	}
	
	public static boolean update(HashMap<String, Member> map) {
		// 아이디 입력
		System.out.println("검색할 회원 정보를 입력하세요.");
		System.out.println("아이디 : ");
		String id = scan.next();
		// 비번 입력
		System.out.println("비번 : ");
		String pw = scan.next();

		Member updateTmp = map.get(id);
		if (updateTmp == null || !updateTmp.getPw().equals(pw)) {
			return false;
		}

		System.out.println("수정할 회원 정보를 입력하세요.");
		System.out.print("새 비번 : ");
		String newPw = scan.next();
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("주민번호 : ");
		String residentNumber = scan.next();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		updateTmp.update(newPw, name, residentNumber, age);
		return true;
	}

	public static boolean deleteTmp(HashMap<String, Member> map) {
		// 아이디 입력
		System.out.println("삭제할 회원 정보를 입력하세요.");
		System.out.println("아이디 : ");
		String id = scan.next();
		// 비번 입력
		System.out.println("비번 : ");
		String pw = scan.next();

		Member deleteTmp = map.get(id);
		if (deleteTmp == null || !deleteTmp.getPw().equals(pw)) {
			return false;
		}
		map.remove(id); // key값(id)를 지우면 key값에 맞는 value값 삭제
		return true;
	}
	
}
