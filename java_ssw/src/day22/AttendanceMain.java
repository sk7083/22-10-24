package day22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import studyTest.Member;

public class AttendanceMain {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList <Student> list = new ArrayList<Student>();
		int index =0;
		/* 출석부 관리 프로그램
		 * 1. 학생 등록
		 * - 이름과 생년월일
		 * 
		 * 2. 학생 수정
		 * - 이름과 생년월일로 검색해서 이름과 생년월일 수정
		 * 
		 * 3. 학생 삭제
		 * - 이름과 생년월일로 검색해서 삭제
		 * 
		 * 4. 학생 출결 확인
		 * - 이름과 생년월일을 검색해서 해당 학생의 모든 출결을 확인
		 * - 2022-11-22 : O
		 * 
		 * 5. 출석 확인
		 * - 날짜 입력 : 2022-11-22
		 * - 출석 : O, 지각 : /, 조퇴 : \,  결석 : X
		 * 
		 * 6. 출석 수정 
		 * - 날짜 입력
		 * - 수정할 학생의 이름과 생년월일 입력
		 * 
		 * 7. 출석 삭제
		 * - 날짜 입력하여 해당 날짜 출석 삭제
		 * 
		 * 8. 날짜별 출석 확인
		 * - 날짜 입력하여 해당 날짜의 모든 학생의 출석 여부를 확인
		 * 
		 * 9. 프로그램 종료
		 * 
		 * 출력 화면
		 * 홍길동 출석현황 : (O, /, \, X 중 사용자가 입력)
		 * 
		 */
		
		/* 학생(Student) 관리 클래스 : 이름, 생년월일
		 * 학생 일지(StudentLog) 클래스 : 이름, 생년월일, 출결
		 * 일지(Log) 클래스 : 날짜, 학생일지들 (이름, 생년월일, 출결)
		 * 출석부(Attendance) 클래스 : 학생들, 일지들
		 * 메소드 : 메뉴 출력 / 선택 메뉴에 따른 동작 / 학생 이름 및 생년월일 
		 * */
		int menu = 0;
		
		do {
			printMenu();
			menu = sc.nextInt();
			switch(menu) {
			case 0:
				studentInfoList(list);	//등록된 학생 명단
				break;
			case 1:
				// 1. 학생 등록
				insertStudent(list);	//학생 등록하는 메소드
				break;
			case 2:
				// 2. 학생 수정
				studnetInfo(list, index);	//학생 정보 수정하는 메소드
				break;
			case 3:
//				3. 학생 삭제
//				 * - 이름과 생년월일로 검색해서 삭제
				break;
			case 4:
//				4. 학생 출결 확인
//				 * - 이름과 생년월일을 검색해서 해당 학생의 모든 출결을 확인
//				 * - 2022-11-22 : O
				break;
			case 5:
//				5. 출석 확인
//				 * - 날짜 입력 : 2022-11-22
//				 * - 출석 : O, 지각 : /, 조퇴 : \,  결석 : X
				break;
			case 6:
//				6. 출석 수정 
//				 * - 날짜 입력
//				 * - 수정할 학생의 이름과 생년월일 입력
				break;
			case 7:
//				7. 출석 삭제
//				 * - 날짜 입력하여 해당 날짜 출석 삭제
				break;
			case 8:
//				8. 날짜별 출석 확인
//				 * - 날짜 입력하여 해당 날짜의 모든 학생의 출석 여부를 확인
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default :
				System.out.println("잘못된 입력입니다.");
			}
			
		} while (menu != 9);
	}
//=================================================================
	//등록된 학생의 정보를 수정하는 메소드
	private static ArrayList<Student> studnetInfo(ArrayList<Student> list, int index) {
		//등록된 학생 정보를 불러온다.
		studentInfoList(list);
		System.out.println("==================================");
		//등록된 학생 중 수정이 필요한 학생를 선택
		System.out.println("=========수정할 학생 정보 입력==========");
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("생년월일 입력 : ");
		String birth = sc.next();
		Student stu = new Student(name, birth);
		//선택한 학생의 정보를 수정 작업
		
		
		if (stu.getName().equals(name)) {
			
			stu.getName().indexOf(name);
			System.out.println("index 값 : "+index);
			System.out.println("=========학생 정보 수정==========");
			System.out.println("이름 입력 : ");
			String pname = sc.next();
			System.out.println("생년월일 입력 : ");
			String pbirth = sc.next();
			Student stu1 = new Student(pname, pbirth);
			list.set(index, stu1);
			System.out.println(list);
			//뭘 넣을껀데?
			//내가 입력한 name / birth
			//어디에?
			//이름이 같은 값을 내가 새로 입력한 name과 birth에 넣을꺼야
			
			//수정한 학생 정보 등록
			
			//수정 완료
			System.out.println("수정이 완료되었습니다.");
			System.out.println(list);
			return list;
		} else {
			System.out.println("해당 학생은 존재하지 않습니다.");
			return null;
		}



	}

//=================================================================
	private static void studentInfoList(ArrayList<Student> list) {
		//학생 정보 출력
		System.out.println("==============학생 명단==============");
		for(int i = 0; i<list.size(); i++) {
			//list에 입력된 학생 정보 모두 출력
			System.out.println(list.get(i));
		}
	}
	
//=================================================================
	private static ArrayList <Student> insertStudent(ArrayList <Student> list) {
		//- 이름과 생년월일
		System.out.println("이름 입력 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.println("생년월일 입력 : ");
		String birth = sc.next();
		Student stu = new Student(name, birth);
		list.add(stu);
		System.out.println("학생이 등록되었습니다.");
		return list;
	}
//=================================================================
	public static void printMenu() {
		System.out.println("================메뉴================");
		System.out.print("1. 학생 등록  |");
		System.out.print(" 2. 학생 수정  |");
		System.out.println(" 3. 학생 삭제");
		System.out.print("4. 출결 확인  |");
		System.out.print(" 5. 출석 확인  |");
		System.out.println(" 6. 출석 수정");
		System.out.print("7. 출석 삭제  |");
		System.out.print(" 8. 날짜별 출석 확인  |");
		System.out.print(" 9. 프로그램 종료  |");
		System.out.println(" 0. 등록된 학생 명단");
		System.out.println("==================================");
	}
//=================================================================
}
