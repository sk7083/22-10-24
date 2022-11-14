package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserManagerMain {

	public static void main(String[] args) {
		/* 회원정보를 관리하는 프로그램을 작성하세요.
		 * - 회원 정보는 아이디, 비번, 이름, 나이, 주민번호로 구성
		 * - 기능 1 : 회원 추가
		 * - 기능 2 : 회원 검색
		 * - 기능 3 : 회원 정보 수정
		 * - 기능 4 : 회원 삭제
		 */

		// 반복
		int menu = -1;
		Scanner scan = new Scanner(System.in);
		ArrayList<Member1> list = new ArrayList<Member1>(); //회원리스트
		do {
			// 메뉴 출력
			printMenu();
			// 메뉴 선택(입력)
			menu = scan.nextInt();
			// 선택된 메뉴에 따른 기능 실행
			switch (menu) {
			case 1:
				if(addMember(list)) {
					printStr("입력한 회원 정보를 추가했습니다.");
				} else {
					printStr("입력한 아이디가 이미 존재합니다.");
				}
				break;
			case 2:
				Member1 searchTmp = searchMember(list);
				if(searchTmp == null) {
					printStr("아이디 또는 비밀번호가 잘못됐습니다.");
				} else {
					System.out.println(searchTmp);
				}
				break;
			case 3:
				//수정할 회원 아이디와 비번을 입력하여 일치하는 회원 정보를 가져옴
				Member1 updateTmp = searchMember(list);
				
				//일치하지 않으면 건너뜀
				if(!updateMember(list, updateTmp)) {
					printStr("아이디 또는 비밀번호가 잘못됐습니다.");
				} else {
					printStr("회원 정보 수정이 완료됐습니다.");
				}
				break;
			case 4:
				//삭제할 회원 아이디와 비번을 입력하여 일치하는 회원 정보를 가져옴
				/*if(!deleteId(list)) {
					printStr("아이디 또는 비밀번호가 잘못됐습니다.");
				}
				*/
				Member1 deleteTmp = searchMember(list);
				//일치하는 회원 정보가 있으면 삭제
				if(list.remove(deleteTmp)) {
					printStr("삭제가 완료됐습니다.");
				} else {
					printStr("아이디 또는 비밀번호가 잘못됐습니다.");
				}
				break;
			case 5:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 메뉴"); // 예외 처리 예정
			}
		} while (menu != 5);
	}

	public static void printMenu() {
		System.out.println("-----메뉴-----");
		System.out.println("1. 회원 추가");
		System.out.println("2. 회원 검색");
		System.out.println("3. 회원 정보 수정");
		System.out.println("4. 회원 삭제");
		System.out.println("5. 종료");
		System.out.println("----------");
		System.out.println("메뉴 선택 : ");
	}
	
	public static boolean addMember(ArrayList<Member1> list) {
		Scanner scan = new Scanner(System.in);
		// 회원 정보 입력
		// 아디, 비번, 이름, 주민번호, 나이 순으로
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

		// 입력한 정보를 이용한 객체를 생성(회원 리스트에 비교 및 추가하기 위해)
		Member1 member = new Member1(id, pw, name, residentNumber, age);

		// 회원 리스트에 이미 가입된 아이디이면 안내문구 출력 후 종료
		// 회원 아이디가 같은 회원이 있으면
		if (list.contains(member)) {
			// 건너뜀
			return false;
		}
		// 아니면 회원 리스트에 member 객체를 추가
		list.add(member);
		return true;
	}
	public static void printStr(String str) {
		System.out.println("----------");
		System.out.println(str);
		System.out.println("----------");
	}
	
	public static Member1 searchMember(ArrayList<Member1> list) {
		Scanner scan = new Scanner(System.in);
		//아이디 입력
		System.out.println("검색할 회원 정보를 입력하세요.");
		System.out.println("아이디 : ");
		String id = scan.next();
		
		//비번 입력
		System.out.println("비번 : ");
		String pw = scan.next();
		
		//아이디, 비번을 이용하여 객체를 만듬
		Member1 member = new Member1(id, pw);
		
		//회원 리스트에서 아이디가 같은 회원 정보를 가져옴
		int index = list.indexOf(member);	//번지를 알려줌
		if(index == -1) {
			return null;
		}
		Member1 tmp = list.get(index);	//값을 가져옴 tmp로
		
		
		//가져온 회원 정보의 비번과 입력한 비번을 비교하여 같으면 회원정보를 보여줌
		if(!tmp.getPw().equals(member.getPw())) {	//tmp에 받은 pw와 member에 있는 pw를 비교해서
			return null;	//있으면 false(continue)
		}
		return tmp;
	}
	//===================내가 만든 기능 =======================
	public static boolean deleteId(ArrayList<Member1> list) {
		Scanner scan = new Scanner(System.in);
		//아이디 입력
		System.out.println("삭제할 회원 정보를 입력하세요.");
		System.out.println("아이디 : ");
		String id = scan.next();
		
		//비번 입력
		System.out.println("비번 : ");
		String pw = scan.next();
		Member1 member = new Member1(id, pw);
		//회원 리스트에서 아이디가 같은 회원 정보를 가져옴
		int index = list.indexOf(member);	//id와 pw 번지를 알려줌
		if(index == -1) {
			return false;
		}
		Member1 tmp = list.get(index);	//값을 가져옴 tmp로
		//가져온 회원 정보의 비번과 입력한 비번을 비교하여 같으면 회원정보를 보여줌
		if(!tmp.getPw().equals(member.getPw())) {	//tmp에 받은 pw와 member에 있는 pw를 비교해서
			return false;	//있으면 false(continue)
		} else {
		System.out.println("아이디를 삭제합니다.");
		list.remove(index);
		}
		return true;
	}
	
	public static boolean updateMember(ArrayList<Member1> list, Member1 updateTmp) {
		Scanner scan = new Scanner(System.in);
		if(updateTmp == null) {
			return false;
		}
		System.out.println("수정할 회원 정보를 입력하세요.");
		//일치하는 회원 정보가 있으면 비번, 이름, 주민번호, 나이를 입력받고
		System.out.print("비번 : ");
		String pw = scan.next();
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("주민번호 : ");
		String residentNumber = scan.next();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		
		//입력받은 회원 정보를 이용하여 updateTmp를 수정
		updateTmp.update(pw, name, residentNumber, age);
		return true;
	}
}
/*
//=================================================================
 * 							잘못된 풀이
		ArrayList<Map<String,String>> List  = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			HashMap<String, String> userList = new HashMap<String, String>();
			System.out.println("1. 회원 추가");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			int menu = sc.nextInt();
			if (menu == 1) {
				//1. 회원 추가
				// 회원 정보는 아이디, 비번, 이름, 나이, 주민번호로 구성
				System.out.println("아이디 입력 : ");
				String a = sc.next();
				userList.put("Id", a);
				System.out.println("비번 입력 : ");
				String b = sc.next();
				userList.put("Pw", b);
				System.out.println("이름 입력 : ");
				String c = sc.next();
				userList.put("Name", c);
				System.out.println("나이 입력 : ");
				String d = sc.next();
				userList.put("Age", d);
				System.out.println("주민번호 입력 : ");
				String e = sc.next();
				userList.put("Num", e);
				
				System.out.println(userList.get("Id"));
				System.out.println(userList.get("Pw"));
				System.out.println(userList.get("Name"));
				System.out.println(userList.get("Age"));
				System.out.println(userList.get("Num"));
				
				List.add(userList);
			} else if (menu == 2) {
				System.out.println("2. 회원 검색");
				for(int i = 0; i<List.size(); i++) {
					Map<String, String> map = List.get(i);
					System.out.println(map.get("id"));
				}
			} else if (menu == 3) {
				System.out.println("3. 회원 정보 수정");
			} else if (menu == 4) {
				System.out.println("4. 회원 삭제");
			} else {
				System.out.println("잘못된 입력");	
			}

		}
		*/

/*
 * //회원 정보 수정

				System.out.println("수정할 회원 정보의 아이디를 입력하세요.");
				System.out.println("아이디 : ");
				String id = scan.next();
				
				//비번 입력
				System.out.println("비번 : ");
				String pw = scan.next();
				
				//아이디, 비번을 이용하여 객체를 만듬
				Member1 member = new Member1(id, pw);
				
				
				//회원 리스트에서 아이디가 같은 회원 정보를 가져옴
				int index = list.indexOf(member);	//번지를 알려줌
				if(index == -1) {
					continue;
				}
				Member1 tmp = list.get(index);	//값을 가져옴 tmp로
				
				
				//가져온 회원 정보의 비번과 입력한 비번을 비교하여 같으면 회원정보를 보여줌
				if(!tmp.getPw().equals(member.getPw())) {	//tmp에 받은 pw와 member에 있는 pw를 비교해서
					continue;	//있으면 false(continue)
				}
				//같은 회원정보를 보여줌

				System.out.println(list.get(index));
				addMember(list);
				System.out.println("수정이 완료되었습니다.");
				//수정 완료
 */

