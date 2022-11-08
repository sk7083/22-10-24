package day12;

import java.util.Scanner;

public class StudentManagerTest {

	public static void main(String[] args) {
		/* 학생 성적 관리 프로그램을 작성하세요.
		 * - 작성하기 위해 필요한 작업들을 주석으로 정리해보세요.
		 * */
		/* TvRemoteController remocon1 = new TvremoconA();*/
		HighStudent ioi1 = new HighStudent();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("=============================메뉴=============================");
			System.out.print("1. 학생 정보 추가 | ");
			System.out.print("2. 학생 성적 추가 | ");
			System.out.print("3. 학생 정보 출력 | ");
			System.out.println("4. 프로그램 종료");
			System.out.println("=============================================================");
			System.out.println();
			System.out.println("메뉴를 선택해주세요 : ");		
		
			int number = sc.nextInt();

			if (number == 1) {
				System.out.println("학생 정보를 추가합니다.");
				//ioi1.HighStudentInformation();
				
				break;
			} else if (number == 2) {
				System.out.println("학생 성적을 추가합니다.");
				
				break;
			} else if (number == 3) {
				System.out.println("학생 정보를 출력합니다.");
				
				break;
			} else if (number == 4) {
				System.out.println("프로그램을 종료합니다.");
				
				break;
			} else {
				System.out.println("잘못된 입력입니다!!");
				System.out.println("다시 입력하세요.");
			}
			
		
		}
		

	}
}

//================================================================
// 학생 정보를 관리하는 class
class HighStudent {
	static int grade;			//학년
	static int studentClass;	//반
	static int studentNum;		//번호
	static String studentName;	//이름
	
	// 학생 class중 학생들의 정보를 출력하는 메소드(기능)
	public static void HighStudentInsert(int grade, int studentClass, int studentNum) {
		Scanner sc = new Scanner(System.in);

		System.out.println("학년 : "+grade);
		System.out.println("반 : "+studentClass);
		System.out.println("번호 : "+studentNum);

		sc.close();
		
	}


	// 학생 정보를 조회하는 메소드(기능)
	public static int HighStudentInformation() {
		return 1;
	}
}

/*
* 기능
* 2-1. 학생 정보 추가
* 	- 학년, 반, 번호, 이름을 입력하여 학생 정보 추가
* 	- 학년, 반, 번호가 같은 학생이 이미 있으면 추가하지 않음 (중복X)
*
* 2-2. 학생 성적 추가
* 	- 학년, 반, 번호로 학생을 검색 한 후 있으면 성적을 추가
*	- 성적 추가 시 과목명, 학기, 중간, 기말, 수행 평가를 입력하여 추가한다.
*	- 이미 추가된 과목(학기랑 과목명이 같으면)이면 추가하지 않음
**/
//================================================================
// 성적을 관리하는 class
class Score {
	// Score Class중 성적을 입력하는 메소드(기능)
	public static void ScoreInsert() {

	}
	
	// 성적을 조회하는 메소드(기능)
	public static int ScoreInformation() {
		return 1;
	}

}
		
		
		//메뉴 선택
	
		//선택한 메뉴에 따른 기능 실행
		//1. 학생 정보 추가
			//학생 정보를 입력(학년, 반, 번호, 이름)
			//입력한 학생 정보가 없으면 추가
		//2.학생 성적 추가
			//학생 정보를 입력(학년, 반, 번호, 이름)
			//입력한 학생 정보가 없으면 끝
		
		
		
		
		
		
		/*
		 * 1. 프로그램에 필요한 기능을 정리
		 * 메뉴
		 * 1. 학생 정보 추가
		 * 2. 학생 성적 추가
		 * 3. 학생 정보 출력
		 * 4. 프로그램 종료
		 * 
		 * 
		 * 2. 프로그램 실행 과정은 어떻게 할 건지?
		 * 
		 * 기능
		 * 2-1. 학생 정보 추가
		 * 	- 학년, 반, 번호, 이름을 입력하여 학생 정보 추가
		 * 	- 학년, 반, 번호가 같은 학생이 이미 있으면 추가하지 않음 (중복X)
		 *
		 * 2-2. 학생 성적 추가
		 * 	- 학년, 반, 번호로 학생을 검색 한 후 있으면 성적을 추가
		 *	- 성적 추가 시 과목명, 학기, 중간, 기말, 수행 평가를 입력하여 추가한다.
		 *	- 이미 추가된 과목(학기랑 과목명이 같으면)이면 추가하지 않음
		 * 
		 * 2-3. 학생 정보 출력
		 * 
		 * 3. 정보를 효율적으로 관리하기 위해 클래스를 만들것인가?
		 * 만든다면 어떤 클래스를 만들것인가
		 * 	- 학생 클래스 HighStudent
		 * 	- 성적 클래스 Score
		 * 
		 * 4. 프로그램 실행 과정을 주석으로 작성
		 * */


