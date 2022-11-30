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
			
			for(Member tmp : memberList) {
				if(tmp.getId().equals(id) && tmp.getPw().equals(pw)) {
					System.out.println("==========[게시글 관리 프로그램]=========="+"\n");
					System.out.println("로그인되었습니다."+"\n");
					return true;
				}
		}
			System.out.println(" ID 또는 PW 가 잘못되었습니다. ");
			return false;
	}

	public static ArrayList<Member> membership(ArrayList<Member> memberList){
			System.out.println("[회원가입 진행]");
			System.out.println("이름 : ");
			String name = sc.nextLine();
			System.out.println("ID : ");
			String id = sc.nextLine();
			System.out.println("PW : ");
			String pw = sc.nextLine();
			System.out.println("생년월일 : ");
			int birth = sc.nextInt();
			System.out.println("전화번호 : ");
			sc.nextLine();
			String phone = sc.nextLine();
			if(memberList.size() == 0) {
				int grade = 1;
				Member member = new Member(name, phone, pw, id, birth, grade);
				memberList.add(member);
				System.out.println("[ ★관리자 회원가입 완료]");
				return memberList;
			} else {
				int grade = 0;
				for(Member tmp : memberList) {
					if(tmp.getId().equals(id)) {
						System.out.println("중복된 ID입니다.");
						return null;
					}
				}
				Member member = new Member(name, phone, pw, id, birth, grade);
				memberList.add(member);
				System.out.println("[회원가입 완료]");
				return memberList;
			}
			
	}
}
