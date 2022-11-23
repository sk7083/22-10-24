package day22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import day17.Board;
import studyTest.Member;

public class AttendanceMain {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList <Student> list = new ArrayList<Student>();
		ArrayList <Log> log = new ArrayList<Log>();
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
				studnetInfo(list);	//학생 정보 수정하는 메소드
				break;
			case 3:
//				3. 학생 삭제
				studnetDelete(list);
				break;
			case 4:
//				4. 학생 출결 확인
//				 * - 이름과 생년월일을 검색해서 해당 학생의 모든 출결을 확인
//				 * - 2022-11-22 : O
				break;
			case 5:
//				5. 출석 확인
				studentCheck(list, log);
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
	//출석 체크
/*	 5. 출석 체크
	- 날짜 입력 : 2022-11-22
	- 출석 : O, 지각 : /, 조퇴 : \,  결석 : X*/
	private static ArrayList <Log> studentCheck(ArrayList<Student> list, ArrayList <Log> log) {
		//예외 처리
		if (list.size() == 0 || list == null) {
			System.out.println("등록된 학생이 없습니다.");
			return null;
		}
		for(int i=0; i<list.size(); i++) {
		//출석체크할 날짜 입력
		sc.nextLine();
		System.out.println("날짜 입력(xx-xx-xx) : ");
		String date = sc.nextLine();
		
		//학생 명단 출력
		studentInfoList(list);
		System.out.println("==================================");
		System.out.println();
		
		//이름, 생년월일 검색
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("생년월일 입력 : ");
		String birth = sc.next();
		
		System.out.println("출석 : O, 지각 : /, 조퇴 : \\,  결석 : X");
		System.out.println("출석 여부 : ");
		String attendance = sc.next();
		
		Log stulog = new Log(date, name, birth, attendance);
		
		if(attendance == "o" || attendance == "O") {
			System.out.println(name + " 학생 출석했습니다.");
			
		} else if (attendance == "x" || attendance == "X") {
			System.out.println(name + " 학생 지각했습니다.");
			
		}
		log.add(stulog);
		System.out.println(log);
		System.out.println();
	
		//출석 : O, 지각 : /, 조퇴 : \,  결석 : X 중 선택하여
		//선택한 사항에 맞게 출력 ex) O의 경우 출석하였습니다.
		
		//저장된 사항은 StudentLog에 저장
		
	}
		return log;
}

//=================================================================
	// 등록된 학생의 정보를 삭제하는 메소드
	private static ArrayList<Student> studnetDelete(ArrayList<Student> list) {
		// 예외 처리 (학생이 없을 경우)
		if (list.size() == 0 || list == null) {
			System.out.println("등록된 학생이 없습니다.");
			return null;
		}
		// 등록된 학생 정보를 불러온다.
		studentInfoList(list);
		System.out.println("==================================");
		System.out.println();
		// 등록된 학생 중 수정이 필요한 학생를 선택
		System.out.println("=========삭제할 학생 정보 입력==========");
		try {
			System.out.println("이름 입력 : ");
			String name = sc.next();
			System.out.println("생년월일 입력 : ");
			String birth = sc.next();

			Student stu = new Student(name, birth);

			if (stu.getName().trim().equals(name) && stu.getBirth().trim().equals(birth)) {

				int Index = 0;
				Index = list.indexOf(stu);
				list.remove(Index);
				System.out.println("삭제가 완료되었습니다.");
			} else {
				System.out.println("해당 학생은 없습니다.");
				return null;
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("에러 발생 : 잘못된 입력입니다!");
		}
		return list;
	}
//=================================================================
		// 등록된 학생의 정보를 수정하는 메소드
		private static ArrayList<Student> studnetInfo(ArrayList<Student> list) {
			// 예외 처리 (학생이 없을 경우)
			if (list.size() == 0 || list == null) {
				System.out.println("등록된 학생이 없습니다.");
				return null;
			}
			// 등록된 학생 정보를 불러온다.
			studentInfoList(list);
			System.out.println("==================================");
			System.out.println();
			// 등록된 학생 중 수정이 필요한 학생를 선택
			System.out.println("=========수정할 학생 정보 입력==========");
			try {
				
				System.out.println("이름 입력 : ");
				String name = sc.next();
				System.out.println("생년월일 입력 : ");
				String birth = sc.next();
				Student stu = new Student(name, birth);

				if (stu.getName().trim().equals(name) && stu.getBirth().trim().equals(birth)) {

					int Index = 0;
					Index = list.indexOf(stu);
					System.out.println("==========수정 정보 입력===========");
					System.out.println("이름 입력 : ");
					name = sc.next();
					System.out.println("생년월일 입력 : ");
					birth = sc.next();
					stu.setName(name);
					stu.setBirth(birth);
					list.set(Index, stu);

				} else {
					System.out.println("해당 학생은 없습니다.");
					return null;
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println("에러 발생 : 잘못된 입력입니다!");
			}

			return list;
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
	//학생을 등록하는 메소드
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
