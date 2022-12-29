package db.day03;

import java.util.Scanner;
import db.day03.service.*;
public class UniversityController {
	private Scanner scan = new Scanner(System.in);
	private DBConnector dbConnector;
	private StudentServiceImp studentService;
	private ProfessorServiceImp professorService;
	private CourseServiceImp courseService;

	{
		String url = "jdbc:mysql://localhost/university";
		String id = "root", pw = "root";
		dbConnector = new DBConnector(url, id, pw);
		studentService = new StudentServiceImp(dbConnector);
		professorService = new ProfessorServiceImp(dbConnector);
		courseService = new CourseServiceImp(dbConnector);
	}

	public void run() {
		int menu = -1;
		int exit = 5;
		
		do {
			printMenu();
			menu = scan.nextInt();
			scan.nextLine();
			runMenu(menu);
		}while(menu != exit);
		
		dbConnector.close();
	}
	private void runMenu(int menu) {
		int submenu = -1;
		switch(menu) {
		case 1:
			printStudentMenu();
			submenu = scan.nextInt();
			scan.nextLine();
			runStudentMenu(submenu);
			break;
		case 2:
			printProfessorMenu();
			submenu = scan.nextInt();
			scan.nextLine();
			runProfessorMenu(submenu);
			break;
		case 3:
			printCourseMenu();
			submenu = scan.nextInt();
			scan.nextLine();
			runCourseMenu(submenu);
			break;
		default:
			System.out.println("잘못된 메뉴");
		}
	}





	private void runCourseMenu(int submenu) {
		switch(submenu) {
		case 1:
			courseService.insertLecture();
			break;
		case 2:
			courseService.updateLecture();
			break;
		case 3:
			courseService.deleteLecture();
			break;
		case 4:
			courseService.insertCourse();
			break;
		case 5:
			courseService.deleteCourse();
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}

	}

	private void runProfessorMenu(int submenu) {
		switch(submenu) {
		case 1:
			professorService.insertProfessor();
			break;
		case 2:
			professorService.updateProfessor();
			break;
		case 3:
			professorService.updateAdvisor();
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}
		
	}
	private void runStudentMenu(int submenu) {
		switch(submenu) {
		case 1:
			studentService.insertStudent();
			break;
		case 2:
			studentService.updateStudent();
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}

	}

	private void printCourseMenu() {
		System.out.println("수강 관리 메뉴");
		System.out.println("1. 강좌 등록");
		System.out.println("2. 강좌 수정");
		System.out.println("3. 강좌 삭제");
		System.out.println("4. 수강 신청");
		System.out.println("5. 수강 취소");
		System.out.println("6. 취소");
		System.out.print("메뉴 선택 : ");
	}

	private void printProfessorMenu() {
		System.out.println("학생 관리 메뉴");
		System.out.println("1. 교수 추가");
		System.out.println("2. 교수 수정");
		System.out.println("3. 지도 학생 등록");
		System.out.println("4. 취소");
		System.out.print("메뉴 선택 : ");
		
	}
	
	private void printStudentMenu() {
		System.out.println("학생 관리 메뉴");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 수정");
		System.out.println("3. 취소");
		System.out.print("메뉴 선택 : ");
	}
	private void printMenu() {
		System.out.println("전체 메뉴");
		System.out.println("1. 학생 관리");
		System.out.println("2. 교수 관리");
		System.out.println("3. 수강 관리");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
	}
	
}