package day27;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberManager {
	
	public MemberManager() {
	}
	
	static Scanner sc = new Scanner(System.in); 
	
	
	public static Boolean memberLogin(ArrayList<Member> memberList) {
		if(memberList.size() == 0) {
			System.out.println("회원 등록 후 다시 로그인해주세요.");
			return false;
		}
		System.out.println("ID 입력 : ");
		String id = sc.nextLine();
		System.out.println("PW 입력 : ");
		String pw = sc.nextLine();
		Member memberCheck = new Member(pw, id);
		
		if(memberCheck.getId().trim().equals(id) && memberCheck.getPw().trim().equals(pw)) {
			System.out.println("==========[게시글 관리 프로그램]=========="+"\n");
			System.out.println("환영합니다. "+ memberCheck.getId()+"님!"+"\n");
			return true;
		} else {
			System.out.println(" ID 또는 PW 가 잘못되었습니다. ");
			return false;
		}
	}

	public static ArrayList<Member> membership(ArrayList<Member> memberList){
			System.out.println("[회원가입 진행]");
			System.out.println("이름 : ");
			String name = sc.nextLine();
			System.out.println("생년월일 : ");
			int birth = sc.nextInt();
			System.out.println("전화번호 : ");
			String phone = sc.nextLine();
			sc.nextLine();
			System.out.println("ID : ");
			String id = sc.nextLine();
			System.out.println("PW : ");
			String pw = sc.nextLine();
			Member member = new Member(name, phone, pw, id, birth);
			memberList.add(member);
			System.out.println("[회원가입 완료]");
			System.out.println(memberList);
		return memberList;
	}
}
