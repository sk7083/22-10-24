package db.day03.service;

import java.util.Scanner;

import db.day03.DBConnector;
import db.day03.dao.CourseMapper;
import db.day03.dao.ProfessorMapper;
import db.day03.dao.StudentMapper;
import db.day03.vo.LectureVO;

public class CourseServiceImp implements CourseService {
	
	private CourseMapper courseDao;
	private Scanner scan = new Scanner(System.in);

	public CourseServiceImp(DBConnector dbConnector) {
		courseDao = new CourseMapper(dbConnector);

	}

	public void insertLecture() {
		System.out.print("강좌명 : ");
		String le_name = scan.nextLine();
		System.out.println("일정 : ");
		String le_shedulre = scan.nextLine();
		System.out.println("학점 : ");
		int le_point = scan.nextInt();
		scan.nextLine();
		System.out.println("분반 : ");
		int le_class = scan.nextInt();
		scan.nextLine();
		System.out.println("연도 : ");
		int le_year = scan.nextInt();
		scan.nextLine();
		System.out.println("학기 : ");
		String le_term = scan.nextLine();
		
		System.out.println("지도 교수 번호 : ");
		String le_pr_num = scan.nextLine();
		LectureVO lecture = new LectureVO(0, le_name, le_shedulre, le_point, le_class, le_year, le_term, le_pr_num);
		CourseDao.insertLecture(lecture);
	}
}
