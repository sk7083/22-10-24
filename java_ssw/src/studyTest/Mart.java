package studyTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import studyTest.Bill;

public class Mart {
	Scanner sc = new Scanner(System.in);
	
	public Mart() {
		// TODO Auto-generated constructor stub
	}
	
	public Member register() {
		Member member = new Member();
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 정보를 입력하세요.");
		//마트 회원 가입
		//1.마트 회원가입 (member Class 사용)
		//회원정보는 이름, 나이, 주소, 핸드폰 번호, 포인트
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		System.out.println("주소 : ");
		String address = sc.next();
		System.out.println("핸드폰 번호 : ");
		String tel = sc.next();
		
		member.setName(name);
		member.setAge(age);
		member.setAddress(address);
		member.setTel(tel);

		return member;
	}
	
	public void memberInfoList(ArrayList <Member> memberList) {
		System.out.println("이름 입력 : ");
		String name = sc.next();
		for(Member mem : memberList) {
			if(mem.getName().equals(name)) {
				memberInfo(mem);
			}
		}
	}
	
	public void memberInfo(Member mem) {
		System.out.println(mem);
		
	}
	
	public HashMap<String, Object> memberInfoUpdate(ArrayList <Member> memberList) {
		HashMap<String, Object> hash = new HashMap<String, Object>();
		System.out.println("이름 입력 : ");
		String name = sc.next();
		for(int i =0; i<memberList.size(); i++) {
			Member mem = memberList.get(i);
			if(mem.getName().equals(name)) {
				mem = register();
				hash.put("index", i);
				hash.put("member", mem);
			}
		}
		return hash;
	}
	
	public HashMap<String, Object> insertBill(ArrayList <Member> memberList) {
		HashMap<String, Object> hash = new HashMap<String, Object>();
		System.out.println("이름 입력 : ");
		String name = sc.next();
		for(int i =0; i<memberList.size(); i++) {
			Member mem = memberList.get(i);
			if(mem.getName().equals(name)) {
				ArrayList<Bill> billList = mem.getBill();
				Bill newBill = new Bill();
				System.out.println("날짜 입력 : ");
				String billDate = sc.next();
				System.out.println("품목 입력 : ");
				String billPrd = sc.next();
				System.out.println("돈 입력 : ");
				int billPrice = sc.nextInt();
				
				newBill.setDate(billDate);
				newBill.setProduct(billPrd);
				newBill.setPrice(billPrice);
				
				billList.add(newBill);
				mem.setBill(billList);
				
				mem.setPoint(mem.getPoint()+((billPrice/100)*2));
				
				hash.put("index", i);
				hash.put("member", mem);
			}
		}
		return hash;
	}
	
	
	// 선우 마트
	//ArrayList <Member> swMart = new ArrayList<Member>(); 에 회원 관련된 정보들은 전부 저장.
	
	//1.마트 회원가입 (member Class 사용)
			//회원정보는 이름, 나이, 주소, 핸드폰 번호, 포인트
	
}
