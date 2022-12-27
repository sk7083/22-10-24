package db.day03.service;

import java.util.Scanner;

import db.day03.DBConnector;
import db.day03.dao.StudentDAO;
import db.day03.dao.StudentMapper;
import db.day03.vo.StudentVO;

public class StudentServiceImp implements StudentService {


	private StudentMapper studentDao;
	private Scanner scan = new Scanner(System.in);
	
	public StudentServiceImp(DBConnector dbConnector) {
		studentDao = new StudentMapper(dbConnector);
	}

	public void insertSudent() {
		System.out.println("추가할 학생 정보 입력하세요.");
		System.out.println("학번 : ");
		String st_num = scan.nextLine();
		System.out.println("이름 : ");
		String st_name = scan.nextLine();
		System.out.println("학기 : ");
		int st_semester = scan.nextInt();
		scan.nextLine();
		System.out.println("상태 : ");
		String st_state = scan.nextLine();
		System.out.println("지도 교수 번호 : ");
		String st_pr_num = scan.nextLine();
		StudentVO std = new StudentVO(st_num, st_name, st_semester, st_state, st_pr_num);
		studentDao.insertStudent(std);
		
	}

	public void updateStudent() {
		System.out.println("수정할 학생 정보 입력하세요.");
		System.out.println("학번 : ");
		String st_num = scan.nextLine();
		System.out.println("이름 : ");
		String st_name = scan.nextLine();
		System.out.println("학기 : ");
		int st_semester = scan.nextInt();
		scan.nextLine();
		System.out.println("상태 : ");
		String st_state = scan.nextLine();
		System.out.println("지도 교수 번호 : ");
		String st_pr_num = scan.nextLine();
		StudentVO std = new StudentVO(st_num, st_name, st_semester, st_state, st_pr_num);
		studentDao.updateStudent(std);
		
	}

}
