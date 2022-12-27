package db.day03.service;

import java.util.Scanner;

import db.day03.DBConnector;
import db.day03.dao.*;
import db.day03.vo.*;

public class ProfessorServiceImp implements ProfessorService {
	
	private ProfessorMapper professorDao;
	private StudentMapper studentDao;
	private Scanner scan = new Scanner(System.in);
	
	public ProfessorServiceImp(DBConnector dbConnector) {
		professorDao = new ProfessorMapper(dbConnector);
		studentDao = new StudentMapper(dbConnector);
	}

	public void insertProfessor() {
		System.out.println("추가할 교수 정보 입력하세요.");
		System.out.println("교번 : ");
		String pr_num = scan.nextLine();
		System.out.println("이름 : ");
		String pr_name = scan.nextLine();
		System.out.println("상태 : ");
		String pr_state = scan.nextLine();
		System.out.println("학부 번호 : ");
		String pr_de_num = scan.nextLine();
		System.out.println("전화번호 : ");
		String pr_tell = scan.nextLine();
		ProfessorVO professorVO = new ProfessorVO(pr_num, pr_name, pr_state, pr_de_num, pr_tell);
		professorDao.insertProfessor(professorVO);
		
		
	}

	public void updateProfessor() {
		System.out.println("수정할 교수 정보 입력하세요.");
		System.out.println("교번 : ");
		String pr_num = scan.nextLine();
		System.out.println("이름 : ");
		String pr_name = scan.nextLine();
		System.out.println("상태 : ");
		String pr_state = scan.nextLine();
		System.out.println("학부 번호 : ");
		String pr_de_num = scan.nextLine();
		System.out.println("전화번호 : ");
		String pr_tell = scan.nextLine();
		ProfessorVO professorVO = new ProfessorVO(pr_num, pr_name, pr_state, pr_de_num, pr_tell);
		professorDao.updateProfessor(professorVO);
		
	}

	public void updateAdvisor() {
		System.out.print("교수 번호 :");
		String st_pr_num = scan.nextLine();
		System.out.println("학번 : ");
		String st_num = scan.nextLine();
		StudentVO std = studentDao.selectStudent(st_num);
		if(std == null) {
			System.out.println("없는 학번이어서 지도 교수 수정에 실패했습니다.");
			return;
		} else {
			std.setSt_pr_num(st_pr_num);
			studentDao.updateStudent(std);
		}
		
	
	}
}
