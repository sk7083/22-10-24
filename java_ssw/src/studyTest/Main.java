package studyTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

	// 선우 마트
	//ArrayList <Member> swMart = new ArrayList<Member>(); 에 회원 관련된 정보들은 전부 저장.
	ArrayList <Member> swMart = new ArrayList<Member>();
	Mart mart = new Mart();
	int menu = 0;
	
	do {

		System.out.println("===========메뉴===========");
		System.out.println("1. 마트 회원가입");
		System.out.println("2. 마트 회원조회");
		System.out.println("3. 마트 회원수정");
		System.out.println("4. 영수증 등록");
		System.out.println("5. 랭킹 조회");
		System.out.println("6. 종료");
		menu = sc.nextInt();
		switch (menu) {
		case 1:
			swMart.add(mart.register());
			break;
		case 2:
			//마트 회원 조회
			mart.memberInfoList(swMart);
			break;
		case 3:
			//마트 회원 수정
			HashMap<String, Object> hash = mart.memberInfoUpdate(swMart);
			swMart.set((int)hash.get("index"),(Member)hash.get("member"));
			break;
		case 4:
			//영수증 등록
			HashMap<String, Object> hash1 = mart.insertBill(swMart);
			swMart.set((int)hash1.get("index"),(Member)hash1.get("member"));
			break;
		case 5:
			//랭킹 조회
			
			break;
		case 6:
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	} while(menu != 6);
	// 선우 마트
	//ArrayList <Member> swMart = new ArrayList<Member>(); 에 회원 관련된 정보들은 전부 저장.
	
	//1.마트 회원가입 (member Class 사용)
			//회원정보는 이름, 나이, 주소, 핸드폰 번호, 포인트
	
	//2.마트 회원 조회 (Mart Class 사용)
	
	
	//3.마트 회원 검색 후 회원정보 수정(Mart Class 사용)
	
	
	//4.마트 회원에 구매한 일별 영수증 입력 기능(Mart Class 사용, 영수증 정보 보관은 Map을 사용)
	
	
			//4-1.구매한 영수증 등록 시 총액의 2% 만큼 회원 정보 Point에 추가.(Mart Class 사용, 영수증 정보 보관은 Map을 사용)
	
	
	//5.마트 포인트 랭킹 출력.(Mart Class 사용, 출력은 등수/이름/포인트점수 ) 
	}
}
