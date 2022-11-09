package day13;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManagerTest2 {

	public static void main(String[] args) {
		/* 학생 성적 관리 프로그램을 작성하세요.
		 * - 작성하기 위해 필요한 작업들을 주석으로 정리해보세요.
		 * */
		/* TvRemoteController remocon1 = new TvremoconA();*/

		Scanner sc = new Scanner(System.in);
		Student [] stds = new Student[30];
		int count = 0;
		int menu = -1;
		while (menu != 4) {
			printMenu();

			int number = sc.nextInt();
			
			count = runMenu(number, stds, count);	//
			
			
		
		}
		

	}

	private static int runMenu(int number, Student[] stds, int count) {
		Scanner sc = new Scanner(System.in);
		if (number == 1) {
			
			//학생 정보를 입력(학년, 반, 번호, 이름)
			
			if(addStudent(stds, count)) {
				System.out.println("학생을 추가했습니다.");
			} else {
				System.out.println("학생을 추가하지 못했습니다.");
			}
			
		} else if (number == 2) {


			if(addScore(stds, count)) {
				System.out.println("성적을 등록했습니다.");
			} else {
				System.out.println("성적 등록에 실패했습니다.");
			}
		} else if (number == 3) {
			printStudentList(stds, count);

		} else if (number == 4) {
			System.out.println("프로그램을 종료합니다.");

		} else {
			System.out.println("잘못된 입력입니다!!");
			System.out.println("다시 입력하세요.");
		}
		return count;
	}

	private static void printStudentList(Student[] stds, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(stds[i]);
			stds[i].printScore();
		}
	}

	private static boolean addScore(Student[] stds, int count) {

		
		System.out.println("학생 성적을 추가합니다.");
		//2. 학생 성적 추가
		//학생 정보를 입력(학년, 반, 번호)
		System.out.println("성적을 추가할 학생 정보를 입력합니다.");

		Student tmp = scanStudentBaseInfo();
		//입력한 학생 정보가 없으면 끝
		//학생 정보들 중에서 하나씩 비교하여 학년, 반, 번호가 같은 학생이 있는지 확인해서
		//없으면 조건문 종료 (contienu)

		int index = indexOfStudent(stds, count, tmp);
		
		if(index == -1) {
			return false;
		}

	
		System.out.println("성적 정보를 입력하세요.");

		
		return stds[index].addScore(scanScore());
	}

	private static boolean addStudent(Student[] stds, int count) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보를 추가합니다.");
		Student tmp = scanStudentBaseInfo();

		System.out.print("이름 : ");
		tmp.setName(sc.next());
		
		int index = indexOfStudent(stds, count, tmp);
		
		if(index == -1 && count < stds.length) {
			stds[count] = tmp;
			return true;
		}
		return false;
	}

	private static Score scanScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("과목 : ");
		String title = sc.next();
		System.out.println("학기 : ");
		int term = sc.nextInt();
		System.out.println("중간 : ");
		int midScore = sc.nextInt();
		System.out.println("기말 : ");
		int finalScore = sc.nextInt();
		System.out.println("수행평가 : ");
		int performace = sc.nextInt();
		return new Score(title, term, midScore, finalScore, performace);
	}

	private static Student scanStudentBaseInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int classNum = sc.nextInt();
		System.out.print("번호 : ");
		int num = sc.nextInt();
		return new Student(grade, classNum, num);
	}

	private static int indexOfStudent(Student[] stds, int count, Student tmp) {
		for (int i = 0; i < count; i++) {
			if (stds[i].equals(tmp)) {
				return i; // 일치하는 학생의 위치(번지)
			}
		}
		return -1;
	}

	private static void printMenu() {
		System.out.println("=============================메뉴=============================");
		System.out.print("1. 학생 정보 추가 | ");
		System.out.print("2. 학생 성적 추가 | ");
		System.out.print("3. 학생 정보 출력 | ");
		System.out.println("4. 프로그램 종료");
		System.out.println("=============================================================");
		System.out.println();
		System.out.println("메뉴를 선택해주세요 : ");		
		
	}
}

//================================================================



